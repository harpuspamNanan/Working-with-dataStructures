package workingWithMaps;

public class Student implements Comparable<Student>
{
	

	String name, studentId;
	int age;

	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", studentId=");
		builder.append(studentId);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Student arg0) 
	{
		// TODO Auto-generated method stub
		return  (name.compareTo(arg0.name));
	}

}
