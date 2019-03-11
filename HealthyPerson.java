
public class HealthyPerson extends Person
{
	private String reason;
	
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
	}
	
	//UML says protected
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
