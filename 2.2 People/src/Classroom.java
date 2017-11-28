
public class Classroom 
{
	private Person[] student;
	private Person teacher;
	public Classroom( Person[] student , Person teacher)
	{
		this.student = student; 
		this.teacher = teacher;
	}
	public String getSubject()
	{
			return ((Teacher)teacher).getSubject();
	}
	
	public double classAverage()
	{
		double ClassGpa = 0;
		for(int i = 0; i < student.length; i++)
		{
			
			ClassGpa = ClassGpa + ((Student)student[i]).getGPA();
		}
		return ClassGpa / student.length;
	}
	public String printClass()
	{	 String totalClassstud = "";
		for(int i =0; i < student.length; i++)
		{
			totalClassstud += "/n" (())  
		}
	}
}

