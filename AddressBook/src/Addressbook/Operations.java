package Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
	
	public String fname,Sfname,Tfname,Ffname;
	public String sname,Ssname,Tsname,Fsname;
	public String address,Saddress,Taddress,Faddress;
	public String number,Snumber,Tnumber,Fnumber;
	public String postal,Spostal,Tpostal,Fpostal;
	

	
	
public void createUpdate() {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("1(1)-Create/Update 1st Record");
	System.out.println("1(2)-Create/Update 2nd Record");
	System.out.println("1(3)-Create/Update 3rd Record");
	System.out.println("1(4)-Create/Update 4th Record");
	System.out.println("-------------------------------------------------------------");
	int input=scan.nextInt();
	
	switch(input) {

	case 1:
	Scanner scan1=new Scanner(System.in);
	System.out.println("--1st Record Selected--");	
		
	System.out.println("*Enter first name");
	fname=scan1.nextLine();
	
	System.out.println("**Enter second name");
	sname=scan1.nextLine();

	System.out.println("***Enter address");
	address=scan1.nextLine();
	
	System.out.println("****Enter number");
	number=scan1.nextLine();
	
	System.out.println("*****Enter postal code");
	postal=scan1.nextLine();
	
	System.out.println("--1st Record Stored--");
	System.out.println("-------------------------------------------------------------");
	break;
	
	case 2:
		Scanner scan2=new Scanner(System.in);
		System.out.println("--2nd Record Selected--");
		
		System.out.println("*Enter first name");
		Sfname=scan2.nextLine();
		
		System.out.println("**Enter second name");
		Ssname=scan2.nextLine();

		System.out.println("***Enter address");
		Saddress=scan2.nextLine();
		
		System.out.println("****Enter number");
		Snumber=scan2.nextLine();
		
		System.out.println("*****Enter postal code");
		Spostal=scan2.nextLine();
		
		System.out.println("--2nd Record Stored--");
		System.out.println("-------------------------------------------------------------");
		break;
	
	case 3:
		Scanner scan3=new Scanner(System.in);
		System.out.println("--3rd Record Selected--");
		
		System.out.println("*Enter first name");
		Tfname=scan3.nextLine();
		
		System.out.println("**Enter second name");
		Tsname=scan3.nextLine();

		System.out.println("***Enter address");
		Taddress=scan3.nextLine();
		
		System.out.println("****Enter number");
		Tnumber=scan3.nextLine();
		
		System.out.println("*****Enter postal code");
		Tpostal=scan3.nextLine();
		
		System.out.println("--3rd Record Stored--");
		System.out.println("-------------------------------------------------------------");
		break;
		
	case 4:
		Scanner scan4=new Scanner(System.in);
		System.out.println("--4rd Record Selected--");
		
		System.out.println("*Enter first name");
		Ffname=scan4.nextLine();
		
		System.out.println("**Enter second name");
		Fsname=scan4.nextLine();

		System.out.println("***Enter address");
		Faddress=scan4.nextLine();
		
		System.out.println("****Enter number");
		Fnumber=scan4.nextLine();
		
		System.out.println("*****Enter postal code");
		Fpostal=scan4.nextLine();
		
		System.out.println("--4th Record Stored--");
		System.out.println("-------------------------------------------------------------");
		break;
		
	default:
		System.out.println("No such case");
		break;
	}
}
	
	


public void getall() {

	
	System.out.println("---Records in the Address book---");
	System.out.println("-------------------------------------------------------------");
	System.out.println("                                 ");
	System.out.println("--Record 1--");
	System.out.println("                                 ");
	System.out.println("First Name :"+" "+fname);
	System.out.println("Second Name :"+" "+sname);
	System.out.println("Address :"+" "+address);
	System.out.println("Number/Phone :"+" "+number);
	System.out.println("Postal Code :"+" "+postal);
	
	System.out.println("                                 ");
	System.out.println("--Record 2--");
	System.out.println("                                 ");
	System.out.println("First Name :"+" "+Sfname);
	System.out.println("Second Name :"+" "+Ssname);
	System.out.println("Address :"+" "+Saddress);
	System.out.println("Number/Phone :"+" "+Snumber);
	System.out.println("Postal Code :"+" "+Spostal);
	
	System.out.println("                                 ");
	System.out.println("--Record 3--");
	System.out.println("                                 ");
	System.out.println("First Name :"+" "+Tfname);
	System.out.println("Second Name :"+" "+Tsname);
	System.out.println("Address :"+" "+Taddress);
	System.out.println("Number/Phone :"+" "+Tnumber);
	System.out.println("Postal Code :"+" "+Tpostal);
	
	System.out.println("                                 ");
	System.out.println("--Record 4--");
	System.out.println("                                 ");
	System.out.println("First Name :"+" "+Ffname);
	System.out.println("Second Name :"+" "+Fsname);
	System.out.println("Address :"+" "+Faddress);
	System.out.println("Number/Phone :"+" "+Fnumber);
	System.out.println("Postal Code :"+" "+Fpostal);
	System.out.println("                             ");
	System.out.println("-------------------------------------------------------------");
    

}

public void get() {
	
Scanner scan=new Scanner(System.in);

System.out.println("---Enter a name to find specific record---");
System.out.println("         ");
String name=scan.nextLine();

if(name==fname) {
	System.out.println("--Record 1--");
	System.out.println("First Name:"+" "+fname);
	System.out.println("Second Name:"+" "+sname);
	System.out.println("Address:"+" "+address);
	System.out.println("Number/Phone:"+" "+number);
	System.out.println("Postal Code:"+" "+postal);
}
else if(name==Sfname) {
	System.out.println("--Record 2--");
	System.out.println("First Name:"+" "+Sfname);
	System.out.println("Second Name:"+" "+Ssname);
	System.out.println("Address:"+" "+Saddress);
	System.out.println("Number/Phone:"+" "+Snumber);
	System.out.println("Postal Code:"+" "+Spostal);
}
	
}
}

	
	


