package com.ak.eventapi.dao;

import java.util.List;

import com.ak.eventapi.db.domain.EntEvent;


public interface EventDao extends BaseDao{
	    
	List<EntEvent> getEventList();
}
