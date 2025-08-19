package Assignment2;
import java.util.Scanner;

class Commission{
	private String name;
	private String address;
	private int phone;
	private double Sales_amount;
	

    public void acceptDetails() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter name: ");
      name=sc.nextLine();
	
	  System.out.println("Enter address: ");
	  address=sc.nextLine();
	
	  System.out.println("Enter mobile no: ");
	  phone=sc.nextInt();
	
	  System.out.println("Sales amount: ");
	  Sales_amount=sc.nextDouble();
      }
    
    public void toCalculate() {
    	double commission=0;
    	if(Sales_amount>=100000) {
    		commission=Sales_amount*0.10;
    	}
    	else if(50000<=Sales_amount && Sales_amount<100000)
    	{
    		commission=Sales_amount*0.05;
    	}
    	else if(30000<=Sales_amount && Sales_amount<50000)
    	{
    		commission=Sales_amount*0.03;
    	}
    	else
    	{
    		commission=0;
    	}
    	
    	System.out.println(commission);
    }
}