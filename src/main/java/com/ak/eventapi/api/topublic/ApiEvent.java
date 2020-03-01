package com.ak.eventapi.api.topublic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.eventapi.dto.EventData;
import com.ak.eventapi.service.EventService;

@RestController
@RequestMapping({ "/event" })
public class ApiEvent {
    
	@Autowired
    EventService eventService;
    
    @RequestMapping(value = { "/list" }, method = { RequestMethod.GET })
    public List<EventData> eventList() {
        return this.eventService.getEventList();
    }
    
}
