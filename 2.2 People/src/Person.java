
public abstract class Person
{
	private String FirstName;
	private String FamilyName;
	private String BirthDate;
	private int height; // inches
	
	public Person(String FirstName, String FamilyName, String BirthDate, int height)
	{
		this.FirstName = FirstName;
		this.FamilyName = FamilyName;
		this.BirthDate = BirthDate;
		this.height = height;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getFamilyName() {
		return FamilyName;
	}

	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person First Name = " + getFirstName() + ", Family Name = " + getFamilyName() + ", Birth date = "
				+ getBirthDate() + ", Height = " + getHeight() + ".";
	}











}
	
