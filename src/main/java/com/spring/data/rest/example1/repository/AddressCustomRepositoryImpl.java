package com.spring.data.rest.example1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.spring.data.rest.example1.model.Address;

@Repository
public class AddressCustomRepositoryImpl implements AddressCustomRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Session createSession() {
		Session session = null;
		if (entityManager == null || (session = entityManager.unwrap(Session.class)) == null) {
			throw new NullPointerException();
		} else {
			return session;
		}
	}

	@Override
	public List<Address> findByCity(String city) {
		Session session = createSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Address> query = builder.createQuery(Address.class);
		Root<Address> root = query.from(Address.class);
		query.select(root).where(builder.equal(root.get("city"), city));
		Query<Address> q = session.createQuery(query);
		List<Address> address = q.getResultList();
		return address;
	}

}
