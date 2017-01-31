/*
3.Singleton:
Create a chocolate factory class so that the empty boilers are not heated and raw mixture is not  poured  out  of  boiler  without heating.  Make  sure  that  there  exists  only  one  chocolate boiler object.
*/


class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
  
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("filling the boiler with a milk/chocolate mixture\n");
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
		
			empty = true;
			System.out.println("draining the boiled milk and chocolate\n");
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
	
			boiled = true;
			System.out.println("boiling the contents to a boil\n");
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}



public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		System.out.println("When new object is created it will return the same exsiting instance");
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}


