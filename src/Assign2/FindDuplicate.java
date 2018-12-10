package Assign2;

public class FindDuplicate {
	public static void findDuplicate(int[] a) {
		int count=0;
		for(int j=0;j<a.length;j++) {
			for (int k=j+1;k<a.length;k++) {
				if(a[j]==a[k]) {
					count++;
				}
			}
			if(count==1)
				System.out.println(a[j]);
			count=0;
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,60,10,20,70,50,80};
		findDuplicate(arr);
	}

}
