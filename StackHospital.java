import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
	private Stack<PatientType> patients;
	
	public StackHospital()
	{
		patients = new Stack<>();
	}
	
	public void addPatient(PatientType patient)
	{
		patients.push(patient);
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
		return patients.pop();
	}
}
