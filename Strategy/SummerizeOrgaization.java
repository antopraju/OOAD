import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class SummerizeOrganization implements NameList {
	ArrayList<Object> al = new ArrayList<Object>();
	  HashMap<Integer,ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		Object[] values = new Object[100];
		Object[] keys = new Object[100];
		  HashMap<String,ArrayList> map1 = new HashMap<String,ArrayList >();	

	public void listOfDetails(HashMap<Integer, ArrayList<String>> hmap)
	{
		map=hmap;
		values=map.values().toArray();
		keys = map.keySet().toArray();
	}
	
	
	public void Summerize()
	{
 
		for(Object key:keys){
		System.out.println(key);
		}
		
	}

}

