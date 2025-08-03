package interfacePkg.sec05;

public class MemberMain {

	public static void main(String[] args) {
		// DTO DAO 활용 예제
		// 회원가입을 위한 정보가 전달되었다고 가정
		MemberDTO dto = new MemberDTO("abcd", "1234", "010-0000-0000", "서울");
		
		// DTO에게 전달ㄷ해서 회원가입 메서드가 실행되어야 함
		IMeberDAO idao = new MemberDAO();
		MeberDAO dao = new MeberDAO();
		
		idao.insertMember(dto);
		dao.insertMember(dto);
		
		//회원검색
		idao.selectMember("123");
		//검색된 결과인 dto를 view로 넘겨서 프론트를 완성 클라이언트에게 전달
	}

}
