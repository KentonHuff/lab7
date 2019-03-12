import java.util.Stack;

/*
 * A class describing a hospital with a Last in, first out treatment ordering.
 */
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
	
	//Returns the concatenated toString()s of all patients
	public String allPatientInfo()
	{
		String result = "";
		
		for(PatientType patient : patients)
		{
			result += patient.toString();
		}
		
		return result;
	}
	
	//Returns "StackHospital"
	public String hospitalType()
	{
		return this.getClass().getSimpleName();
	}
	
	//The next patient to be treated
	public PatientType nextPatient()
	{
		return patients.peek();
	}
	
	//The number of patients in the hospital
	public int numPatients()
	{
		return patients.size();
	}
	
	//Removes and returns the next patient to be treated
	public PatientType treatNextPatient()
	{
		return patients.pop();
	}
}
