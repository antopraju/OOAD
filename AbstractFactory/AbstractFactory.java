/*
1.Abstract Factory
Suppose  you  plan  to  manage  address  and  telephone  information  as  part  of  a  personal 
information  m
anager  application.  The  will  act  as  a  combination  address  book,  personal 
planner,  and  appointment  and  contact  manager,  and  will  use  the  address  and  phone 
number  data  extensively.  Design  the  problem  to  accommodate  information  from  another 
country.
*/

import java.util.Scanner;

public class AbstractFactory{
	public static void main(String arg[]){
            
	USPIM_Factory nameusa = new USPIM_Factory();
    	INPIM_Factory nameind= new INPIM_Factory();
    	System.out.println("Enter the American address and 11 digit Phonenumber");
   	nameusa.createAddr();
    	nameusa.createphno();
    	System.out.println("Enter the Indian address and 10 digit Phonenumber");  
    	nameind.createAddr();
    	nameind.createphno();
        
	}
}

abstract class Address{
	String Housename,city,street,state;
	public abstract String getcountry();
    
	public void inputdata(){

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Housename");
		Housename = in.nextLine();
		System.out.println("Enter the city");
		city = in.nextLine(); 
		System.out.println("Enter the street");
		street = in.nextLine();
		System.out.println("Enter the state");
		state = in.nextLine();
}
    
	public void display(){
    
		System.out.println(Housename+"\n"+street+"\n"+city+"\n"+state);
	}

}



class InAddress extends Address{
    
    String coun="IND";
    InAddress(){
        super.inputdata();
        super.display();
        printAddr();
        
    }
    
    public String getcountry(){
        return coun;
    }
    
   public void printAddr(){
        
        System.out.println(coun);
    }


}

abstract class Phno{
    long pnum;
    int lem;
    int n;
    public abstract void getlen();
    
    public void getnum(){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter Phonenum");
         pnum = in.nextLong();
         lem = (int)(Math.log10(pnum)+1);
         }
    
    public Phno(int len)
    {
        this.n=len;
    }
    public void displaynum(){
        
        if(n!=lem)
        {
            System.out.println("Invalid number");
            
        }
        
        else
        {
        System.out.println(pnum);
        }
    }
}


class Inphone extends Phno{
static Integer len=10;
        
public void getlen(){
     len=10;
}
    Inphone(){
        super(len);
        super.getnum();
        super.displaynum();
        
    }
}

class INPIM_Factory implements PIM_AbstractFactory {
    
    public Address createAddr(){
        return new InAddress();
    }
    public Phno createphno(){
        return new Inphone();
    }
}


interface PIM_AbstractFactory {
    
	public Address createAddr();
	public Phno createphno();
}


class UsAddress extends Address{
    
	String coun="USA";
	UsAddress(){
        super.inputdata();
        super.display();
        printAddr();
	}
    
	public String getcountry(){
        	return coun;
	}
    
	public void printAddr(){
        	System.out.println(coun);
    }
}


class Usphone extends Phno{
    static Integer len=11;
	public void getlen(){
 		len=11;
	}

	Usphone(){
            super(len);
            super.getnum();
            super.displaynum();
      	}
}

class USPIM_Factory implements PIM_AbstractFactory{

	public Address createAddr(){
		return new UsAddress();
	}
	public Phno createphno(){
		return new Usphone();
	}
}
