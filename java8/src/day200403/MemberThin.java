package day200403;

public class MemberThin implements Cloneable { // �����Ϸ��� Cloneable �������̽��� �����ؾ� �Ѵ�.
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public MemberThin(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public MemberThin getMember() {
		MemberThin cloned = null;
		try {
			cloned = (MemberThin) clone(); // clone() �޼ҵ��� ���� Ÿ���� Object�� ĳ���� ��
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
