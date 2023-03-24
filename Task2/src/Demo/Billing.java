package Demo;
import java.util.*;

public class Billing {

	public static void main(String[] args) {
		
		Item i1=new Item();
		
		Scanner sc=new Scanner(System.in);

		int qty,rate;
		String iname,icode;
		
		System.out.println("*****Welcome To Billing System******");
		System.out.println("Enter Item Code: ");
		icode=sc.nextLine();

		System.out.println("Enter Item Name: ");
		iname=sc.next();
		
		System.out.println("Enter Item Quantity: ");
		qty=sc.nextInt();

		System.out.println("Enter Item Rate: ");
		rate=sc.nextInt();
		
		i1.setIcode(icode);
		i1.setIname(iname);
		i1.setQty(qty);
		i1.setRate(rate);
		
		DisplayBill b1=new DisplayBill(i1);
	}

}
