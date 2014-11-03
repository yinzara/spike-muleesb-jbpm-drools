package com.vocera.drools.event;

import java.io.Serializable;

import javax.validation.constraints.Min;

import org.joda.time.DateTime;

import com.vocera.drools.fact.Patient;

public class Vitals implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2367140572819425117L;

	@Min(0)
	private short systolic;
	
	@Min(0)
	private short diastolic;
	
	@Min(0)
	private short pulse;
	
	private short temperature;
	
	private DateTime collected;
	
	private Patient patient;

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

	public short getTemperature() {
		return temperature;
	}

	public void setTemperature(short temperature) {
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
	
	
}
