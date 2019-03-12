import java.util.PriorityQueue;

/*
 * A class describing a hospital with treatment ordering determined by the natural ordering of its
 * contents
 */
public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{
	private PriorityQueue<PatientType> patients;
	
	public PriorityQueueHospital()
	{
		patients = new PriorityQueue<>();
	}
	
	//The patients will be automatically sorted by their natural ordering
	public void addPatient(PatientType patient)
	{
		patients.add(patient);
	}
	
	//Returns the concatenation of each patient's toString()
	public String allPatientInfo()
	{
		String result = "";
		
		for(PatientType patient : patients)
		{
			result += patient.toString();
		}
		
		return result;
	}
	
	//Returns "PriorityQueueHospital"
	public String hospitalType()
	{
		return this.getClass().getSimpleName();
	}
	
	//Returns the next patient to be treated
	public PatientType nextPatient()
	{
		return patients.peek();
	}
	
	//The number of patients in the hospital
	public int numPatients()
	{
		return patients.size();
	}
	
	//Removes and returns the next patient being treated
	public PatientType treatNextPatient()
	{
		return patients.poll();
	}
}
