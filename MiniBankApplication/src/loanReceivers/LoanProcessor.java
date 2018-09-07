package loanReceivers;

public class LoanProcessor implements Runnable {

	String data;
	createObject obj=new createObject();
	public LoanProcessor(String line) {
		// TODO Auto-generated constructor stub
		data=line;
		
		
	}
	
	public void run()
	{
		String[] temp=data.split(",");
		Loan loan=obj.createObj(temp[6]);
		if(temp[6].equalsIgnoreCase("Home"))
		{
		  loan.processLoan(temp[1], temp[6]);
		} 
		else if(temp[6].equalsIgnoreCase("Business"))
		{
			loan.processLoan(temp[1], temp[6]);
		}
		else if(temp[6].equalsIgnoreCase("Education"))
		{
			loan.processLoan(temp[1], temp[6]);
		}
	}

	
}
