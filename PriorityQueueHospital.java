import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{
	private PriorityQueue<PatientType> patients;
	
	public PriorityQueueHospital()
	{
		patients = new PriorityQueue<>();
	}
	
	public void addPatient(PatientType patient)
	{
		patients.add(patient);
	}
	
	public String allPatientInfo()
	{
		String result = "";
		
		for(PatientType patient : patients)
		{
			result += patient.toString();
		}
		
		return result;
	}
	
	public String hospitalType()
	{
		return this.getClass().getSimpleName();
	}
	
	public PatientType nextPatient()
	{
		return patients.peek();
	}
	
	public int numPatients()
	{
		return patients.size();
	}
	
	public PatientType treatNextPatient()
	{
		return patients.poll();
	}
}
