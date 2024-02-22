package co.yedam.board.mapper;

import java.util.List;

import co.yedam.board.Board;
import co.yedam.common.SearchVO;


public interface BoardMapper { // 인터페이스 -> 기능만 있음. 실행x
	List<Board> boardList(SearchVO search);
	int getTotalCnt(SearchVO search);
	
	// 상세화면에 사용될 데이터.
	Board selectBoard(int bno);
}

