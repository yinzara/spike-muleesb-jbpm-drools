package com.vocera.drools.event;

import java.io.Serializable;

import org.joda.time.DateTime;

import com.vocera.drools.fact.Patient;

public class Vitals implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2367140572819425117L;

	private short systolic;

	private short diastolic;

	private short pulse;

	private double temperature;

	private DateTime collected;

	private Patient patient;

	public Vitals() {
		super();
	}

	public Vitals(short systolic, short diastolic, short pulse, double temperature, DateTime collected, Patient patient) {
		super();
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.pulse = pulse;
		this.temperature = temperature;
		this.collected = collected;
		this.patient = patient;
	}

	public short getSystolic() {
		return systolic;
	}

	public void setSystolic(short systolic) {
		this.systolic = systolic;
	}

	public short getDiastolic() {
		return diastolic;
	}

	public void setDiastolic(short diastolic) {
		this.diastolic = diastolic;
	}

	public short getPulse() {
		return pulse;
	}

	public void setPulse(short pulse) {
		this.pulse = pulse;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public DateTime getCollected() {
		return collected;
	}

	public void setCollected(DateTime collected) {
		this.collected = collected;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public String toString() {
		return "Vitals(systolic = " + systolic + ", diastolic = " + diastolic + ", pulse = " + pulse+ ", temperature = " + temperature + ", collected = " + collected + ", patient = " + patient + ")"; 
	}

}
