package com.yash.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
import com.yash.dao.StudentDAO;
import com.yash.model.*;

public class StudentUpdate {
 public static void main(String s[])
 {	  
	 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	 StudentDAO objed2 = (StudentDAO) objAC.getBean("sdao");
	 Student objS = new Student();

	 Scanner sc = new Scanner(System.in);
	 while(true)
	 {
		 System.out.println("Enter student id");
		int i=sc.nextInt();
		 sc.nextLine();

		 System.out.println("Enter first name");
			String f=sc.nextLine();
			
			 System.out.println("Enter last name");
				String l=sc.nextLine();
				
				System.out.println("Enter father name");
				String fn=sc.nextLine();
				
				System.out.println("Enter mother name");
				String m=sc.nextLine();
				
				System.out.println("Enter class name");
				String c=sc.nextLine();
				
				System.out.println("Enter section");
				String se=sc.nextLine();
				
				System.out.println("Enter admission date");
				String ad=sc.nextLine();
				
				System.out.println("Enter gender");
				String g=sc.nextLine();
				
				System.out.println("Enter date of birth");
				String d=sc.nextLine();
				
			 System.out.println("Enter Addressline 1");
			String a1=sc.nextLine();
			
			 System.out.println("Enter Addressline 2");
				String a2=sc.nextLine();
				
			 System.out.println("Enter city id");
			int cid=sc.nextInt();
			
			System.out.println("Enter student phone number");
			int p1=sc.nextInt();
			
			System.out.println("Enter parent phone number");
			int p2=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter parent email");
			String e=sc.nextLine();
			
			objS.setS_id(i);
			objS.setF_name(f);
			objS.setL_name(l);
			objS.setFather_name(fn);
			objS.setMother_name(m);
			objS.setClass_name(c);
			objS.setSection(se);
			objS.setDob(d);
			objS.setAdmission_date(ad);
			objS.setGender(g);
			objS.setAdd1(a1);
			objS.setAdd2(a2);
			objS.setCity_id(cid);
			objS.setS_phone(p1);
			objS.setP_phone(p2);
			objS.setP_email(e);

	
	System.out.println("Total Record updated:- "+objed2.updateStud(objS));	
	System.out.println("want to do more 1 for yes 0 for no");
	int ch = sc.nextInt();
	if(ch==0)
		 break;
 }

 }
}
