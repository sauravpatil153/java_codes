package com.tester;

import static com.util.DBUtil.*;

import java.util.List;
import java.util.Scanner;
import com.dal.AccountDALImplementation;
import com.pojo.*;

public class BankTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			openConnection();
			System.out.println("1.Get All Accounts 2.Add new Account 8.EXIT");
			AccountDALImplementation accountDAL = new AccountDALImplementation();
			boolean flag = true;
			while (flag) {
				switch (sc.nextInt()) {
				case 1:
					List<Account> allAccounts = accountDAL.getAllAccounts();
					allAccounts.forEach(acc -> System.out.println(acc));
					break;
				case 2:
					System.out.println("Enter Account no, Name, Account Type, Address, Opening Balance");
					Account newAccount = new Account(sc.nextInt(),sc.next(),
							Type.valueOf(sc.next().toUpperCase()),sc.next(),sc.nextDouble());
					if(accountDAL.addNewAccount(newAccount)>0)
						System.out.println("Account Added Succesfully");
					else
						System.out.println("Account Insert Failed");
						
					break;
				case 8:
					System.out.println("Exiting application");
					flag = false;
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
