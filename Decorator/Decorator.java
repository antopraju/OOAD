/*
8.Decorator
Demonstrate how you use the Decorator pattern to extend the capability of the elements in one of the above problems.
*/

public class Decorator {
	public static void main(String[] args) 
	{
		Contact c1= new  Music(new MaleContact());
		 c1.getinterest();
		 Contact c2= new Dance(new MaleContact());
		 c2.getinterest();
		 Contact c3= new Dance(new femaleContact());
		 c3.getinterest();
	}
	}

abstract class Contact {
	public abstract void getinterest();
}
  abstract class Decorater extends Contact {
 	public Contact decorateContact;
 	public Decorater(Contact decorateContact)
 	{
 		this.decorateContact=decorateContact;
 	}
 	abstract public void getinterest();
 }
 class femaleContact extends Contact {
  public void getinterest()
  {
  		System.out.println("I'am a Female");	
  	}
  }
 class MaleContact extends Contact {
 	public void getinterest(){
 		System.out.println("I am a male");	
 	}
 }

 class Music extends Decorater {	
 public Music(Contact decorateContact) {
 		super(decorateContact);
 	}
 public void getinterest(){
 	  decorateContact.getinterest();
 	setTalent(decorateContact);
 	}
 private void setTalent(Contact decorateContact) {
 	System.out.println("I can sing");
 }
 }

class Dance extends Decorater {
 	public Dance(Contact decorateContact) {
 		super(decorateContact);
 	}
 public void getinterest(){
 	  decorateContact.getinterest();
 	setTalent(decorateContact);	
 	}
 private void setTalent(Contact decorateContact) {
 	System.out.println("I can Dance");	
 }
 }



