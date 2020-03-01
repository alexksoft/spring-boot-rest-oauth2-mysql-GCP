package com.ak.eventapi.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import com.ak.eventapi.dao.EventDao;
import com.ak.eventapi.db.domain.EntEvent;

@Component
public class EventDaoImpl extends BaseDaoImpl implements EventDao {
		
	@Override
	public List<EntEvent> getEventList() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<EntEvent> query = builder.createQuery(EntEvent.class);
		Root<EntEvent> root = query.from(EntEvent.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}

}
