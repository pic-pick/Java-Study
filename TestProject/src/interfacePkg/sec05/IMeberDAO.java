package interfacePkg.sec05;

import java.util.ArrayList;

//쇼핑몰에서 회원관리를 위한 DAO 인터페이스
//회원관리 기능
//1. 회원가입 : 1명의 회원 정보를 받아서 DB에 저장하고 종료. 반환값 없음
//2. 회원탈퇴 : 1명 회원의 memId를 전달받아서 DB에서 해당 회원을 찾아서 삭제하고 종료. 반환값 없음
//3. 회원정보검색 : 1명 회원의 id를 전달받아서 DB에서 해당 회원 정보를 검색하고 검색된 결과를 반환. 반환값 없음
//4. 회원정보 수정 : 1명 회원의 수정된 정보를 전달 받아서 DB에서 해당 회원의 id를 이용해 수정진행하고 종료. 반환값 없음
//관리자 기능
//5. 회원전체조회 : DB 회원테이블에서 전체 회원 정보를 검색해서 반환. 매개변수는 없고, 반환값 있음.
//6. 회원 이름을 조회 : 이름에 대한 일부 문자열을 전달 받ㄱ아서 DB 회원테이블에서 이름의 일부가 일치하는 정보를 검색해서 반환.
//					매개변수는 있고, 반환값도 있음.
public interface IMeberDAO {
	//1.회원가입
	public void insertMember(MemberDTO dto);
	
	//2.회원탈퇴 - id필요
	public void deleteMember(String memId);
	
	//3.회원정보 검색
	public MemberDTO selectMember(String memId);
	
	//4.회원정보 수정 - 수정은 해당 id 레코드의 모든 정보를 수정
	public void updateMember(MemberDTO dto);
	
	//5.전체 회원 정보 검색 - 한명의 정보 MemberDTO에 담기고 여러명은 MemberDTO를 배열과 같은 콜렉션에서 담아서 변환
	public ArrayList<MemberDTO> getAllMember(String nameStr);
}
