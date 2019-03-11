import org.junit.Assert;
import org.junit.Test;

public class SickPersonTest
{
	@Test
	public void SickPersonConstructorTest()
	{
		SickPerson person1 = new SickPerson("Bob", 45, 3);
		Assert.assertEquals("SickPerson constructed incorrectly", "Bob, a 45-year old. Severity level 3", person1.toString());
	}
	
	@Test
	public void compareToImplTest()
	{
		HealthyPerson person1 = new HealthyPerson("Bob", 25, "visiting");
		SickPerson person2 = new SickPerson("Alice", 45, 1);
		SickPerson person3 = new SickPerson("Jeff", 45, 1);
		SickPerson person4 = new SickPerson("Bridget", 45, 2);
		
		Assert.assertEquals("Equality between a sick and a helathy person", 0, person2.compareToImpl(person1));
		Assert.assertEquals("person4 should be before person2", -1, person4.compareToImpl(person2));
		Assert.assertEquals("person2 should be after person4", 1, person2.compareToImpl(person4));
		Assert.assertEquals("person2 and person3 should be equivalent in ordering", 0, person2.compareToImpl(person3));
	}
	
	@Test
	public void toStringTest()
	{
		SickPerson person1 = new SickPerson("Bob", 45, 3);
		Assert.assertEquals("toString returns incorrect value", "Bob, a 45-year old. Severity level 3", person1.toString());
	}
}
