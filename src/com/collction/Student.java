package com.collction;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called......");
		
		Student other = (Student) obj;
		
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
