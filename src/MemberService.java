public class MemberService {
	String id;
	String password;
	
	public boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else return false; // 메소드 
	}
	public void logout(String id) {
		if(id == "hong") {
			System.out.println("로그아웃 되었습니다.");
		}
	} // 메소드

}
