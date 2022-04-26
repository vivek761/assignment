package Assign1;


interface Char{
	public void ch();
}

public class FindChar {

	public static void main(String[] args) {
		
		Char c1=() -> {
			String str="helloworld";
			char a[]=str.toCharArray();
			if(str.contains("l")) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		};
		c1.ch();
	}

}
