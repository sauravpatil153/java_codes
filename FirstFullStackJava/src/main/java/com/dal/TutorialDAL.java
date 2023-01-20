package com.dal;

import java.sql.SQLException;
import java.util.List;
import com.pojo.Tutorial;

public interface TutorialDAL {
	List<String> getAllTutorialNamesByTopic(int topicId) throws SQLException;
	
	Tutorial getTutorialDetailsByName(String tutName) throws SQLException;
	
	String updateVisits(String tutName) throws SQLException;
}
