/*
2.
Factory method:
Imagine that you’re working on a Personal Information Manager application. It will contain many  pieces  of  information  essential  to your  daily  life:  addresses,  appointments,  dates, books read, and so on. This information is not static;  for instance,you want to be able to change an address when a contact moves, or change the details of an appointment if your lunch  date  needs  to  meet  an  hour  later.  Design  the  problem  so  that  each  item,  like appointments provides their own mechanism to manage additions and changes. 
*/

import java.util.*;

class Factory {
	public static void main(String[] args) {
		Appointment myAppt;
		AppointmentCreator myApptCreator = new DocApptCreator();
		myAppt = myApptCreator.createAppt("EYE");
		Scanner in = new Scanner(System.in);
		String date, time, venue, person_name;

		System.out.println("Enter your appointment details:\n");
		System.out.println("Enter the date:\n");
		date = in.nextLine();
		System.out.println("Enter the time:\n");
		time = in.nextLine();
		System.out.println("Enter the venue:\n");	
		venue = in.nextLine();
		System.out.println("Enter the name of the person you are meeting:\n");
		person_name = in.nextLine();
		
		myAppt.setAppt(date,time,venue,person_name);
		System.out.println("Enter the changed timing of Appointment:\n");
		time = in.nextLine();
		myAppt.setTime(time);

		System.out.println("Enter the another person's name you are meeting:\n");
		person_name = in.nextLine();
		myAppt.setName(person_name);
		
		System.out.println("Your Appointment details are:\n");
		myAppt.displayApptDetails();
	}
}

class Appointment {
	String appDate, appTime, appVenue, appName;
	public void setDate(String d) {
		appDate = d;
	}

	public void setTime(String t) {
		appTime = t;
	}
	
	public void setVenue(String v) {
		appVenue = v;
	}

	public void setName(String n) {
		appName = n;
	}
	
	public void setAppt(String d, String t, String v, String n) {
		setDate(d);
		setTime(t);
		setVenue(v);
		setName(n);
	}

	public String getDate() {
		return appDate;
	}
	public String getTime() {
		return appTime;
	}
	public String getVenue() {
		return appVenue;
	}
	public String getName() {
		return appName;
	}
	
public void displayApptDetails() {
	System.out.println("Date:\n" + appDate);
	System.out.println("Time:\n" + appTime);
	System.out.println("Venue:\n" + appVenue);
	System.out.println("Person to meet:\n" + appName);
	}
}

class docEyeAppt extends Appointment {
	public void displayApptDetails() {
		System.out.println("Your Opthamologist Appointment details are:\n");
		super.displayApptDetails();
	}
}

class docEntAppt extends Appointment {
	public void displayApptDetails() {
		System.out.println("Your ENT Appointment details are:\n");
		super.displayApptDetails();
	}
}

class docVetAppt extends Appointment {
	public void displayApptDetails() {
		System.out.println("Your VET Appointment details are:\n");
		super.displayApptDetails();
	}
}

abstract class AppointmentCreator {
	public abstract Appointment createAppt(String x);
}

class DocApptCreator extends AppointmentCreator {
	public Appointment createAppt(String type) {
		if(type.equals("EYE")) {
			return new docEyeAppt();
		}
		else if(type.equals("ENT")) {
			return new docEntAppt();
		}
		else if(type.equals("VET")) {
			return new docVetAppt();
		}
		else {
			return null;
		}
	}
}
