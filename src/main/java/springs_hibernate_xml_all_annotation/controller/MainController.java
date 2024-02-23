package springs_hibernate_xml_all_annotation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springs_hibernate_xml_all_annotation.dao.Config;
import springs_hibernate_xml_all_annotation.dao.CountryDao;
import springs_hibernate_xml_all_annotation.dto.Country;
import springs_hibernate_xml_all_annotation.dto.State;

public class MainController {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		State state1 = (State) applicationContext.getBean("state");
		state1.setName("Maharashtra");
		state1.setCm("Eknath Shinde");

		State state2 = (State) applicationContext.getBean("state");
		state2.setName("Karnataka");
		state2.setCm("Sidhu");

		List<State> list = new ArrayList<State>();
		list.add(state1);
		list.add(state2);

		Country country = (Country) applicationContext.getBean("country");
		country.setStates(list);
		CountryDao countryDao = (CountryDao) applicationContext.getBean("countryDao");
		countryDao.saveCountry(country);

	}
}
