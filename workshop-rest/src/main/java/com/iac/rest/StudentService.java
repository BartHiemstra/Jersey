package com.iac.rest;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    public static final Map<Integer, Student> STUDENTEN = new HashMap<Integer, Student>() {{
       put(0, new Student(0, "Henk", "Klaassen", 19, "HBO-ICT"));
       put(1, new Student(1, "Kees", "Derksen", 22, "Verpleegkunde"));
       put(2, new Student(2, "Willem", "Boersma", 20, "Rechten"));
    }};

    public static Map<Integer, Student> getStudenten() {
        return STUDENTEN;
    }
    
    public static boolean createStudent(int id, Student student) {
    	if(STUDENTEN.containsKey(id))
    		return false;
    	else
    		STUDENTEN.put(id, student);    	
    	return true;
    }
    
    public static boolean deleteStudent(int id) {
    	if(!STUDENTEN.containsKey(id))
    		return false;
    	else
    		STUDENTEN.remove(id);    	
    	return true;
    }
}