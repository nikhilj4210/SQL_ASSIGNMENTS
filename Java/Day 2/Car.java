package myownautoshop;

public class Car {
	int speed;
	double regularPrice;
	String color;
	Car(){};
	Car(int speed,double regularPrice,String color)
	{
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	double getSalePrice() {
		return regularPrice;
	}
	public void display() {
		System.out.println("Speed : "+speed);
		System.out.println("Regular Price : "+regularPrice);
		System.out.println("Color : "+color);


	}
}	