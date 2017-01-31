import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

public class SummerizeName implements NameList {
	HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> key = new ArrayList<String>();
        String[] val;
	public void listOfDetails(HashMap<Integer, ArrayList<String>> hmap)
	{
		map=hmap;
		val = new String[map.size()];
		int j;	
		for (int i=0;i<map.size();i++)
		{
			j=0;
			key = map.get(i);
			val[i]=(key.get(j).toString());
		}	
	}
	public void Summerize()
	{
	    Arrays.sort(val);	
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);	
		}
		
	}

}

