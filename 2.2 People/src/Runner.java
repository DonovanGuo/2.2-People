import java.util.Random;

public class Runner
{
	static String[] firstNames;
	static String[] familyNames;
	static int[] height;
	static double[] GPA;
	static int[] grade;
	static String[] school;
	public static void main(String[] args)
	{
		Person teacher new Teacher();
		Person[] student = new Person[10];
		Classroom classroom = new Classroom(student, teacher);
		
		System.out.println(Classroom.printClass());
	}
	public Person randomStudent()
	{
		Random r = new Random();
		String ranfirstname = firstNames[r.nextInt(firstNames.length)];
		String ranfamilyname = familyNames[r.nextInt(familyNames.length)];
		
		Student student = new Student();
		return student;
	}
	public String ranbrithdate()
	{
		
	}

}
