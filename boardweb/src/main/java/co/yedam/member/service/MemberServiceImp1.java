package co.yedam.member.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.board.Board;
import co.yedam.common.DateSource;
import co.yedam.common.SearchVO;
import co.yedam.member.Member;
import co.yedam.member.mapper.MemberMapper;

public class MemberServiceImp1 implements  MemberService{
	SqlSession session = DateSource.getInstance().openSession(true);
	//openSession(true) 기본값은 false	//true -> 자동커밋하게 만듦.
    MemberMapper mapper = session.getMapper(MemberMapper.class); 
	// BoardMapper.class 실행되는 시점에 class의 정보를 읽고 객체를 만들어줌.
	@Override
	
	public Member loginCheck(Member member) {
		return mapper.selectMember(member);
		
	}
	@Override
	public boolean addMember(Member member) {
		return mapper.insertMember(member) == 1;
	}
	@Override
	public List<Member> MemberList(SearchVO search) {
		System.out.println(search);
		return mapper.MemberList(search);
	}
	@Override
	public int MemberTotalCnt(SearchVO search) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Member getBoard(int bno) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean ModifyMember(Board board) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeMember(int bno) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addMember(Board board) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
