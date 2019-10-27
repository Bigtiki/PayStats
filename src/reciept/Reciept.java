package reciept;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reciept{
	

	public static void main(String[] args) {
		Reciept1 Product = new Reciept1();
		
		Product.Work();
		//Product.welcome();
	}
	
}

interface product{
	String productName();
	double productBill(double Q, double P);	 
}
interface totalBalance{
	double grosspay();
	void display(String Name, double P, double Q, double total, double balance,int o);
}
abstract class mainBluePrint {
	public abstract void welcome();
	}
class testReciept extends mainBluePrint implements totalBalance, product{
	static final int b =100;
	static double total;
	static double balance;
	public double grosspay() {
		balance=balance+total;
		return balance;
		}

	public void welcome() {	

		System.out.println();
		System.out.println();
		System.out.println();	
	System.out.println('\t'+"\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();
	for (int i=0; i<10;) {
	System.out.println('\t'+"\t\tcustomer " +(i+1));
	break;}
	System.out.println('\t'+"\t\t            Welcome           ");
	System.out.println();
	System.out.println('\t'+"\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("             \t "+"> > > > > >" + "BIG TIKI EMPIRE" + "< < < < < ");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println('\t'+"\t\t               " + "25, Left St"+ "            ");
	System.out.println('\t'+"\t \t	" + "HelloJava, Bangladesh 2019" + "        ");
	System.out.println('\t'+"\t\t            " + "  (508)-$$$-$$$$  " + "        ");
	System.out.println("");
	System.out.println('\t'+"\t  _____________" + "$ALES RECEIPT"+ "______________");
	System.out.println("");
	DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss a");
	Date date = new Date();
	System.out.println("                    Our Checker Today Is");
	System.out.println("                     "+dateFormat.format(date)+"        * Java");
	
	
	}

	public String productName() {
		System.out.println("Your Product:?");
		Scanner input = new Scanner(System.in);
		String Name=input.nextLine();
		return Name;
	}

	public double productBill(double Q, double P) {
		total=Q*P;
		
		return total;
	}

	public void display(String Name, double P, double Q, double total, double balance,int o) {
				System.out.println("||\t Product\t||\t Price\t\t||\t Quantity\t||\t Total\t||\n"
				+ "||\t"+Name+"\t\t||\t"+P+" \t\t||\t "+Q+"\t\t||\t "+total+"\t||\n");}
	public void displayOutput(String Name, double P, double Q, double total, double balance,int o) {
	
	System.out.println("                    "+"=======================================");
System.out.println("                    "+"GUEST: " );
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("                    "+"Products "+"              "+ " Price of Products");
System.out.println();
System.out.println("                    "+Name + "       "+Q+"q X $"+P );
System.out.println("                                 $" +"********************"+ total );
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
//System.out.println("                    "+"Product Total Price:" );
//System.out.println("                    "+"$" + grossPayAmount);
System.out.println("                    "+"======================================");
System.out.println("                    "+"Gross Pay Amount: $ " + balance);
System.out.print("                    "+"Discount: " );
//discountPay();
System.out.println("");
//System.out.println("                    "+"Discounted TOTAL:$" + (discountPay));
System.out.println("");
System.out.println("");
System.out.println("");
	
}
	}	

class Reciept1 extends testReciept{	

	public void Work() {
		boolean invalid;
		int o;
		int i=5;
		double[] P=new double[b];
		double []Q=new double[b];
		double [] T=new double[b];
		double [] B=new double[b];
		String [] Name=new String[b];
		
		testReciept try1 = new testReciept();
		
			for( i=0;i<5;i++) {
				
				Name[i]=try1.productName();
			do{
				try {	
		System.out.print("Price:");
		Scanner input = new Scanner(System.in);
			P[i]=input.nextDouble();
			if(P[i]<=0){
				System.out.println("invalid");
				invalid=true;
			}else {invalid=false;}
		}catch(Exception e) {
			invalid=true;
			System.out.println("invalid");
		}
				}while(invalid);
		do {
			try {
		System.out.print("Quantity:");
		Scanner input = new Scanner(System.in);
		Q[i]=input.nextDouble();
		if(Q[i]<=0){
			System.out.println("invalid");
			invalid=true;
		}else {invalid=false;}
		try1.productBill(Q[i],P[i]);}catch(Exception e) {
			invalid=true;
			System.out.println("invalid");
		}}while(invalid);
		
		//input.close();
		System.out.println("Your Total:$"+total+"\n");
		B[i]=try1.grosspay();
		for(o=0;o<=i;o++) {
			T[i]=try1.productBill(Q[i],P[i]);
			
			
			try1.display(Name[o], P[o], Q[o], T[o], B[i], o);
			}
		System.out.println("||\t\t\t||\t\t\t||\t \t\t||\t Balance:$"+balance);
		try1.displayOutput(Name[o], P[o], Q[o], T[o], B[i], o);}
			}
	}





