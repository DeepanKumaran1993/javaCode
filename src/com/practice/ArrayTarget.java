package com.practice;

public class ArrayTarget {

	
	
	//int []arr= {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 5, 6, 4};
		int [] arr1= {1,2};
		
		int target=9;
		int limit=0;
		for(int i=0;i<arr.length-1;i++) {
		
			if(limit==0) {
			for(int j=1+i;j<arr.length;j++) {
		
				if((arr[i]+arr[j]==target)){
					System.out.println("the element of two  is "+arr[i]+ " and " +arr[j] );
					limit=1;
					break;
				}
			}
			}
	
		}
	}

}
