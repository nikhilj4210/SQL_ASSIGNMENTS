package myownautoshop;

public class Truck extends Car{
	
	int weight;
	Truck(){};
	Truck(int speed,double regularPrice,String color,int weight)
	 {
		 super(speed,regularPrice,color);
		 this.weight=weight;
	 }
	double getSalePrice() {
		if(weight>2000)
			return regularPrice-((regularPrice*10)/100);
		return regularPrice-((regularPrice*20)/100);
	}
	public void display() {
		super.display();
		System.out.println("Weight : "+weight);
	}
	
}