package com.vocera.drools.fact;

import org.joda.time.DateTime;

public class Fever {

	private DateTime started;

	private Patient patient;

	private double averageTemp;

	public Fever() {
	}

	public Fever(Patient patient, DateTime started) {
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

	public double getAverageTemp() {
		return averageTemp;
	}

	public void setAverageTemp(double averageTemp) {
		this.averageTemp = averageTemp;
	}

	public String toString() {
		return "Fever( patient = " + patient + ", started = " + started + ", averageTemp = " + averageTemp + ")";
	}

}
