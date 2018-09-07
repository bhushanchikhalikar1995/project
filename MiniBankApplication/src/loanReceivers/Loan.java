package loanReceivers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class  Loan {

	abstract void showTypeData(String str);
	
	public void loadDetails(String type) throws IOException
	{
		FileReader reader = new FileReader("loanReceivers.csv");
		BufferedReader br = new BufferedReader(reader);
		
		String str=br.readLine();
		
		while(str!=null)
		{
			String[] data=str.split(",");
			if(data[6].equalsIgnoreCase(type))
			{
				System.out.println("First Name : "+data[1]);
				System.out.println("Last Name  : "+data[2]);
				System.out.println("Contact No : "+data[3]);
				System.out.println("Age        : "+data[4]);
				System.out.println("Loan Amt   : "+data[5]);
				System.out.println("Loan Type  : "+data[6]);
				  
				System.out.println("\n");
			}
			str=br.readLine();	
		}
		
	
	}
	abstract void processLoan(String name,String type);
}


