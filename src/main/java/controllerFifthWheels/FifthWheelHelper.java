/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Sep 24, 2023
 */
package controllerFifthWheels;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import controllerRVs.RVHelper;

import model.FifthWheel;

public class FifthWheelHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("RVs");
	RVHelper rvHelper = new RVHelper();
	
	public void persist(FifthWheel model) {
		EntityManager manager = factory.createEntityManager();
		model.setRV(rvHelper.searchRVByName(model.getRV().getType()));
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}

	public void delete(FifthWheel model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(FifthWheel.class, model.getFifthWheelId()));
		manager.getTransaction().commit();
		manager.close();
	}

	@SuppressWarnings("unchecked")
	public List<FifthWheel> showAllFifthWheels() {
		EntityManager manager = factory.createEntityManager();
		List<FifthWheel> allItems = manager.createQuery("SELECT i FROM fifthwheel i").getResultList();
		manager.close();
		return allItems;

	}

	public void update(FifthWheel model) {
		EntityManager manager = factory.createEntityManager();
		model.setRV(rvHelper.searchRVByName(model.getRV().getType()));
		FifthWheel dbEntity = manager.find(FifthWheel.class, model.getFifthWheelId());
		manager.getTransaction().begin();
		dbEntity.setManufacturer(model.getManufacturer());
		dbEntity.setBrand(model.getBrand());
		dbEntity.setModel(model.getModel());
		dbEntity.setRating(model.getRating());
		dbEntity.setRV(model.getRV());
		manager.getTransaction().commit();
		manager.close();

	}

	public FifthWheel searchFifthWheelByName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<FifthWheel> query = manager.createQuery("SELECT i FROM fifthwheel AS i WHERE i.model = :model",
				FifthWheel.class);
		query.setParameter("model", oldName);
		FifthWheel dbEntity = query.getSingleResult();
		return dbEntity;
	}
}
