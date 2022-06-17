package com.bankingapp.database;

import com.bankingapp.model.Customer;

public class InMemoryDatabase {
	
	private static Customer[] customers ;
	
	public static Customer getCustomer(int accountNo) {
		int size = customers.length;
		for(int i=0; i<size; i++) {
			Customer c = customers[i];
			if(c.getBankAccountNo()==accountNo) {
				return c;
			}
		}
		return null;
		
	}
	
	public static void insertData() {
		Customer c1 = new Customer(1234,"4321");
		Customer c2 = new Customer(9876,"6789");
		Customer c3 = new Customer(5432,"2345");
		customers=new Customer[] {c1,c2,c3};

	}
	

}
