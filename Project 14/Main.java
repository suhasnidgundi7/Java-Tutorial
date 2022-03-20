class Student
{
    int student_id;
    String student_name, student_department;
    
    Student(int id, String name, String department)
    {
        student_id = id;
        student_name = name;
        student_department = department;
    }
    
    void display()
    {
        System.out.println("Student ID : "+student_id);
        System.out.println("Student Name : "+student_name);
        System.out.println("Student Department : "+student_department);
    }
}

class Main
{
	public static void main(String[] args) {
		Student newObj = new Student(1, "Suhas Nidgundi", "IT Department");
		newObj.display();
	}
}
