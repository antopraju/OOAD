/*
7.Adapter
Create a shapes class to accommodate different types of shapes. Assuming that object of a 
shape  you  are  planning  to  include  is  already  available  but  with  different  interface, 
demonstrate how you include it into your design.
*/

public class Adapter{
	
	public static void main(String[] args){
		
		Circle circ = new Circle();
		Rectangle rect = new Rectangle();
		circ.fill();
		circ.draw();
		circ.display();
		rect.fill();
		rect.draw();
		rect.display();
	}
}



abstract class Shape{
	
	abstract void draw();
	abstract void fill();
	abstract void display();
	
}

class Circle extends Shape{
	
	void fill(){
		System.out.println("This Circle is how I am Colored");
	}
	
	void draw(){
		System.out.println("This Circle  is how I am made");
	}
	
	void display(){
		System.out.println("This Circle is how I look");
	}
}

class XXRectangle {
	
	void fillIt(){
		System.out.println("This Rectangle is how I am Colored");
	}
	
	void drawIt(){
		System.out.println("This Rectangle is how I am made");
	}
	
	void displayIt(){
		System.out.println("This Rectangle is how I look");
	}
}

class Rectangle extends Shape{
	
	XXRectangle rect = new XXRectangle();

	void fill(){
		rect.fillIt();
	}
	
	void draw(){
		rect.drawIt();
	}
	
	void display(){
		rect.displayIt();
	}
}
