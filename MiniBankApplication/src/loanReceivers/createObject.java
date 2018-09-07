package loanReceivers;

public class createObject {

		
	Loan createObj(String name)
	{
		Loan loan = null;
		if(name.equalsIgnoreCase("Home"))
		{
			loan=new HomeLoan();
			
		}
		if(name.equalsIgnoreCase("Education"))
		{
			loan=new EducationLoan();
			
		}
		if(name.equalsIgnoreCase("Business"))
		{
			loan=new BusinessLoan();
			
		}
		
		
		return loan;
	}

}
