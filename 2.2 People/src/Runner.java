import java.util.Random;

public class Runner
{
	static String[] firstNames = {"Stephen", "Stevenson", "Steve", "Esteban", "Stefan", "Stephan", "Stephano", "Stevie", "Stevan", "Stevon"};
	static String[] familyNames = {"King", "Jobs", "Hawking", "Seagal", "Spielberg", "Curry", "Buscemi", "Aoki", "Harvey"};
	static String[] BirthDates;
	static int[] height = {58, 59, 60, 61, 62, 63};
	static double[] GPA = {4.3, 4.4, 4.5, 4.6, 4.7, 4.8, 4.9, 5.0};// on 4.0 scale
	static int[] grade = {9, 10, 11, 12};
	static String[] school = {"Steven's Amazing School of Success", "Steven's High School", "Steven Tech", "Steven's Institute of Technology", "School of Steven's or Something Similar"};
	
	public static void main(String[] args)
	{
		//                            first     Last   Birth date   height   subject   title
		Person teacher = new Teacher("Steven", "Fong", "05/21/1997", 64, "Everything", "Mr.");
		Person[] students;
		students = new Person[34];
		for (int i = 0; i < students.length; i++)
		{
			students[i] = randomStudent();
		}
		Classroom classroom = new Classroom(students, teacher);
		
		System.out.println(ranschool() + "\n" + classroom.printClass() + "\n" + classroom.classAverage());
	}
	
	/*
	 * This creates a random grade to ensure all students in the array are in the same grade
	 */
	public static int rangrade()
	{
		Random r = new Random();
		int grad = grade[r.nextInt(grade.length)];
		return grad;
	}
	/*
	 * This chooses a random school and keeps that constant among all students in the class.
	 */
	public static String ranschool()
	{
		Random r = new Random();
		String schl = school[r.nextInt(school.length)];
		return schl;
	}
	/*
	 * for loop used to set value to a static field.
	 */
	public static Person randomStudent()
	{
		Random r = new Random();
		BirthDates = new String[15];
		for (int i = 0; i < 15; i++)
		{
			BirthDates[i] = ranbirthDate();
		}
		String firstName = firstNames[r.nextInt(firstNames.length)];
		String familyName = familyNames[r.nextInt(familyNames.length)];
		String birthdate = BirthDates[r.nextInt(BirthDates.length)];
		int h = height[r.nextInt(height.length)];
		double gpa = GPA[r.nextInt(GPA.length)];
		Person student = new Student(firstName, familyName, birthdate, h, gpa, rangrade(), ranschool());
		return student;
	}
	
	/*
	 * creates a random birth date for the student which is based on their grade
	 * years are limited to 2000 - 2003
	 */
	public static String ranbirthDate()
	{
		Random r = new Random();
		int month = r.nextInt(12) + 1;
		int year;
		int day = 0;
		if (rangrade() == 9)
		{
			year = 2003;
		}
		else if (rangrade() == 10)
		{
			year = 2002;
		}
		else if (rangrade() == 11)
		{
			year = 2001;
		}
		else
		{
			year = 2000;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			day = r.nextInt(31) + 1;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			day = r.nextInt(30) + 1;
		}
		else if (month == 2)
		{
			day = r.nextInt(28) + 1;
		}
		String birthday = month + "/" + day + "/" + year;
		return birthday;
	}
}
