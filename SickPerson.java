
public class SickPerson extends Person
{
	private int severity;
	
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.severity = severity;
	}
	
	@Override
	protected int compareToImpl(Person o)
	{
		if(!(o instanceof SickPerson))
		{
			return 0;
		}
		
		SickPerson other = (SickPerson)o;
		
		return other.severity - this.severity;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), severity);
	}
}
