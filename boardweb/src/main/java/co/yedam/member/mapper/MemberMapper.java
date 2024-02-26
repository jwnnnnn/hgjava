package co.yedam.member.mapper;

import java.util.List;

import co.yedam.board.Board;
import co.yedam.common.SearchVO;
import co.yedam.member.Member;

public interface MemberMapper {
	List<Member> MemberList(SearchVO search);
	int getTotalCnt(SearchVO search);
	
	Member selectMember(Member member);
	
	int insertMember(Member member);
}
