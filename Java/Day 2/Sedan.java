package myownautoshop;

class Sedan extends Car{
	 int length;
	 Sedan(){};
	 Sedan(int speed,double regularPrice,String color,int length)
	 {
		 super(speed,regularPrice,color);
		 this.length=length;
	 }
	 double getSalePrice() {
		 super.getSalePrice();
		 if(length>20)
			 return regularPrice-((regularPrice*5)/100);
		 return regularPrice-((regularPrice*10)/100);
	 }
	 public void display() {
			super.display();
			System.out.println("Length : "+length);
		}
}