package ex0807.ex04;
class Student
{
	private String name;
	private String gender;
	private int score;
	
	public Student() {}

	public Student(String name,String gender, int score) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	
	public String getGender()
	{
		return gender;
	}
	public String getName() {
		return name;
	}



	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", score=");
		builder.append(score);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
