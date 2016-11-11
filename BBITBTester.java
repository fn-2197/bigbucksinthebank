import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat


public class BBITBTester
{
	public static void main(String args[])
	{
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		//Instantiate an ArrayList object here called aryList
		List<BankAccount>aryList = new ArrayList<BankAccount>();
	do
	{
	Scanner kbReader = new Scanner(System.in);
	System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort): ");
	name = kbReader.nextLine();


		if(!name.equalsIgnoreCase("EXIT"))
		{
			System.out.print("Please enter the amount of the deposit.");
			Double amount = kbReader.nextDouble();
			System.out.println(" "); //gives an eye-pleasing blank line
			BankAccount nalpha = new BankAccount(name, amount);
			//Add it to the ArrayList object
			aryList.add(nalpha);
		}
	} while(!name.equalsIgnoreCase("EXIT"));


//Search aryList and print out the name and amount of the largest bank account
BankAccount ba = aryList.get(0);
double maxBalance = ba.balance;
String maxName = ba.name;
for(int j = 1; j < aryList.size(); j++)
{
	BankAccount a = aryList.get(j);
	if(maxBalance < a.balance){
		maxBalance = a.balance;
		ba = a;
		maxName = ba.name;
	}
}
System.out.println("The Largest Account belongs to: " + maxName + " and contains :" + maxBalance);
}
}
