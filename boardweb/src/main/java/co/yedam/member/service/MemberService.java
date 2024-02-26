package co.yedam.member.service;

import java.util.List;

import co.yedam.board.Board;
import co.yedam.common.SearchVO;
import co.yedam.member.Member;

public interface MemberService {
	Member loginCheck(Member member);
	
	boolean addMember(Member member);
	
	List<Member> MemberList(SearchVO search);
	int MemberTotalCnt(SearchVO search);
	
	//단건조회.
	Member getBoard(int bno);
	
	//수정
	boolean ModifyMember(Board board);
	
	//삭제
	boolean removeMember(int bno);
	
	//추가
	boolean addMember(Board board);
}
