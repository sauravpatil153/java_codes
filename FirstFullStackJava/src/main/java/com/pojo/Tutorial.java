package com.pojo;

import java.time.LocalDate;
import java.util.Date;

public class Tutorial {
	// id | name        | author | publish_date | visits | contents | topic_id
	private int id;
	
	private String name;
	
	private String author;
	
	private Date publishDate;
	
	private String visits;
	
	private String contents;
	
	private int topicid;

	public Tutorial(int id, String name, String author, Date publishDate, String visits, String contents,
			int topicid) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;
		this.visits = visits;
		this.contents = contents;
		this.topicid = topicid;
	}

	public Tutorial() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getVisits() {
		return visits;
	}

	public void setVisits(String visits) {
		this.visits = visits;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

}
