package myownautoshop;

public class Ford extends Car{
	 int year;
	 int manufacturerDiscount;
	 Ford(){};
	 Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount)
	 {
		 super(speed,regularPrice,color);
		 this.year=year;
		 this.manufacturerDiscount=manufacturerDiscount;
	 }
	 double getSalePrice() {
		 return regularPrice-((regularPrice*manufacturerDiscount)/100);
	 }
	 public void display() {
			super.display();
			System.out.println("Year : "+year);
			System.out.println("Manufacturer's Discount : "+manufacturerDiscount);
		}
}
