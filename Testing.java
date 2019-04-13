import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.InputMismatchException;//used in our catch blocks to handle exceptions
public class Testing 
{
	//name(s): Devon Lee & Brody Carney
	//created: 4/10/19
	//purpose: Experience in buildings programs that use objects/ work with arraylists
	//Last Revision: 4/12/19
	

	

		public static void main(String[] args) {
		
			
			ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
			String menuPrompt = "\n Please pick your menu selection";
			Scanner keyboard = new Scanner(System.in);
			boolean quit = false;
			int userSelection= 0;
			String menuError = "Selection must be a number between 1-5";
			String menuDisplay = //displays menu to screen
					"1.) Create Bank Account \n" +
					"2.) Deposit Money into Account \n" +
					"3.) Withdraw Money From Acccount \n" +
					"4.) TransferFunds to Different Account \n" +
					"5.) Type 0 to Exit Program ";
			
			
			
			do {
				System.out.print(menuDisplay);
				boolean validInput = false;
				while (!validInput) {
					try {
						System.out.print(menuPrompt);
						userSelection = keyboard.nextInt();
						
						while((userSelection < 1 || userSelection > 5)) {
							System.out.println("invalid selection, please enter a number between 1-5");
							userSelection = keyboard.nextInt();
						}
						validInput = true;
						break;
					}
					catch(InputMismatchException m) {
						System.out.print(menuError);
					}
				}
						
				switch(userSelection)
				{
				case 1: //allows user to create new account
					createAccount(keyboard, accountList);
					quit = false;
					break;
				case 2:
					depositFunds(keyboard, accountList);
					quit = false;
					break;
				case 3:
					withdrawlFunds(keyboard, accountList);
					quit = false;
					break;
				case 4:
					transferFunds(keyboard, accountList);
					quit = false;
					break;
				case 5:
					
					quit = true;
					break;
				}
			
			
		} while(!quit); 
			System.out.println("Goodbye!");


				keyboard.close();
			
			
			
	}
		public static void depositFunds(Scanner keyboard, ArrayList<BankAccount> accountList)
		{
			int accountNumber = -1;
			int money = 0;
			boolean wrongNum = true;
			int test = -1;
			System.out.println("Please enter your Account Number ");
			accountNumber = keyboard.nextInt();
			
			for(BankAccount newAccount : accountList ) {
	            if(newAccount.getAccountNumber() == accountNumber) {
	                System.out.println("Account found!");
	                System.out.println("Enter Amount to Deposit");
					money = keyboard.nextInt();
	                wrongNum = false;
	                newAccount.deposit(money);
	                System.out.println(newAccount.toString());
	              
	            }
				
				
					
				}
			
			 	if(wrongNum == true)
                System.out.println("Could not find account number :(");
				
			}
		
		public static void withdrawlFunds(Scanner keyboard, ArrayList<BankAccount> accountList) {
	        System.out.println("Please enter your account number");
	        int accountNumber = keyboard.nextInt();
	        boolean wrongNum = true;
	        int money = 0;
	        //loops through accountList to find matching account numbers
	        //for each loop actually extremely useful and easy to use
	        for(BankAccount newAccount : accountList ) {
	            if(newAccount.getAccountNumber() == accountNumber) {
	                System.out.println("Account found!");
	                System.out.println("Enter Amount to withdrawl");
					money = keyboard.nextInt();
	                wrongNum = false;
	                newAccount.withdrawl(money);
	                System.out.println(newAccount.toString());
	                
	            		}
	            	}
	        
	        
	        if(wrongNum == true)
	        System.out.println("Could not find account number :");
	        
	        
	        
	        }
		
		
		public static void transferFunds(Scanner keyboard, ArrayList<BankAccount> accountList )
		{
			
			
			int money = 0;
			System.out.println("Enter Amount to transfer");
			money = keyboard.nextInt();
			System.out.println("Please enter your account number to transfer from");
	        int accountNumber = keyboard.nextInt();
			
	        
	        boolean wrongNum = true;
	        boolean rightNum = true;
	        int accountIndex = 0;
	        int accountIndex2 = 0;
	        
			double amount = 0;
			
	        /*for(BankAccount newAccount : accountList ) {
	            if(newAccount.getAccountNumber() == accountNumber) {
	                System.out.println("Account found!");
	                wrongNum = false;
	                accountIndex = newAccount.getAccountNumber();
	                break;
	            }
	        }
	        if(wrongNum == true)
		        System.out.println("Could not find first account number :");
	        
	        
	        System.out.println("Please enter your account number to transfer from");
	        int accountNumber2 = keyboard.nextInt();
	        for(BankAccount newAccount : accountList ) {
	            if(newAccount.getAccountNumber() == accountNumber2) {
	                System.out.println("Account found!");
	                wrongNum = false;
	                //newAccount.withdrawl(money);
	                //amount = newAccount.getBalance();
	                //accountIndex2 = accountList.indexOf(newAccount.getAccountNumber());
	                  //= newAccount.getAccountNumber()
	                
	                break;
	            }
	        }
	        if(wrongNum == true)
		        System.out.println("Could not find second account number :");
	        
	        if(rightNum == true && wrongNum == false)
	        {
	        	System.out.println("test1");
	        	//BankAccount newAccount.accountList.get(accountIndex2).setBalance(mon);
	        	//BankAccount newAccount.accountList;
	        	//BankAccount 
	        	//.accountList.get(accountIndex2).withdrawl(money);
	        	
	        	accountList.get(accountIndex2).withdrawl(money);
	        	accountList.get(accountIndex).deposit(money);
	        	
	        	System.out.println("test2");*/

	        	
	        //}
	        
			for(BankAccount newAccount : accountList ) {
            if(newAccount.getAccountNumber() == accountNumber) {
                System.out.println("Account found!");
                wrongNum = false;
                accountIndex = newAccount.getAccountNumber();
                System.out.println("Please enter your account number to transfer into");
                int accountNumber2 = keyboard.nextInt();
                for(BankAccount newAccount2 : accountList ) {
                    if(newAccount.getAccountNumber() == accountNumber2) {
                        System.out.println("Account found!");
                        wrongNum = false;
                        //newAccount.withdrawl(money);
                        //amount = newAccount.getBalance();
                        //accountIndex2 = accountList.indexOf(newAccount.getAccountNumber());
                          //= newAccount.getAccountNumber()
                        
                        if(wrongNum == true)
                        {
                	        System.out.println("Could not find one of the account numbers :");
                        break;
                        }
                        else
                        {
                        	newAccount2.transferFunds(money, newAccount);
                        }
                        
                        break;
                    }
                }
                break;
            
            }
		}
			
		}
		
      
		
			
		
		
			
		public static void createAccount(Scanner keyboard, ArrayList<BankAccount> accountList) 
		{
		
		
			String promptAccount = "Create a Bank Account:";
			
			int accountNumber = -1;
			String accountNumberRules = " Please enter a number for your account \n"+
										"Your account number must be greater than 0";	
			boolean validAccountNumber = false; 
			
			int pin =-1;
			String pinRules = "Please enter a 4 digit pin\n" +
							  "Your pin must be in between 0000 and 9999";
			boolean validPin = false;
			
			String name = "";
			
			//name = scan.nextLine();
			//newAccount.setName(name);

			
			boolean quit = false;
			
			
				System.out.print(promptAccount);
				//validation for account number, use same method for number, pin, & name
				while (!validAccountNumber) {
					try {
						System.out.print(accountNumberRules);
						accountNumber = keyboard.nextInt();
						while (accountNumber < 0) {
							System.out.print(promptAccount);
							accountNumber = keyboard.nextInt();
							
						}
						
						validAccountNumber = true;
						break;
						
					}
					catch (InputMismatchException z) {
						System.out.print(accountNumberRules);
						keyboard.nextLine();
						
					}	
				}
				  while (!validPin) {
					try {
						System.out.print(pinRules);
						pin = keyboard.nextInt();
						
					if (pin >= 0000 && pin <= 9999) {
						validPin = true;
				
					}
						
					}
					catch (InputMismatchException p) {
						System.out.print(pinRules);
						keyboard.hasNextLine();
						
					}
					
					
					
				}
				  String nameRules = "Please Enter your name";
					System.out.println(nameRules);
					Scanner scan = new Scanner(System.in);
					name = scan.next();
				  
				  //System.out.println("Please enter your first and last name");
		            //name = keyboard.nextLine();

				  BankAccount newAccount = new BankAccount(accountNumber, pin);
		            newAccount.setName(name);
		            accountList.add(newAccount);//adds newaccount to arraylist named accountList
		            
		            System.out.println(newAccount.toString());
				
				  
				  
			
			return;
		}
		
	}


