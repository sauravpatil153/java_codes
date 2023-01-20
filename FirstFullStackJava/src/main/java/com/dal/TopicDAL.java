package com.dal;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Topic;

public interface TopicDAL {
	List<Topic> getAllTopics() throws SQLException;
}
