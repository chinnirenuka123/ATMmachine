package javaprojectsample;

import java.util.Scanner;

public class AtmManchine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int withdraw,deposit;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter balance");
		int balance=sc.nextInt();
		while(true)
		{
			System.out.println("ATM operations:");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for balance check");
			System.out.println("choose 4 for exit");
			System.out.println("choose operation do you want");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter money to withdraw");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					//here it will remove withdraw amount from avaliable balance
					balance=balance-withdraw;
					System.out.println("transcation is in processing dont remove card");
					System.out.println("please collect your cash");
				}
				else
				{
					System.out.println("insufficient balance");
					
				}
				System.out.println();
				break;
			case 2:
				System.out.println("enter money to deposit");
				//get deposit amount from  the user
				deposit=sc.nextInt();
				//it will add the amount to the avaliable balance
				balance=balance+deposit;
				System.out.println("your money has been successfully deposited");
				System.out.println(" ");
				break;
			case 3:
				//here we are get display avaliable balance
				System.out.println("balance:"+balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
			}
			
		}

	}

}
