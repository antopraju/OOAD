/*
6.Façade
To make the personal information manager more functional for users, we want to give them the opportunity to customize the application. Some examples of items to customize include font type, font size, colors, which services to start when, default currency, etc. Provide an unified interface for some of these items.
*/

import java.util.*;

class customizeApp{
	private customize size;
	private customize type;
	private customize color;
	
	public customizeApp(){
		size = new fontSize();
		type = new fontType();
		color = new fontcolor();
	}

	public void changeSize(){
		size.change();	
	}

	public void changeType(){
		type.change();	
	}

	public void changeColor(){
		color.change();	
	}
}

interface customize{
	void change();
}

class fontSize implements customize{
	public void change(){
		int s;
		System.out.println("Enter the new size of font ");
		Scanner in = new Scanner(System.in);
		s = in.nextInt();
		System.out.println("The new font size is "+s);
	}
}

class fontType implements customize{
	public void change(){
		String t;
		System.out.println("Enter the new type of font ");
		Scanner in = new Scanner(System.in);
		t = in.next();
		System.out.println("The new font type is "+t);
	}
}

class fontcolor implements customize{
	public void change(){
		String t;
		System.out.println("Enter the new color of font ");
		Scanner in = new Scanner(System.in);
		t = in.nextLine();
		System.out.println("The new font color is "+t);
	}
}

public class Facade{
	public static void main(String[] args){
		customizeApp cussapp = new customizeApp();
		cussapp.changeSize();
		cussapp.changeType();
		cussapp.changeColor();
	}
}
