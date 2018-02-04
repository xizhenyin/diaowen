package com.key.dwsurvey.dao;

import java.util.List;
import java.util.Map;

import com.key.common.dao.BaseDao;
import com.key.dwsurvey.entity.SurveyStats;
import com.key.dwsurvey.entity.SurveyAnswer;

public interface SurveyAnswerDao extends BaseDao<SurveyAnswer, String>{

	public void saveAnswer(SurveyAnswer surveyAnswer,
			Map<String, Map<String, Object>> quMaps);

	public SurveyStats surveyStatsData(SurveyStats surveyStats);

	public Long userAnswerCount(String userId,String beginDate, String endDate);

    List<Object[]> groupUser(String bDate, String eDate);
    
    List<String> userAnsered(String userId,String qId);
}
