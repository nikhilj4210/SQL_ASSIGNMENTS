package Assignments;

public class Tshirt {

		String Color;
		String Material;
		String Design;
		int Size;
		
		Tshirt(){
			System.out.println("This is Small Sized-Tshirt\n");
		};
		
		Tshirt(String c, String m, String d, int s){
			this.Color = c;
			this.Material = m;
			this.Design = d;
			this.Size = s;
			System.out.println("This is Medium Sized-Tshirt\n");
		}
		
		Tshirt(String c, String m, String d){
			this.Color  = c;
			this.Material = m;
			this.Design = d;
			this.Size = 40;
			System.out.println("This is Large Sized-Tshirt\n");
		}

		public void display(){
			System.out.println("Color : "+Color);
			System.out.println("Material : "+Material);
			System.out.println("Design : "+Design);
			System.out.println("Size : "+Size+"\n");
		}

		public static void main(String[] args) {
			Tshirt Small = new Tshirt();
			Small.Color = "Yellow";
			Small.Material = "Cotton";
			Small.Design = "Casual";
			Small.Size = 30;
			Small.display();
			
			Tshirt Medium = new Tshirt("Red","Polyster","Sports",34);
			Medium.display();
			
			Tshirt Large = new Tshirt("Green","Nylon","Jersy");
			Large.display();
			
		}

}
