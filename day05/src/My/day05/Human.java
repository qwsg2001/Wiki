package My.day05;

public class Human {

	private String name;
	private int age;
	private String addr;
	
	public Human(String name, int age) {
		this(name,age, "대전 동구 용운동");
	}

	public Human(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
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

	public String getAddr() {
		return addr;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
