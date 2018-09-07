package loanReceivers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeLoan extends Loan {

	public void showTypeData(String type)
	{
			try {
				loadDetails("Home");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	public void processLoan(String name,String type)
	{
		System.out.println(name+"'s "+type+" Loan is Processed");
	}
}
