package board_package;

import java.util.ArrayList;
import java.util.LinkedList;

public class Control {
	
	ArrayList<Model_Member> model_Members = new ArrayList<>();
	ArrayList<Model_Board>model_Boards = new ArrayList<>();
	LinkedList<Model_Reply>model_Replies = new LinkedList<>();
	
	// 1. 회원가입
	public byte join (String id, String pw) {
		// 아이디 조건 충족 여부 검사 시작
		if(id.length()<5 || id.length() > 16) {
			return 1;	// 아이디 글자수가 5자 미만이거나 16자 초과인 경우 1을 리턴
		}
		char[] tmp1 = new char[id.length()];	// 아이디 글자수 만큼의 길이를 가진 char 배열을 선언
		
		for(int i=0; i<id.length(); i++) {
			tmp1[i]=id.charAt(i);
			if(tmp1[i] < 0x41 || (0x5A < tmp1[i] && tmp1[i] < 0x61) || tmp1[i] > 0x7A) {
					// A~Z 가 아니거나 a~z가 아닌지 검사해서
				return 2;	// 아이디에 영어 소문자나 영어 대문자가 아닌게 들어간 경우 2을 리턴
			}
		}	// 아이디 조건 충족 여부 검사 종료
		// 비밀번호 조건 충족 여부 검사 시작
		if(pw.length()<5 || pw.length() > 16) return 3;	// 비번 글자수 5자 미만 또는 16자 초과 여부 확인
		tmp1 = new char[pw.length()];
		boolean pwCheck=false;	// 반복문 끝나고도 false이면 가입 실패 처리
		
		for(int i=0; i<pw.length(); i++) {	// 비번에 숫자가 있는지 검사하는 반복문
			tmp1[i] = pw.charAt(i);
			if(0x30 < tmp1[i] && tmp1[i] < 0x39) pwCheck = true;
		}
		if (pwCheck==false) return 4;	// 비번에 숫자가 없음.
		model_Members.add(new Model_Member(id, pw));	// 리스트 객체에 추가.
		return 0;	// 정상적으로 가입 성공시 0 리턴
	}	// join END
	
	// 2. 로그인
	public boolean login (String id, String pw) {
		boolean flag=false;
		for(Model_Member tmp : model_Members) {
			if(tmp.getId().equals(id) && tmp.getPw().equals(pw))
				flag=true;
		}
		return false;
	}
	
	// 3. 글쓰기
	
	
}	// c e
