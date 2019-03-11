import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest
{
	@Test
	public void PriorityQueueHospitalConstructorTest()
	{
		PriorityQueueHospital<Person> hos = new PriorityQueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 2);
		SickPerson patient2 = new SickPerson("alice", 15, 5);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Returns wrong patient", patient2, hos.nextPatient());
	}
	
	@Test
	public void addPatientTest()
	{
		PriorityQueueHospital<Person> hos = new PriorityQueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 2);
		SickPerson patient2 = new SickPerson("alice", 15, 5);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Patients added incorrectly", patient2, hos.nextPatient());
	}
	
	@Test
	public void allPatientInfoTest()
	{
		PriorityQueueHospital<Person> hos = new PriorityQueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 2);
		SickPerson patient2 = new SickPerson("alice", 15, 5);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		String expected = patient2.toString() + patient1.toString();
		
		Assert.assertEquals("allPatientInfor formatted incorrectly", expected, hos.allPatientInfo());
	}
	
	@Test
	public void hospitalTypeTest()
	{
		PriorityQueueHospital<Person> hos = new PriorityQueueHospital<>();
		
		Assert.assertEquals("hospitalType returns incorrect value", "PriorityQueueHospital", hos.hospitalType());
	}
	
	@Test
	public void nextPatientTest()
	{
		PriorityQueueHospital<Person> hos = new PriorityQueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 2);
		SickPerson patient2 = new SickPerson("alice", 15, 5);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Returns wrong patient", patient2, hos.nextPatient());
	}
	
	@Test
	public void numPatientsTest()
	{
		PriorityQueueHospital<Person> hos = new PriorityQueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 2);
		SickPerson patient2 = new SickPerson("alice", 15, 5);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Returns wrong number of patients", 2, hos.numPatients());
	}
	
	@Test
	public void treatNextPatientTest()
	{
		PriorityQueueHospital<Person> hos = new PriorityQueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 2);
		SickPerson patient2 = new SickPerson("alice", 15, 5);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Treats patient incorrectly", patient2, hos.treatNextPatient());
		Assert.assertEquals("Treated patient not removed", 1, hos.numPatients());
	}
}
