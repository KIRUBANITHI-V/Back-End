package leeetcode;

import java.util.HashMap;
import java.util.*;

public class Map {
    public static void main(String[] args) {
    	Map <String,Integer> q = new HashMap<>();
    	
    	q.put("Kishore", 28);
    	q.put("Shankar",24);
    	q.put("Kiru",23);
    	
    	q.put("Kiru",q.get("Kiru")+1);
    	
    	for(String key : q.keySet()) {
    		//System.out.println(key);
    	//	System.out.println(key +" -- "+q.get(key));
    		
    		System.out.println(key + "--"+ q.get(key));
    	}
    	System.out.println("-----------");
    	q.remove("Kiru");
    	for(String key : q.keySet()) {
    		System.out.println(key + "--"+ q.get(key));
    	}
 	
    	
    }
    	
    }