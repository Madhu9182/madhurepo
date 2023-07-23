package Abstract;

public class Student extends Person{
	
	private int StudentID;
	
	public Student(String nm, String gen, int id) {
		super(nm, gen);
		// TODO Auto-generated constructor stub
		this.StudentID = id;
	}

	@Override
	public void Studying() {
		// TODO Auto-generated method stub
		if(StudentID == 0) {
			System.out.println("Not Studying");
		}else {
			System.out.println("pursuing a Degree in Bachelor of engin");
		}
		
	}
	public static void main(String[] args) {
		//coding in terms of abstract classes
		Person student = new Student("Priya","Female", 0);
		Person student1 = new Student("Madhu", "Male", 201510);
		student.Studying();
		student1.Studying();
		
	}

}
