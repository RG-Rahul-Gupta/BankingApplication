package com.banking.services;

import java.util.Scanner;
import com.bankingapp.model.Customer;

public class BankingImpl implements IBanking {
	private static Scanner sc = new Scanner(System.in);
	private static final int TPIN = 1997;
	private int tPin;
	Customer customer = new Customer(TPIN);
	private int amount=0;
	public int bankbalance=10000;
	@Override
	public void deposit() {
		System.out.println("Enter the Amount to be Deposited");
		amount=sc.nextInt();
		if(amount>0) {
			bankbalance = bankbalance+amount ;
			System.out.println("Your "+ amount +" Amount has been Securly Deposited\n Your Current Account Balance is - " + bankbalance);
		}
		else {
	System.out.println("Enter Valid Amount");
		}
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the Amount to be Withdrawn");
		amount=sc.nextInt();
		if(amount>0 && bankbalance>=amount) {
			bankbalance = bankbalance-amount ;
			System.out.println("Your "+ amount +" Amount has been Securly Withdrawn\n Your Current Account Balance is - " + bankbalance);
		}
		else {
	System.out.println("Insufficent funds \nEnter Valid Amount for Withdrawal");
		}
	}

	@Override
	public void transfer() {
		System.out.println("Please Enter TPIN for Money Transfer Verification\n");
		tPin=sc.nextInt();
		if(customer.verify(tPin)) {
			System.out.println("Verified\n");
		    System.out.println("Enter the Amount to be Transfered\n");
		    amount=sc.nextInt();
		if(amount>0 && bankbalance>=amount)
		{   bankbalance = bankbalance-amount ;
			System.out.println("Your "+ amount +" Amount has been Securly Transfered\n Your Current Account Balance is - " + bankbalance+"\n");
		}
		else{System.out.println("Insufficent funds \nEnter Valid Amount for Withdrawal \n");}}
		else{System.out.println("TPIN Verification Failed Please Re-Try \n ");}
	}

	@Override
	public void logout() {
		System.out.println("You have Logged Out Securely");
		
	}

	
}
