package org.leetcode.httpserver;

import java.util.HashMap;
import java.util.Map;

public class PersonManager {
    private Map<String, Person> personMap;
    public PersonManager() {
        personMap = new HashMap<>();
    }
    public void addPerson(Person person) {
        personMap.put(person.getId(), person);
    }
    public Person getPerson(String id) {
        return personMap.get(id);
    }
    public boolean deletePerson(String id) {
        return personMap.remove(id) != null;
    }
    public Map<String, Person> getAllPersons() {
        return personMap;
    }

}
