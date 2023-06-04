package dto;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;

	@Entity
	public class Person {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private long number;
		
		@OneToOne(cascade = CascadeType.ALL)
		private Aadhar aadhar;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getNumber() {
			return number;
		}
		public void setNumber(long number) {
			this.number = number;
		}
		public Aadhar getAadhar() {
			return aadhar;
		}
		public void setAadhar(Aadhar aadhar) {
			this.aadhar = aadhar;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", number=" + number + ", aadhar=" + aadhar + "]";
		} 

		
	}


