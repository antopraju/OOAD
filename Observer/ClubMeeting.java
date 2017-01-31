import java.util.ArrayList;

public class ClubMeeting implements Subject {

	ArrayList<Observer> CMAL;
	Appointment ap;
	
	public ClubMeeting(String l,String d,String t) {
		ap = new Appointment();
		ap.setAppointment(l, d, t);
		CMAL = new ArrayList<Observer>();
	}
	
	@Override
	public void attach(Observer ob) {
		CMAL.add(ob);
	}

	@Override
	public void notifyObserver() {
		for(int i=0; i<CMAL.size(); i++){
			Observer CMObserver = (Observer)CMAL.get(i);
			CMObserver.update(ap);
		}
	}
	
	public void setTheAppointment(String l,String d,String t){
		this.ap.setAppointment(l, d, t);
		notifyObserver();
	}
	
}
