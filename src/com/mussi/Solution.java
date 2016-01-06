package com.mussi;

import java.util.ArrayList;
import java.util.List;

import com.mussi.bean.Person;
import com.mussi.util.Converter;

public class Solution {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("1","Abc","Efg"));
		persons.add(new Person("2","Hij","Klm"));
		
		List<String> idsList = Converter.convertList(persons, person -> person.getId());
		
		for (String id : idsList) {
			System.out.println(id);
		}
	}
	
}
