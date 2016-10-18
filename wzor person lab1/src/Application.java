public class Exercise1Person {
	public static void main(String[] args) {
		
		try{
			Person p = new PersonBuilder().withName("name1").withAge(30).build();
			System.out.println(p);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		
	}
}

public class Exercise1Person {
	public static void main(String[] args) {
		
		try{
			Person p = new PersonBuilder().withName("name1").withAge(30).build();
			System.out.println(p);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		
	}
}

public class PersonBuilder {
	private Person person;
	public PersonBuilder() {
		person = new Person();
	}
	public Person build() throws Exception {
		if (person.getName() == null) {
			throw new Exception("Name not definied.");
		}
		if (person.getAge() == 0) {
			throw new Exception("Age not definied.");
		}
		return person;
	}
	public PersonBuilder withAge(int age) {
		person.setAge(age);
		return this;
	}
	public PersonBuilder withName(String name) {
		person.setName(name);
		return this;
	}
}