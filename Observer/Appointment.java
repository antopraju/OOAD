public class Appointment {
	String location,date,time;
	public void setAppointment(String l,String d,String t){
		this.location = l;
		this.date = d;
		this.time = t;
		System.out.println("Appointment set: "+ l + "" + d + "" + t + "\n" );
	}
}
