package Demo;

public class DisplayBill {
	
	public DisplayBill(Item i12) {
		String icode=i12.getIcode();
		String iname=i12.getIname();
		int qty=i12.getQty();
		int rate=i12.getRate();
		
		int amount=qty*rate;
		double disc=amount*10/100;
		double netAmount=amount-disc;
		
		System.out.println();
		System.out.println("*****You Final Order Details Are*****");
		System.out.println("Item Code: "+icode);
		System.out.println("Item Name: "+iname);
		System.out.println("Item Quantity: "+qty);
		System.out.println("Item Rate: "+rate);
		System.out.println("Total Amount: "+amount);
		System.out.println("Discount (10%): "+disc);
		System.out.println("Net Payable Amount: "+netAmount);
		System.out.println("*****Thank You... Visit Again...!!!******");
	}

}
