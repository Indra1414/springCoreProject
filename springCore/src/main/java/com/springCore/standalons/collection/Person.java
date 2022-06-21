package com.springCore.standalons.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person 
{
	private List<String> friends;
	private List<String> colegues;
	private Map<String, String> colegueNameWithSalary;
	private Properties databaseConnection;

	public List<String> getColegues() {
		return colegues;
	}

	public void setColegues(List<String> colegues) {
		this.colegues = colegues;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Map<String, String> getColegueNameWithSalary() {
		return colegueNameWithSalary;
	}

	public void setColegueNameWithSalary(Map<String, String> colegueNameWithSalary) {
		this.colegueNameWithSalary = colegueNameWithSalary;
	}
	
	public Properties getDatabaseConnection() {
		return databaseConnection;
	}

	public void setDatabaseConnection(Properties databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", colegues=" + colegues + ", colegueNameWithSalary="
				+ colegueNameWithSalary + ", databaseConnection=" + databaseConnection + "]";
	}
	
}
