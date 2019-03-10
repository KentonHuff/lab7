
public class SickPerson extends Person
{
	private int severity;
	
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.severity = severity;
	}
	
	//UML says protected
	public int compareToImpl(Person o)
	{
		if(!(o instanceof SickPerson))
		{
			return 0;
		}
		
		SickPerson other = (SickPerson)o;
		
		if(this.severity > other.severity)
		{
			return -1;
		}
		else if(this.severity < other.severity)
		{
			return 1;
		}
		return 0;
	}
	
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), severity);
	}
}
