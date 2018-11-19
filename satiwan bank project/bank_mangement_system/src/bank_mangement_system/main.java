package bank_mangement_system;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner n = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(" Welcome to Bank Management System");
		bank mybank = new bank();
		boolean success ;

		do {
			try {
				System.out.println("1.create account");
				System.out.println("2.search account");
				System.out.println("3.delete account");
				System.out.println("4.view");
				System.out.println("5.Customer Menu");
				System.out.println("6.exit menu");
				System.out.println("enter your choice:");
				int x = n.nextInt();
				switch (x) {
				case 1:
					mybank.create_account(mybank.allitems);

					break;
				case 2:
					mybank.search_account(mybank.allitems);
					break;
				case 3:
					mybank.delete_account(mybank.allitems);
					break;
				case 5:
					mybank.customerMenu(mybank.allitems);

				case 4:
					mybank.view(mybank.allitems);
					break;
					
				}
				
			continue;
			} catch (Exception e) {
				System.out.println("Invalid input");
				return;
			}
			

			
		} while(true);

	}
}
