 class ClubMember implements Observer {

	Subject sub;
	Appointment app;
	public ClubMember(Subject s){
		this.sub = s;
		sub.attach(this);
	}
	
	@Override
	public void update(Appointment a) {
		app = a;
	}
	
	public void display(){
			System.out.println("Called by : " + this.toString());
			System.out.println("Appointment details: ");
			System.out.println("Location : " + this.app.location );
			System.out.println("Date : " + this.app.date );
			System.out.println("Time : " + this.app.time + "\n");
			
	
	}
	
}

