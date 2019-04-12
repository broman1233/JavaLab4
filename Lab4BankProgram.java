import java.util.Scanner;
public class Lab4BankProgram {

	public static void main(String[] args) 
	{
		int programOption = -1 ;
		BankAccount bankNum1 = new BankAccount();
		BankAccount bankNum2 = new BankAccount();
		BankAccount bankNum3 = new BankAccount();
		startMsg();
		Scanner option = new Scanner(System.in);
		
		do
		{
			programOption = option.nextInt();
			switch (programOption)
		    {
		        case 1:
		            System.out.println("");
		            break;
		        case 2: 
		            // Deposit
		            break;
		        case 3: 
		            // Withdrawl
		            break;
		        case 4: 
		            // Transfer
		            break;
		        case 5: 
		            // .. exit program
		            break;
		            
		        default:
		            System.out.println("Choice must be a value between 1 and 5.");
		    }   
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
		}while(programOption != 5);
		
		
		
		
		
		
		
		
		
		
		

	}
	static void startMsg()
	{
		System.out.println("Hi welcome to your banking program!");
		System.out.println("Select the number next to the action to choose that option.");
		System.out.println("1. Make a Bank Account.");
		System.out.println("2. Make a Deposit.");
		System.out.println("3. Make a Withdrawl.");
		System.out.println("4. Make a Transfer.");
		System.out.println("5. Exit.");
	}
	
	

}
