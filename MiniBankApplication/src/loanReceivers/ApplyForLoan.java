package loanReceivers;

import java.io.BufferedReader;
import java.io.FileReader;

public class ApplyForLoan {

	
	public ApplyForLoan()
	{
		try
		{
			FileReader reader =new FileReader("loanReceivers.csv");
			BufferedReader br =new BufferedReader(reader);
			
			String str=br.readLine();
			while(str!=null)
			{
				//System.out.println(str);
				LoanProcessor loan=new LoanProcessor(str);
				Thread thread=new Thread(loan);
	   		   	thread.start();
				
	   		   	str=br.readLine();
			}
			System.out.println("Done");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
