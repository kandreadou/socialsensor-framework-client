package eu.socialsensor.framework.client.dao;

import java.util.List;

import eu.socialsensor.framework.common.domain.Keyword;
import eu.socialsensor.framework.common.domain.SocialNetworkSource;

/**
 *
 * @author etzoannos - e.tzoannos@atc.gr
 */
public interface KeywordDAO {

    public void insertKeyword(String keyword, float score);

    public void insertKeyword(String keyword, float score, SocialNetworkSource sourceType);
    
    public void insertKeyword(Keyword keyword, SocialNetworkSource sourceType);
    
    public void removeKeyword(String keyword);

    public void removeKeyword(String keyword, SocialNetworkSource sourceType);
    
    public void instertDyscoKeyword(String dyscoId, String keyword, float score);

	public List<Keyword> findTopKeywords(int n);
    
}
