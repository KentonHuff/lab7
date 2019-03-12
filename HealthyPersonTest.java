import org.junit.Assert;
import org.junit.Test;

/*
 * A JUnit test class testing each method in the HealthyPerson class
 */
public class HealthyPersonTest
{
	@Test
	public void HealthyPersonConstructorTest()
	{
		HealthyPerson person1 = new HealthyPerson("Bob", 45, "visiting");
		Assert.assertEquals("HealthyPerson constructed incorrectly", "Bob, a 45-year old. In for visiting", person1.toString());
	}
	
	@Test
	public void compareToImplTest()
	{
		SickPerson person1 = new SickPerson("Bob", 45, 3);
		HealthyPerson person2 = new HealthyPerson("Alice", 45, "visiting");
		HealthyPerson person3 = new HealthyPerson("Alice", 45, "visiting");
		HealthyPerson person4 = new HealthyPerson("Jeff", 45, "visiting");
		
		Assert.assertEquals("A healthy person and a sick person equivalent in ordering", 0, person2.compareToImpl(person1));
		Assert.assertEquals("Alice comes before Jeff", "Alice".compareToIgnoreCase("Jeff"), person2.compareToImpl(person4));
		Assert.assertEquals("Jeff comes before Alice", "Jeff".compareToIgnoreCase("Alice"), person4.compareToImpl(person2));
		Assert.assertEquals("Alice should equal Alice", "Alice".compareToIgnoreCase("Alice"), person2.compareToImpl(person3));
	}
	
	@Test
	public void toStringTest()
	{
		HealthyPerson person1 = new HealthyPerson("Bob", 45, "visiting");
		Assert.assertEquals("toString() returns the wrong value", "Bob, a 45-year old. In for visiting", person1.toString());
	}
}
