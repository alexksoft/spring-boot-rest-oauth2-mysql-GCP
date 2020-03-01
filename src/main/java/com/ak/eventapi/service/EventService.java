package com.ak.eventapi.service;

import java.util.List;

import com.ak.eventapi.dto.EventData;

public interface EventService
{
    List<EventData> getEventList();
}
