package Assign1;

interface Binary{
	void Bin();
	}
		
public class BinSearch {

	public static void main(String[] args) {
		Binary b=()->{
			int arr[]= {15,25,35,45,55};
			int num=45,first=0,found;
			
			int last = arr.length-1;
			int mid =(first+last)/2;
			
			while (first<=last) {
				if(arr[mid]<num) {
					first=mid+1;
				}
				else if(arr[mid]==num) {
					System.out.println("Element is found at index "+mid);
					found=1;
					break;
				}
				else {
					last=mid-1;
				}
				mid=(first+last)/2;
			}
			if(first>last) {
				System.out.println("Element is not found");
			}
		};
		b.Bin();
	}
	}