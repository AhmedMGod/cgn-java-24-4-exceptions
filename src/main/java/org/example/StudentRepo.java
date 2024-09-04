package org.example;

import java.util.HashMap;
import java.util.Map;

public class StudentRepo {

    Map<String, String> students = new HashMap<>();

    public String getStudentById(String id) throws Exception {
        if (students.containsKey(id)) {
            return students.get(id);
        }
        throw new Exception("Element with id: " + id + " not found!");
    }
}
