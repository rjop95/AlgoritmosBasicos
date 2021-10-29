
public class Dog {
	
	private String name;
	private int age;
	
	
	
	// this se puede utilizar llamando a otro constructor,
	
	public Dog() {
	    this("Firulais", 15); //al utilizar this con parentesis java sabe que esta llamando a otro constructor
	}
	
	// Constructor
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//getters and setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	
}

