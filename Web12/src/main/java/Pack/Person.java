package Pack;


// Person Ŭ������ getter,setter�Լ� ������� ����
// �ؿ��� �ڹ�bin�� ���� ��
public class Person {
	String id;
	String pass;
	
	public Person() {
		System.out.println("������ ��");
	}
	
	
	public String getId() {
		System.out.println(1);
		return id;
		}
	public void setId(String id) {
		System.out.println("setId �ݵ�");
		this.id = id;
	}
	public String getPass() {
		System.out.println(2);
		return pass;
	}
	public void setPass(String pass) {
		System.out.println("setPass �ݵ�");
		this.pass = pass;
	}
	
}
