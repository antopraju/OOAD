/*
5.Observer
Suppose you want to let personal information manager users share information. This would be  useful,  for  instance,  for  coordinating  a regular  club  meeting.  You  could  use  an Appointment  object  to  provide  club  members  with  current  information  about  the  meeting location, date and time. However, how do you ensure that, if the meeting time changes, a change to the appointment information is sent to everyone who's interested?
*/

public class ObserverTest {

	public static void main(String[] args) {
		ClubMeeting CM = new ClubMeeting("LHC", "5th Nov", "1:30");
		ClubMember cMem = new ClubMember(CM);
		ClubMember cMem2 = new ClubMember(CM);
		CM.notifyObserver();
		cMem.display();
		cMem2.display();
		CM.setTheAppointment("ESB", "6th Nov", "2:30");
		cMem.display();
		cMem2.display();
		CM.setTheAppointment("DES", "8th Nov", "3:30");
		cMem.display();
		cMem2.display();
	}

}

