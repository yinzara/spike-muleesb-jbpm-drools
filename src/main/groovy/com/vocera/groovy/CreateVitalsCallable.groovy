package com.vocera.groovy

import org.joda.time.DateTime
import org.mule.api.MuleEventContext
import org.mule.api.lifecycle.Callable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

import com.vocera.drools.event.Vitals
import com.vocera.drools.fact.Patient

@Component
class CreateVitalsCallable implements Callable {
	
	@Autowired
	@Qualifier("patient1")
	private Patient patient1;
	
	@Autowired
	@Qualifier("patient2")
	private Patient patient2;
	
	@Autowired
	@Qualifier("patient3")
	private Patient patient3;
	
	@Autowired
	@Qualifier("patient4")
	private Patient patient4;
	
	@Autowired
	@Qualifier("patient5")
	private Patient patient5;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		def patients = [patient1, patient2, patient3, patient4, patient5];
		Random generator = new Random();
		
		Vitals vitals = new Vitals();
		int idx = generator.nextInt(patients.size);
		vitals.setPatient(patients[idx]);
		vitals.setSystolic((short)(generator.nextInt(40) + 110));
		vitals.setDiastolic((short)(generator.nextInt(20) + 80));
		vitals.setPulse((short)(generator.nextInt(40) + 75));
		vitals.setTemperature(generator.nextDouble() * 6.6 + 98.0);
		vitals.setCollected(new DateTime())
		
		return vitals;
	}
	
}
