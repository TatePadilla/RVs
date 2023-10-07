/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Sep 24, 2023
 */
package controllerRVs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.RV;

public class RVHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("RVs");

	public void persist(RV type) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(type);
		manager.getTransaction().commit();
		manager.close();
	}

	public void delete(RV type) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(RV.class, type.getRvId()));
		manager.getTransaction().commit();
		manager.close();
	}

	@SuppressWarnings("unchecked")
	public List<RV> showAllRVs() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM rv i");
		List<RV> allItems = q.getResultList();
		manager.close();
		return allItems;

	}

	public void update(RV type) {
		EntityManager manager = factory.createEntityManager();
		RV dbEntity = manager.find(RV.class, type.getRvId());
		manager.getTransaction().begin();
		dbEntity.setType(type.getType());
		dbEntity.setAvgCost(type.getAvgCost());
		dbEntity.setAvgSize(type.getAvgSize());
		manager.getTransaction().commit();
		manager.close();

	}

	public RV searchRVByName(String type) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RV> query = manager.createQuery("SELECT i FROM rv AS i WHERE i.type = :type", RV.class);
		query.setParameter("type", type);
		RV dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
}
