package co.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import co.yedam.board.Board;
import co.yedam.board.mapper.BoardMapper;

public class MainExe {
	public static void main(String[] args) {
		SqlSessionFactory factory = DateSource.getInstance();
		SqlSession session = factory.openSession();
		
		//밑에 주석처리된거랑 결과값은 같음.
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<Board> list = mapper.boardList();
		//List<Board> list = session.selectList("co.yedam.board.mapper.BoardMapper.boardList");
		for(Board board : list) {
			System.out.println(board.toString());
		}
	
	}
}
