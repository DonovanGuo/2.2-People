
public class Student extends Person 
{
	private double GPA;
	private int grade;
	private String school;
	public Student(String FirstName, String FamilyName, String BirthDate, int height, double GPA, int grade, String school) 
	{
		super(FirstName , FamilyName, BirthDate, height);
		this.GPA = GPA;
		this.grade = grade;
		this.school = school;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getSchool() {
		return school;
	}

	@Override
	public String toString() {
		return "Student - Family Name:" + getFamilyName() + "First Name:" + getFirstName();
	}
	
}
