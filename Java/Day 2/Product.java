package Assignments;

public class Product {
	int ProID;
	String ProName;
	double ProPrice;
	
	public double Gst() {
		System.out.println("Product Price with GST :");
		return ProPrice+(ProPrice*0.17);
	}
	
	public void display() {
		System.out.println("Product ID :\n"+ProID);
		System.out.println("Product Name :\n"+ProName);
		System.out.println("Product Price without GST :\n"+ProPrice+"\n");
	}

	public static void main(String[] args) {
		Product p = new Product();
		p.ProID = 11;
		p.ProName = "Adidas";
		p.ProPrice = 1000;
		p.display();
		System.out.println(p.Gst());
	}

}
