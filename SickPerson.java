/*
 * A class describing a sick person in need of treatment at a hospital
 */
public class SickPerson extends Person
{
	//The severity of their illness/injury
	private int severity;
	
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.severity = severity;
	}
	
	//Orders SickPersons by decreasing severity, returns 0 if argument is not a SickPerson
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
