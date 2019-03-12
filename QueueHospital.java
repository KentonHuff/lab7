import java.util.LinkedList;

/*
 * A class describing a hospital with a first in, first out treatment ordering
 */
public class QueueHospital<PatientType> extends Hospital<PatientType>
{
	private LinkedList<PatientType> patients;
	
	public QueueHospital()
	{
		patients = new LinkedList<>();
	}
	
	public void addPatient(PatientType patient)
	{
		patients.add(patient);
	}
	
	//Returns the concatenation of every patient's toString()
	public String allPatientInfo()
	{
		String result = "";
		
		for(PatientType patient : patients)
		{
			result += patient.toString();
		}
		
		return result;
	}
	
	//Returns "QueueHospital"
	public String hospitalType()
	{
		return this.getClass().getSimpleName();
	}
	
	//Returns the next patient to be treated
	public PatientType nextPatient()
	{
		return patients.getFirst();
	}
	
	//The number of patients in the hospital
	public int numPatients()
	{
		return patients.size();
	}
	
	//Removes and returns the next patient to be treated
	public PatientType treatNextPatient()
	{
		return patients.poll();
	}
}
