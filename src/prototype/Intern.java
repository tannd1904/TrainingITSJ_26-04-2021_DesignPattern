package prototype;

public class Intern implements Prototype{
	private String id;
	private String name;
	private int age;
	private String gender;
	
	public Intern(String id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
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



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public void show() {
		System.out.println(this.getId() + "\t" + this.getName() + "\t" 
				+ this.getAge() + "\t" + this.getGender());
	}
	
	@Override
	public Prototype getClone() {
		return new Intern(id, name, age, gender);
	}
}
