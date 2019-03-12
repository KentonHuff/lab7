/*
 * A class describing a healthy person visiting a hospital
 */
public class HealthyPerson extends Person
{
	//The reason that the healthy person id visiting the hospital
	private String reason;
	
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
	}
	
	//Compares to other healthy people based on name ignoring case. Returns 0 if not a healthy person
	@Override
	protected int compareToImpl(Person o)
	{
		if(!(o instanceof HealthyPerson))
		{
			return 0;
		}
		
		return this.getName().compareToIgnoreCase(o.getName());
	}
	
	@Override
	public String toString()
	{
		return String.format("%s In for %s", super.toString(), reason);
	}
}
