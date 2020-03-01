package com.ak.eventapi.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ak.eventapi.dao.EventDao;
import com.ak.eventapi.db.domain.EntEvent;
import com.ak.eventapi.dto.EventData;
import com.ak.eventapi.service.EventService;

@Service
public class EventServiceImpl implements EventService {
    
	@Autowired
    EventDao eventDao;
    
    @Transactional(readOnly = true)
    @Override
	public List<EventData> getEventList() {
        final List<EventData> eventDataList = new LinkedList<EventData>();
        final List<EntEvent> entEventList = this.eventDao.getEventList();
        for (final EntEvent entEvent : entEventList) {
            eventDataList.add(entEvent.getAsDto());
        }
        return eventDataList;
	}

}
