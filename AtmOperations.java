package atmMachine;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class AtmOperations { 
public static void main(String[] args)throws IOException { 
int accno=0,pin=0;
balance(accno);
withdraw( accno, pin);
}
static void balance(int accno)
{  
	Scanner sc=new Scanner(System.in);
	CustomerDetails a1=new CustomerDetails(101,"Suresh",2343,25234);
    CustomerDetails a2=new CustomerDetails(102,"Ganesh",7859,34123); 
    CustomerDetails a3=new  CustomerDetails(103,"Magesh",5432,26100);
    CustomerDetails a4=new  CustomerDetails(104,"Naresh",7854,80000); 
    CustomerDetails a5=new CustomerDetails(105,"Harish",2345,103400); 
    List<CustomerDetails> l=new ArrayList<CustomerDetails>();
    l.addAll(Arrays.asList(a1,a2,a3,a4,a5));
    System.out.println("------------------------------------------------------");
    System.out.println("Acc.NO\t\tAccount Holder Name\tPin\tBalance");
    System.out.println("-----------------------------------------------------");
    for(int i=0;i<l.size();i++){
        System.out.println(l.get(i));
    } }
static void withdraw(int accno,int pin)
{  

	int ch=1,debit=0;
	Scanner sc=new Scanner(System.in);
	CustomerDetails a1=new CustomerDetails(101,"Suresh",2343,25234);
    CustomerDetails a2=new CustomerDetails(102,"Ganesh",7859,34123); 
    CustomerDetails a3=new  CustomerDetails(103,"Magesh",5432,26100);
    CustomerDetails a4=new  CustomerDetails(104,"Naresh",7854,80000); 
    CustomerDetails a5=new CustomerDetails(105,"Harish",2345,103400); 
    List<CustomerDetails> l=new ArrayList<CustomerDetails>();
    l.addAll(Arrays.asList(a1,a2,a3,a4,a5));
    while(ch!=0){
    System.out.println("Main Menu");
	System.out.println("1.Check Balance");
	System.out.println("2.Withdraw Money");
	System.out.println("3.Transfer Money");
	System.out.println("4.Check ATM Balance");
	System.out.println("5.Exit");
	System.out.print("Enter your choice:");
	ch=sc.nextInt();
	int wa;
	switch(ch)
	{
	
	  case 1:
		int ac=accno;
		Predicate<CustomerDetails> p1=(a)->a.getAccNo()==ac&&a.getPin()==pin;
		l.forEach(a->{ 
		if(p1.test(a)) { 
		System.out.println(a.getBalance());} });
	    break;
	
	 case 2:
	   System.out.println("Enter Amount:");
	   wa=sc.nextInt();
	   Predicate<CustomerDetails> p2=(a)->a.getAccNo()==accno&&a.getPin()==pin&&wa>=100&&wa<=10000; 
	   l.forEach(a->{ 
	   if(p2.test(a)) { 
	   System.out.println("Amount withdrawal Success");
	   a.setBalance(a.getBalance()- wa);} });
	   debit=debit+wa;
       break;
	 case 3:
		System.out.println("Enter Amount:");
		wa=sc.nextInt();
		Predicate<CustomerDetails> p3=(a)->a.getAccNo()==accno&&a.getPin()==pin&&wa>=100&&wa<=10000; 
		l.forEach(a->{ 
		if(p3.test(a)) { 
		System.out.println("Transaction Success");
		a.setBalance(a.getBalance()- wa);} });
		debit=debit+wa;
		break;
	case 4:
		int x1=debit%2000;
		int y1=debit%500;
		int z1=debit%100;
		if (debit!=0){
		System.out.println("----------------------------------------------");
		System.out.println("Denomination\t\tNumber\t\tValue");
		System.out.println("----------------------------------------------");
		System.out.println("2000\t\t\t"+x1+"\t\t"+x1*2000);
		System.out.println("500\t\t\t"+y1+"\t\t"+500*y1);
		System.out.println("100\t\t\t"+z1+"\t\t"+100*z1);
		}
		else
		{
			AtmMachine.loadCash(x1,y1,z1);
		}
		break;
	case 0:
		System.exit(0);
	
}
	}
    sc.close();
    }}

