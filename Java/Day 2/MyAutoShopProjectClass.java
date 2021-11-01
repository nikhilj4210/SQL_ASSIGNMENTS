package myownautoshop;

public class MyAutoShopProjectClass {

	public static void main(String[] args) {
		Sedan s1 = new Sedan(100,30000,"blue",25);
		double saleprice = s1.getSalePrice();
		s1.display();
		System.out.println("Sale Price : "+saleprice);
		System.out.println();
		
		Ford f1 = new Ford(150,40000,"silver",2010,15);
		double salepriceford=f1.getSalePrice();
		f1.display();
		System.out.println("Sale Price : "+salepriceford);
		System.out.println();
		
		Ford f2 = new Ford(180,70000,"white",2016,8);
		double salepriceford2=f2.getSalePrice();
		f2.display();
		System.out.println("Sale Price : "+salepriceford2);
		System.out.println();
		
		Car c1 = new Car(120,40000,"red");
		double cprice=c1.getSalePrice();
		c1.display();
		System.out.println("Sale Price : "+cprice);
		System.out.println();
		

	}

}