package loanReceivers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class loanReceiversInfo {
	
	public void showInfo()
	{
		try
		{
			FileReader reader =new FileReader("loanReceivers.csv");
			BufferedReader br =new BufferedReader(reader);
			
			String str=br.readLine();
			while(str!=null)
			{
				
					String[] data=str.split(",");
				
					
					System.out.println("First Name : "+data[1]);
					System.out.println("Last Name  : "+data[2]);
					System.out.println("Contact No : "+data[3]);
					System.out.println("Age        : "+data[4]);
					System.out.println("Loan Amt   : "+data[5]);
					System.out.println("Loan Type  : "+data[6]);
					  
					System.out.println("\n");
					
				
				str=br.readLine();	
			
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loanReceiversInfo info=new loanReceiversInfo();
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Show Loan Receiver Details");
			System.out.println("2.Show Loan Receiver Details With respect to Loan Type");
			System.out.println("3.Apply For Loan");
			System.out.println("4.For Exit");
			
			choice=sc.nextInt();
			
		switch(choice)
		{
		 case 1:
			 info.showInfo();
			 break;
			 
		 case 2:
			 System.out.println("Select Loan Type");
			 Scanner sc2=new Scanner(System.in);
			 String type=sc2.nextLine();
			 
			 createObject obj=new createObject();
			 Loan loan=obj.createObj(type);
			
			 loan.showTypeData(type);
			 break;
		
		 case 3:
			 ApplyForLoan l=new ApplyForLoan();
			 break;
		 case 4:
			 System.out.println("You Entered Exit");
			 break;
		}
		
		}while(choice!=4);
		
	}

}
