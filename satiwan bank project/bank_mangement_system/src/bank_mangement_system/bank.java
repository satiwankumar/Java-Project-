package bank_mangement_system;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bank {
	Scanner n = new Scanner(System.in);

	ArrayList<customer> allitems = new ArrayList<customer>(5);

	bank() {

	}

	public void create_account(ArrayList<customer> allitems) {

		try {
			System.out.println("create account");
			customer customer = new customer();

			System.out.println("enter first name");
			customer.firstname = n.next();

			System.out.println("enter last name ");
			customer.lastname = n.next();

			System.out.println("enter nic number");
			customer.cnic = n.nextInt();
			System.out.println("Account type i.e current,saving");
			customer.account.accounttype = n.next();
			System.out.println("your account has been created successfully!");
			int max = 100000;
			int min = 1;
			Random random = new Random();
			customer.account.setAccount_no(min + random.nextDouble());

			allitems.add(customer);
			System.out.println("your account number is " + customer.account.getAccount_no());
			System.out.println("your name is  " + customer.firstname + " " + customer.lastname);
		} catch (Exception e) {
			System.out.println("Something went wrong please try again..!!");
			return;
		}
	}

	public void search_account(ArrayList<customer> allitems) {

		customer customer = new customer();
		customer temp = new customer();
		System.out.println("search account");
		System.out.println("Enter your account no ");
		temp.account.account_no = n.nextDouble();

		for (customer i : allitems) {
			if (i.account.account_no == temp.account.account_no) {
				System.out.println("number found");
				System.out.println(i.toString());
				return;
			}

			System.out.println(" Account Doesnot Exist");
			return;

		}

	}

	public void delete_account(ArrayList<customer> allitems) {
		boolean success;

		System.out.println("delete account");
		customer customer = new customer();
		double temp;
		System.out.println("Enter your account no to delete ");
		temp = n.nextDouble();

		for (customer i : allitems) {
			if (i.account.account_no == temp) {
				allitems.remove(i);

				System.out.println("you account has been deleted successfully");
				success = true;
				return;
			}

			System.out.println("Account Doesnot Exist ");
			return;
		}
	}

	public int customerMenu() {
		System.out.println("welcome to customer menu");
		System.out.println("1. Deposit Money " + "		    " + "2. Withdraw money " + " 	" + "	3. Check Balance "
				+ "4 . Exit ");

		System.out.println(" Enter your choice ");
		int choice = n.nextInt();

		return choice;
	}

	public void customerMenu(ArrayList<customer> allitems) {

		System.out.println("Enter your account number ");
		double temp;
		temp= n.nextDouble();
		for (customer i : allitems) {
			if (i.account.account_no == temp) {

				System.out.println(i.toString());
				int y;
				do {
					int choice = customerMenu();

					switch (choice) {
					case 1: {

						System.out.println("Enter your amount to deposit ");
						double amount = n.nextDouble();
						if (amount > 0) {

							i.account.balance += amount;
							System.out.println(" your amount has been succesfully depoisted");
							check_balance(i);

						} else {
							System.out.println("invalid amount");

						}
						break;
					}

					case 2: {

						System.out.println("Enter your amount to withdraw ");
						double amount = n.nextDouble();
						if (amount > 0 && i.account.balance > amount) {
							i.account.balance -= amount;
							System.out.println(" your transaction is successful ");
							check_balance(i);

						} else {
							System.out.println("invalid amount");

						}
						break;

					}
					case 3: {

						System.out.println(i.account.getBalance());
						break;
					}
					case 4: {
							System.out.println("Thank you for using customer Menu");
						break;
					}
					default: {
						System.out.println("Invalid choice");
						break;
					}

					}
					
					System.out.println(" Enetr your choice :   \n 1.customer menu  \n 2. Main menu  ");
					y = n.nextInt();
					

				} while (y==1);
			}
		}
	}

	public ArrayList<customer> getAllitems() {
		return allitems;
	}

	public void setAllitems(ArrayList<customer> allitems) {
		this.allitems = allitems;
	}

	public void check_balance(customer temp) {

		System.out.print(" your  current balance is ");
		System.out.println(temp.account.getBalance());

	}

	public void view(ArrayList<customer> mylist) {

		for (customer i : mylist) {
			System.out.println("Customer details : \n"+i);
		}
	}

	public void exit() {

		System.out.println("Thank you for using Our program");
		System.exit(0);
	}

}
