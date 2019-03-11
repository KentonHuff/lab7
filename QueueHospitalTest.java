import org.junit.Assert;
import org.junit.Test;

public class QueueHospitalTest
{
	@Test
	public void QueueHospitalConstructorTest()
	{
		QueueHospital<SickPerson> hos = new QueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Returns wrong patient", patient1, hos.nextPatient());
	}
	
	@Test
	public void addPatientTest()
	{
		QueueHospital<SickPerson> hos = new QueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		hos.addPatient(patient1);
		
		Assert.assertEquals("Patient added incorrectly", patient1, hos.nextPatient());
	}
	
	@Test
	public void allPatientInfoTest()
	{
		QueueHospital<SickPerson> hos = new QueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		String expected = patient1.toString() + patient2.toString();
		
		Assert.assertEquals("allPatientInfo formatted incorrectly", expected, hos.allPatientInfo());
	}
	
	@Test
	public void hospitalTypeTest()
	{
		QueueHospital<SickPerson> hos = new QueueHospital<>();
		
		Assert.assertEquals("hospitalType returns incorrect value", "QueueHospital", hos.hospitalType());
	}
	
	@Test
	public void nextPatientTest()
	{
		QueueHospital<SickPerson> hos = new QueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Returns wrong patient", patient1, hos.nextPatient());
	}
	
	@Test
	public void numPatientsTest()
	{
		QueueHospital<SickPerson> hos = new QueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Number of patients calculated incorrectly", 2, hos.numPatients());
	}
	
	@Test
	public void treatNextPatientTest()
	{
		QueueHospital<SickPerson> hos = new QueueHospital<>();
		
		SickPerson patient1 = new SickPerson("bob", 15, 5);
		SickPerson patient2 = new SickPerson("alice", 15, 2);
		
		hos.addPatient(patient1);
		hos.addPatient(patient2);
		
		Assert.assertEquals("Wrong patient treated", patient1, hos.treatNextPatient());
		Assert.assertEquals("Treated patient not removed", 1, hos.numPatients());
	}
}
