package jdbcproj;

public class Customers {
	private int customer_id;
	private String first_name;
	private String last_name;
	private Gender gender;
	private String email_address;
	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int number_of_complaints;
	
	public Customers() {
		
	}

	public Customers(int customer_id, String first_name, String last_name, Gender gender, String email_address,
			int number_of_complaints) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.email_address = email_address;
		this.number_of_complaints = number_of_complaints;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public int getNumber_of_complaints() {
		return number_of_complaints;
	}

	public void setNumber_of_complaints(int number_of_complaints) {
		this.number_of_complaints = number_of_complaints;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customer_id;
		result = prime * result + ((email_address == null) ? 0 : email_address.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + number_of_complaints;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		if (customer_id != other.customer_id)
			return false;
		if (email_address == null) {
			if (other.email_address != null)
				return false;
		} else if (!email_address.equals(other.email_address))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (gender != other.gender)
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (number_of_complaints != other.number_of_complaints)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customers [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", gender=" + gender + ", email_address=" + email_address + ", number_of_complaints="
				+ number_of_complaints + "]";
	}
	
	
	

}
