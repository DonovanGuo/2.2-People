
public class Classroom 
{
	private Person[] Student;
	private Teacher Teacher;
	public Classroom( Person[] Student , Teacher Teacher)
	{
		this.Student = Student; 
		this.Teacher = Teacher;
	}
	public String getSubject()
	{
		return Teacher.getSubject();
	}
	
}

