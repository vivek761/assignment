package Assign2;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

class City{
	String name;
	int pop;
	int area;
	public City(String name, int pop, int area) {
		this.name = name;
		this.pop = pop;
		this.area = area;
	}
	


public static void main(String[] args) {
	 ArrayList<City> list=new ArrayList<City>();
	 list.add(new City("pune",3600000,52000));
	 list.add(new City("mumbai",4700000,42000));
	 list.add(new City("delhi",4300000,36000));
	 list.add(new City("indore",1200000,14000));
	 list.add(new City("bangalore",3800000,25000));

	 City objItem = list.stream().max((obj1,obj2)-> obj1.pop>obj2.pop ? 1:-1).get();
	 System.out.println("City with highest population = "+objItem.name);
	 
	 Set<Integer> nameSet = list.stream().map(e->e.pop).collect(Collectors.toSet());
	 System.out.println(nameSet);
	 
	 City minarea = list.stream().min((obj1,obj2)-> obj1.area>obj2.area ? 1:-1).get();
	 System.out.println("City with minimum area = "+minarea.name);
}

}