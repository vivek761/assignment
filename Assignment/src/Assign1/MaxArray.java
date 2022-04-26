package Assign1;

interface Max {
  public int Nth();
}

public class MaxArray {

  public static void main(String[] args) {

      Max M = () -> {
    	  int[] arr = { 24, 33, 54, 87, 71, 68, 18, 29 };
    	  int maxnum=arr[0];
    	  for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxnum) {
				maxnum=arr[i];
				
			}
		}
		return maxnum;
      };
      System.out.println("maximum number in array is "+M.Nth());
  }
  }
