public class Strategy {
	public static void main(String[] arg)
	{
		NameList nam =new SummerizeName();
		Contact a = new ContactList1(nam);
		a.add1("Ram", "Piper");
		a.add1("John","Company");
		a.add1("Suresh","Company2");
		a.add1("Abhi","Company2");
		a.displayContact();
	//Contact b =new ContactList2();
		//b.displayContact();
		
	}

}
