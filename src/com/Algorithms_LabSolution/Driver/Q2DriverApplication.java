package com.Algorithms_LabSolution.Driver;
import java.util.Scanner;
public class Q2DriverApplication {
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
	
//Declaring Denomination Size and Payable Amount
	int denomination_Size,amount;
	
	//Declaring temporary variables
	int temp,sum=0,count=0;
	
//Initializing Denomination Size
	System.out.println("Enter the size of currency denominations");
	denomination_Size=sc.nextInt();
	
	System.out.println("Enter the currency denominations value"); 
	
	//Declaring Denomination Array
	int denomination_Array[]=new int[denomination_Size];
	
	//Reading Currency Denomination Values
	for(int i=0;i<denomination_Size;i++)
	{
		denomination_Array[i]=sc.nextInt();
	}
	
	System.out.println("Enter the amount you want to pay"); 
	
	//Initializing Payable Amount
	amount=sc.nextInt();
	
	//Sorting the array
	for(int i=0;i<denomination_Size;i++)
	{
		for(int j=1;j<denomination_Size-i;j++)
		{
			if(denomination_Array[j-1]<denomination_Array[j])
			{
				temp = denomination_Array[j-1];
				denomination_Array[j-1]=denomination_Array[j];
				denomination_Array[j]=temp;
			}
		}
	}
	System.out.println("Your payment approach in order to give min no of notes will be"); 
	
	for(int i=0;i<denomination_Size;i++)
	{
		count=0;
		while(sum<=amount && ((amount-sum)/denomination_Array[i])>=1)
		{
			sum=sum+denomination_Array[i];
			count++;
		}
		if(count>0)
		{
			System.out.println(denomination_Array[i] + ":" + count);
		}
		
		
	}
	

	
	
	}
	
}
