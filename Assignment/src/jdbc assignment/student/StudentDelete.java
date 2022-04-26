package com.yash.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
import com.yash.dao.StudentDAO;

public class StudentDelete {
 public static void main(String s[])
 {	  
	 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	 StudentDAO objed = (StudentDAO) objAC.getBean("sdao");
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the id of student to delete record");
	 int i=sc.nextInt();
	 
	System.out.println("Total Record Deleted:- "+objed.deleteStud(i));		 
}
 }
