package Assign1;


public class Duplicate {
public static void main(String[] args) {
	  int[] arr = { 24, 18, 54, 87, 18, 68, 18, 29 };
		 int count=0;
		 int c=0;
		 int num=18;
		 for (int j = 0; j < arr.length; j++) {
			if(arr[j]==num) {
			count++;	
		}
			c=count;
		 
		}
	  System.out.println("total no. of duplicates of "+num+ " are = "+count);
	 }
	
}

