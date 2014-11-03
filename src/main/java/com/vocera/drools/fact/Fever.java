package com.vocera.drools.fact;

import org.joda.time.DateTime;

public class Fever {

	private DateTime started;
	
	private Patient patient;
	
	private Fever() {}
	
	private Fever(Patient patient, DateTime started) {
		this.patient = patient;
		this.started = started;
	}

	public DateTime getStarted() {
		return started;
	}

	public void setStarted(DateTime started) {
		this.started = started;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
