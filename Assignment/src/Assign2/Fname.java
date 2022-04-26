package Assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fname {
public static void main(String[] args) {
	ArrayList<String> name=new ArrayList<>();
	name.add("aman");
	name.add("sarthak");
	name.add("Akhil");
	name.add("ram");
	name.add("rohit");

	 List<String> list = name.stream().filter(s-> s.startsWith("a")||s.startsWith("A")).collect(Collectors.toList());
	 System.out.println(list);
}
}
