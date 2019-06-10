package com.cg;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_largest_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);// creat scanner class object
	System.out.println("Enter the length of Array");
	int n=sc.nextInt();// Read input from user
	int[]arr=new int [n];//user defined array
	System.out.println("Enter the values in Array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	
	}
	Arrays.sort(arr);
	System.out.println("Enter the nth number to find the value");
	int a=sc.nextInt();
	int size=arr.length;
	int z=arr[size-1];
	System.out.println("The nth number is:"+z);
}
}
