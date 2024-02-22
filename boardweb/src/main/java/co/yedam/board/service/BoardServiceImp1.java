package co.yedam.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.board.Board;
import co.yedam.board.mapper.BoardMapper;
import co.yedam.common.DateSource;
import co.yedam.common.SearchVO;

	// 업무로직을 담고 있는 프로세스.
	// 데이터처리는 mapper 기능.
public class BoardServiceImp1 implements BoardService { 
	//BoardService의 기능을 구현하는 클래스.
	//BoardService의 메소드를 반드시 구현해야함.
	
	SqlSession session = DateSource.getInstance().openSession();
	BoardMapper mapper = session.getMapper(BoardMapper.class); 
										// BoardMapper.class 실행되는 시점에 class의 정보를 읽고 객체를 만들어줌.
	
	@Override
	public List<Board> boardList(SearchVO search) {
		System.out.println(search);
		return mapper.boardList(search);	}
	
	@Override
		public int boardTotalCnt(SearchVO search) {
			return mapper.getTotalCnt(search);
		}
	
	@Override
	public Board getBoard(int bno) {
		System.out.println(bno);
		return mapper.selectBoard(bno);
		
	}
}
