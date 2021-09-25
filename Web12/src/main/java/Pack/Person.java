package Pack;


// Person 클래스는 getter,setter함수 만드려고 만듬
// 밑에는 자바bin을 만든 것
public class Person {
	String id;
	String pass;
	
	public Person() {
		System.out.println("생성자 콜");
	}
	
	
	public String getId() {
		System.out.println(1);
		return id;
		}
	public void setId(String id) {
		System.out.println("setId 콜됨");
		this.id = id;
	}
	public String getPass() {
		System.out.println(2);
		return pass;
	}
	public void setPass(String pass) {
		System.out.println("setPass 콜됨");
		this.pass = pass;
	}
	
}
