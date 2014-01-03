package eu.socialsensor.framework.client.dao.impl;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import eu.socialsensor.framework.client.dao.MediaItemDAO;
import eu.socialsensor.framework.client.mongo.MongoHandler;
import eu.socialsensor.framework.client.mongo.Selector;
import eu.socialsensor.framework.client.mongo.UpdateItem;
import eu.socialsensor.framework.common.domain.MediaItem;
import eu.socialsensor.framework.common.factories.ItemFactory;

public class MediaItemDAOImpl implements MediaItemDAO {

    List<String> indexes = new ArrayList<String>();

    private static String db = "Streams";
    private static String collection = "MediaItems";
    private MongoHandler mongoHandler;


    public MediaItemDAOImpl(String host) {
        this(host, db, collection);
    }

    public MediaItemDAOImpl(String host, String db) {
        this(host, db, collection);
    }

    public MediaItemDAOImpl(String host, String db, String collection) {
        indexes.add("id");
        indexes.add("publicationTime");
        indexes.add("url");
        try {
            mongoHandler = new MongoHandler(host, db, collection, indexes);
            mongoHandler.sortBy("publicationTime", MongoHandler.DESC);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void addMediaItem(MediaItem item) {
        mongoHandler.insert(item);
    }

    @Override
    public void updateMediaItem(String id, String name, Object value) {
        UpdateItem changes = new UpdateItem();
        changes.setField(name, value);
        mongoHandler.update("id", id, changes);
    }

    @Override
    public boolean removeMediaItem(String mediaItemId) {
        return mongoHandler.delete("id", mediaItemId);
    }

    @Override
    public MediaItem getMediaItem(String mediaItemId) {
        String json = mongoHandler.findOne("id", mediaItemId);
        return ItemFactory.createMediaItem(json);
    }

    @Override
    public List<MediaItem> getLastMediaItems(int n) {
        Selector query = new Selector();
        List<String> results = mongoHandler.findMany(query, n);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }
        return mediaItems;
    }

    @Override
    public List<MediaItem> getLastMediaItems(long fromDate) {
        Selector query = new Selector();
        query.selectGreaterThan("publicationTime", fromDate);
        List<String> results = mongoHandler.findMany(query, 0);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }
        return mediaItems;
    }

    public static void main(String[] args) {

        
    }

    @Override
    public void updateMediaItem(MediaItem item) {
        mongoHandler.update("id", item.getId(), item);
    }

    @Override
    public void updateMediaItemPopularity(MediaItem item) {
    	boolean update = false;
    	UpdateItem changes = new UpdateItem();

        if(update) {
        	mongoHandler.update("id", item.getId(), changes);
        }
        
    }

    @Override
    public void updateMediaItemDyscoId(String url, String dyscoId) {
        UpdateItem changes = new UpdateItem();

        changes.setField("dyscoId", dyscoId);
        mongoHandler.update("url", url, changes);

    }

    @Override
    public boolean exists(MediaItem mediaItem) {
        return mongoHandler.exists("reference", mediaItem.getRef());
    }

    @Override
    public boolean exists(String id) {
        return mongoHandler.exists("id", id);
    }
    
    @Override
    public List<MediaItem> getLastMediaItemsWithGeo(int size) {
        Selector query = new Selector();
        query.exists("location.coordinates");
        List<String> results = mongoHandler.findMany(query, size);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }
        return mediaItems;
    }

    @Override
    public List<MediaItem> getLastMediaItemsWithGeo(long fromDate) {
        Selector query = new Selector();
        query.selectGreaterThan("publicationTime", fromDate);
        query.exists("location.coordinates");
        List<String> results = mongoHandler.findMany(query, 0);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }
        return mediaItems;
    }

    @Override
    public List<MediaItem> getLastNIndexedMediaItems(int size) {
        Selector query = new Selector();
        query.select("indexed", true);
        List<String> results = mongoHandler.findMany(query, size);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }
        return mediaItems;
    }

    @Override
    public List<MediaItem> getRecentIndexedMediaItems(long fromDate) {
        Selector query = new Selector();
        query.selectGreaterThan("publicationTime", fromDate);
        query.select("indexed", true);
        List<String> results = mongoHandler.findMany(query, 0);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }
        return mediaItems;
    }

    @Override
    public List<MediaItem> getMediaItemsByDysco(String dyscoId, String mediaType, int size) {

        Selector query = new Selector();

        query.select("dyscoId", dyscoId);
        query.select("type", mediaType);

        List<String> results = mongoHandler.findMany(query, size);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }

        return mediaItems;
    }

    @Override
    public List<MediaItem> getMediaItemsByDyscos(List<String> dyscoIds, String mediaType, int size) {

        List<String> results = mongoHandler.findManyWithOr("type", mediaType, "dyscoId", dyscoIds, size);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }

        return mediaItems;
    }
    
    @Override
    public List<MediaItem> getMediaItemsForItems (List<String> itemIds, String mediaType, int size) {

        String fieldName = "type";
        String fieldValue = mediaType;
        String orField = "reference";
        List<String> values = itemIds;        
        
        List<String> results = mongoHandler.findManyWithOr(fieldName, fieldValue, orField, values, size);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        for (String json : results) {
            mediaItems.add(ItemFactory.createMediaItem(json));
        }

        return mediaItems;
    }
    
    @Override
    public List<MediaItem> getMediaItemsForUrls(List<String> urls, String mediaType, int size) {

        String fieldName = "type";
        String fieldValue = mediaType;
        String orField = "refUrl";
        List<String> values = urls;        
        
        List<String> results = mongoHandler.findManyWithOr(fieldName, fieldValue, orField, values, size);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        Set<String> uniqueUrls = new HashSet<String>();
        for (String json : results) {
        	MediaItem mediaItem = ItemFactory.createMediaItem(json);
        	if(!uniqueUrls.contains(mediaItem.getUrl())) {
        		uniqueUrls.add(mediaItem.getUrl());
        		mediaItems.add(mediaItem);
        	}
        }

        return mediaItems;
    }

	@Override
	public List<MediaItem> getMediaItemsByUrls(List<String> urls,
			String mediaType, int size) {
		
		String fieldName = "type";
        String fieldValue = mediaType;
        String orField = "url";
        List<String> values = urls;        
        
        List<String> results = mongoHandler.findManyWithOr(fieldName, fieldValue, orField, values, size);
        List<MediaItem> mediaItems = new ArrayList<MediaItem>(results.size());
        Set<String> uniqueUrls = new HashSet<String>();
        for (String json : results) {
        	MediaItem mediaItem = ItemFactory.createMediaItem(json);
        	if(!uniqueUrls.contains(mediaItem.getUrl())) {
        		uniqueUrls.add(mediaItem.getUrl());
        		mediaItems.add(mediaItem);
        	}
        }

        return mediaItems;
	}

	@Override
	public void addMediaItem(String id, String originalId, long publicationTime, String userid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("reference", originalId);
		map.put("publicationTime", publicationTime);
		map.put("userid", userid);
		
		mongoHandler.insert(map, "MediaShares");
		
	}
    
    
}
