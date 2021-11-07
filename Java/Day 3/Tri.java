package Day3_Assignments;

public class Triangle extends Square{
	public int area(int h,int b) {
		this.a=h*b/2;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle r=new Triangle();
		r.area(10,10);
		r.dis();
	}

}
