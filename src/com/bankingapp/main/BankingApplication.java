package com.bankingapp.main;

import java.util.Scanner;
import com.banking.services.BankingImpl;
import com.banking.services.IBanking;
import com.bankingapp.database.InMemoryDatabase;
import com.bankingapp.model.Customer;

public class BankingApplication extends BankingImpl {
	private static IBanking banking = new BankingImpl();
	private static Scanner sc = new Scanner(System.in);
   
    public static void main( String args[]) {
    	 InMemoryDatabase.insertData();
         System.out.println("Welcome to Indian Bank LOGIN PAGE\n \n");
         System.out.println("Enter your Credentials - \n \nEnter Bank Account - ");
         String bankAccountNo = sc.nextLine();
         int bnkActno= Integer.parseInt(bankAccountNo);
         Customer c=InMemoryDatabase.getCustomer(bnkActno);
         if(c==null) 
         {System.out.println("Your Account is Not Registered with Bank\n");
          return ;}
         System.out.println("Enter Password - ");
         String password = sc.nextLine();
         if(c.verify(password)) 
         {System.out.println("\nCredential Verifed Successfully \n");
    
    int option;
    do {option=choosebankingoption();}
    while(option!=0 && option<5);
    }
    }
         private static int choosebankingoption() {
        	 int option=0;
        	 System.out.println("Please Proceed by Selecting the Below Options \n 1. Deposit \n 2. Withdraw \n 3. Transfer \n 4. Logout ");        	          
        	 System.out.println("Enter Option of the Banking Service Requiered- ");
        	 option = sc.nextInt();
        	    switch(option) {
        		   case 1:{banking.deposit();}
        		   break;
        		   case 2:{banking.withdraw();}
        		   break;
        		   case 3:{banking.transfer();}
        		   break;
        		   case 4:{banking.logout();}
        		   break;
        		   default:
        		   {System.out.println("Invalid Option Chosen, Please Choose from the Option Provided");}
        		   break;
        	    }
        	    return option;
         }
    }
   
  

