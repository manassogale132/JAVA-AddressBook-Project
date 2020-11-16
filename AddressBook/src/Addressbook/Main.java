package Addressbook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operations op=new Operations();
		Scanner scan=new Scanner(System.in);
		System.out.println("---Simple Address Book Program that takes 4 Records---");
		System.out.println("-------------------------------------------------------------");
        
	System.out.println("1-Create / Update Record");
	System.out.println("2-Get All Records");
	System.out.println("3-Get Specific Record");
	System.out.println("4-Exit");
	System.out.println("-------------------------------------------------------------");
	int input = 0;
	do {
	int input1=scan.nextInt();
	
	switch(input1) {
	
	case 1:
		System.out.println("--Option 1 selected--");
		op.createUpdate();
		break;
	case 2:
		System.out.println("--Option 2 selected--");
		op.getall();
        break;
	case 3:
		System.out.println("--Option 3 selected--");
		op.get();
		break;
	case 4:
		System.out.println("Thanks for Using our application.");
		System.out.println("Exiting........");
		break;
	default:
		System.out.println("No such option.");
		break;
	
	}
	}while(input!=3);
		
	}

}
