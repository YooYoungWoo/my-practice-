public class MemberService {
	String id;
	String password;
	
	public boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else return false; // �޼ҵ� 
	}
	public void logout(String id) {
		if(id == "hong") {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	} // �޼ҵ�

}
