package springs_hibernate_xml_all_annotation.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "springs_hibernate_xml_all_annotation.dto",
		"springs_hibernate_xml_all_annotation.dao" })
public class Config {

	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("shree").createEntityManager();
	}
}
