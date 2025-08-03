package interfacePkg.sec05;

import java.util.ArrayList;

public class MemberDAO implements IMeberDAO {
	//db connection data 필드
	//db 연결 코드 : 연결 메서드가 필요함
	
	//실제 구현은 db연동에 의한 db 접근이 진행되어야 하고
	//관련 쿼리를 전달해서 각 기능이 수행되게 해야 함
	@Override
	public void insertMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		String id =dto.getMemId();
		
		
	}

	@Override
	public void deleteMember(String memId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO selectMember(String memId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MemberDTO> getAllMember(String nameStr) {
		// TODO Auto-generated method stub
		return null;
	}

}
