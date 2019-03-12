import org.junit.Assert;
import org.junit.Test;

/*
 * A JUnit test class testing each method in the StackHospital class
 */
public class StackHospitalTest
{
	@Test
	public void StackHospitalConstructorTest()
	{
		StackHospital<SickPerson> hos = new StackHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Returns wrong patient", patient2, hos.nextPatient());
	}
	
	@Test
	public void addPaientTest()
	{
		StackHospital<SickPerson> hos = new StackHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		
		hos.addPatient(patient1);
		
		Assert.assertEquals("Patient added incorrectly", patient1, hos.nextPatient());
	}
	
	@Test
	public void allPatientInfoTest()
	{
		StackHospital<SickPerson> hos = new StackHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		String expected = patient1.toString() + patient2.toString();
		
		Assert.assertEquals("allPatientInfo not formatted correctly", expected, hos.allPatientInfo());
	}
	
	@Test public void hospitalTypeTest()
	{
		StackHospital<SickPerson> hos = new StackHospital<>();
		
		Assert.assertEquals("hospitalType returns incorrect value", "StackHospital", hos.hospitalType());
	}
	
	@Test
	public void nextPatientTest()
	{
		StackHospital<SickPerson> hos = new StackHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Returns wrong patient", patient2, hos.nextPatient());
	}
	
	@Test
	public void numPatientsTest()
	{
		StackHospital<SickPerson> hos = new StackHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Wrong number of Patients returned", 2, hos.numPatients());
	}
	
	@Test
	public void treatNextPatient()
	{
		StackHospital<SickPerson> hos = new StackHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		
		hos.addPatient(patient1);
		
		Assert.assertEquals("Wrong patient treated", patient1, hos.treatNextPatient());
		Assert.assertEquals("Treated patient not removed", 0, hos.numPatients());
	}
}
