import java.util.LinkedList;

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
		return patients.getFirst();
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
