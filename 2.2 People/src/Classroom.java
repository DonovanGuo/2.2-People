
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
		if(this.teacher instanceof Teacher)
		{
			return ((Teacher)this.teacher).getSubject();
		}
		return null;
	}
	
	public double classAverage()
	{
		double ClassGpa = 0;
		for(int i = 0; i < this.student.length; i++)
		{
			ClassGpa = ClassGpa + ((Student)this.student[i]).getGPA();
		}
		return ClassGpa / this.student.length;
	}
	public String printClass()
	{	 
		String totalClassstud = ((Teacher)this.teacher).toString();
		for(int i =0; i < this.student.length; i++)
		{
			totalClassstud += "/n" + ((Student)this.student[i]).toString();  
		}
		return totalClassstud;
	}
}

