package Assign2;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	public static int removeDuplicate(int[] arr, int n) {
		if(n==0||n==1) 
			return n;
		int[]temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for (int i=0; i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,60,10,20,70,50,80};
		Arrays.sort(arr);
		int len=arr.length;
		len=removeDuplicate(arr, len);
		for (int i=0; i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
