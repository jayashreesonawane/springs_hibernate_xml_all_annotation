package springs_hibernate_xml_all_annotation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springs_hibernate_xml_all_annotation.dto.Country;

@Component
public class CountryDao {
	@Autowired
	private EntityManager entityManager;

	public void saveCountry(Country country) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(country);
		entityTransaction.commit();
	}
}
