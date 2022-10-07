package atmMachine;
import java.io.*;
import java.util.Scanner;

public class AtmMachine {

static void loadCash(int x,int y,int z)
{
System.out.println("--------------------------------------------------------------");
System.out.println("Denomination\t\tNumber\t\tValue");
System.out.println("---------------------------------------------------------------");
System.out.println("2000\t\t\t"+x+"\t\t"+x*2000);
System.out.println("500\t\t\t"+y+"\t\t"+500*y);
System.out.println("100\t\t\t"+z+"\t\t"+100*z);
}

static void atmOperations() throws IOException
{
	
	Scanner sc=new Scanner(System.in);
	int ch;
	int an,wa,pinNo;
	Lab6Qus3 la = new Lab6Qus3();
	System.out.println("Enter Account Number:");
	an=sc.nextInt();
	System.out.println("Enter Pin Number:");
	pinNo=sc.nextInt();
	la.withdraw(an,pinNo);}
public static void main(String[] args) throws IOException
 {
Scanner sc=new Scanner(System.in);
int ch=1;
while(ch!=0){
System.out.println("Main Menu");
System.out.println("1.Load Cash to ATM");
System.out.println("2.Show Customer Details");
System.out.println("3.Show ATM Operations");
System.out.print("Enter your choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
	int x,y,z;
	System.out.println("Enter the no of 2000rs currency:");
	x=sc.nextInt();
	System.out.println("Enter the no of 500rs currency:");
	y=sc.nextInt();
	System.out.println("Enter the no of 100rs currency:");
	z=sc.nextInt();
    loadCash(x,y,z);
break;
case 2:
	Lab6Qus3 la = new Lab6Qus3();
	la.balance(0);
break;
case 3:
atmOperations();
break;
}
}
 }
}
