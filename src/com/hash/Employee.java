package com.hash;

public class Employee {
	
	int hash;
	
	String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
	
		final int prime = 31;
		int result = 1;
		result = prime * result + hash;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("hash..."+result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals....");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (hash != other.hash)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
		
	

}
