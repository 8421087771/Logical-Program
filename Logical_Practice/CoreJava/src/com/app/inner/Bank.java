package com.app.inner;

public class Bank {
	
	 
	 class Account{
	 
            	public void amitMahant(){
            		System.out.println("Go to Branch");
            	}
	 }     
        
        public static void main(String[] args) {
		Account ac=	new Bank().new Account();
		ac.amitMahant();
		}
}
