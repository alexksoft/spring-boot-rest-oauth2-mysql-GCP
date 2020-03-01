package com.ak.eventapi.db.domain.mapper;

import org.mapstruct.Mapper;

import com.ak.eventapi.db.domain.EntEvent;
import com.ak.eventapi.dto.EventData;

@Mapper
public interface EntEventMapper {
	EventData enttoDTO(EntEvent event);
}
