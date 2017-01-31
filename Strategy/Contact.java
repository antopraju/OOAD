import java.util.ArrayList;
import java.util.HashMap;

public abstract class Contact{
	NameList name;
	public Contact(NameList nam)
	{
		this.name=nam;
	}
	int i=0;
	HashMap<Integer, ArrayList<String>> hmap = new HashMap<Integer, ArrayList<String>>();
	ArrayList<String> detail=new ArrayList<String>();
	public abstract void displayContact();
	
	
	  public  void add1(String s1,String s2)
	  {
		java.util.List<String> a = new ArrayList<String>();
	       a.add(s1.toString());
	       a.add(s2.toString());
	       detail.addAll(a);
	       hmap.put(i,(ArrayList<String>)a);
	       name.listOfDetails(hmap);
	       i=i+1;  
	  }
}
