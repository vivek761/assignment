package Assign1;

interface Character{
	default void ch() {
		String str="welcome to yash technologies";
		if(str.contains("yash")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
public class SeqChar implements Character {

	public static void main(String[] args) {
		SeqChar c1=new SeqChar();
		c1.ch();
		

	}

}
