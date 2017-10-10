package com.tcs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student std=new Student(60);
        Student std2=new Student(10);
        Student std3=new Student(80);
        
        List<Student> list=new CopyOnWriteArrayList<Student>();
        
        list.add(std); list.add(std2); list.add(std3);
        
        Collections.sort(list, (obj1,obj2)->{ 
        	if (obj1.getStudentID()<obj2.getStudentID())
        		return -1;
        	else if (obj1.getStudentID()<obj2.getStudentID())
        	  return 0;
        	else return 1;
        	
        });
        
        list.forEach(s->System.out.println(s.getStudentID()));
        	
    int ids[]={1,2,3,45,6,78,990,1234};
    
   // System.out.println(Arrays.stream(ids).map);
    						
    						
    							
        
        
    }
}
