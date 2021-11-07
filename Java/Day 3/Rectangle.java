package Day3_Assignments;

public class Rectangle extends Square{

	public int area(int l,int b) {
		this.a=l*b;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.area(10,20);
		r.dis();
	}

}
