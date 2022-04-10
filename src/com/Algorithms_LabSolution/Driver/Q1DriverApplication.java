package com.Algorithms_LabSolution.Driver;
import java.util.Scanner;
public class Q1DriverApplication {
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
	
    // Declaring Array Size, No. of Targets and Target Value variables
	int  array_Size,noOfTargets,target_Value;
	//Declaring temporary variables
	int sum=0,transaction_Number = 0;
	boolean flag = false;
	
	System.out.println("Enter the size of transaction array");
	
	// Initializing Array Size
	array_Size=sc.nextInt();
	
	//Declaring and Initializing Array Variable
	int transaction_Array[]=new int[array_Size];
	
	System.out.println("Enter the values of array");
	
	//Reading values into the transaction_Array
	for(int i=0;i<array_Size;i++)
	{
		transaction_Array[i]=sc.nextInt();
		
	}
	
	System.out.println("Enter the total no of targets that needs to be achieved");
	
	// Initializing noOfTargets variable
		noOfTargets=sc.nextInt();
		
		for(int i=1;i<=noOfTargets;i++)
		{
		
			
			System.out.println("Enter the value of target");
			
			//Reading target Value
			target_Value=sc.nextInt();
			
			//Checking if Target is achieved or not
			sum=0;
			for(int j=0;j<array_Size;j++)
			{
				sum=sum+transaction_Array[j];
				if(sum>=target_Value)
				{
					transaction_Number=j+1;
					flag=true;
					break;
				}
				flag=false;
				
				
			}
			if(flag) {
				System.out.println("Target achieved after " + transaction_Number + " transactions");
			
			}
			else
			{
				System.out.println("Given target is not achieved");
				
			}
			
			
		}
	
	
	
	
	
	
	sc.close();
	

}
}
