package Assign2;

import java.util.*;
import java.util.stream.*;

class Stud{
	int sid;
	String sname;
	int smarks;
	public Stud(int sId, String sName, int sMarks) {
		this.sid = sId;
		this.sname = sName;
		this.smarks = sMarks;
	}
	
}

 public class StudAvg {
 public static void main(String[] args) {
	
	 List<Stud> list=new ArrayList<Stud>();
	 list.add(new Stud(100,"john",42));
	 list.add(new Stud(101,"harry",35));
	 list.add(new Stud(102,"akash",48));
	 list.add(new Stud(103,"ram",39));
	 list.add(new Stud(104,"vinay",41));

	 Double studavg = list.stream().collect(Collectors.averagingDouble(m->m.smarks));
	 System.out.println(studavg);
	 
}
}
