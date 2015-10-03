public class Student
{
	public	int 	unitsearned;
	public 	int    	studentID; //student key
	public 	String 	name;
	public 	String	major;	
	
	public Student(int id, String Name, int UnitsEarned, String Major)
	{
		this.studentID = id;
		this.name = Name;
		this.major = Major;
		this.unitsearned = UnitsEarned;
	}
	
  @Override
  public String toString() //OVERRIDES DEFAULT TOSTRING METHOD AND RETURNS CUSTOM
  {
	String s = "Name: " + name 
			 + " *** Student ID: " + studentID 
			 + " *** Major: " + major 
			 + " *** UnitsEarned" + unitsearned;
    return s;
  }
}