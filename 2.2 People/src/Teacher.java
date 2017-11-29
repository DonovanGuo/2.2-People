
public class Teacher extends Person
{
	private String subject;
	private String Title;
	
	public Teacher(String FirstName, String FamilyName, String BirthDate, int height, String subject, String Title)
	{
		super(FirstName, FamilyName, BirthDate, height);
		this.subject = subject;
		this.Title = Title;
	}

	public String getSubject() {
		return this.subject;
	}

	@Override
	public String toString() {
		return "Teacher:" + this.Title + getFamilyName() + ".";
	}
	

	
}
	

