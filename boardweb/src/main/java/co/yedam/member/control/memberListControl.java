package co.yedam.member.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.common.PageDTO;
import co.yedam.common.SearchVO;
import co.yedam.member.Member;
import co.yedam.member.service.MemberService;
import co.yedam.member.service.MemberServiceImp1;

public class memberListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page = req.getParameter("page");
		page = page == null ? "1" : page;
		
		String searchCond = req.getParameter("searchCondition");
		String keyword = req.getParameter("keyword");
		
		// 검색조건. (VO) 하나의 데이터를 가지고와서 담고 전달하기위한 것.
		SearchVO search = new SearchVO();
		search.setPage(Integer.parseInt(page));
		search.setSearchCondition(searchCond);
		search.setKeyword(keyword);
		
		// 조회조건.
		MemberService svc = new MemberServiceImp1();
		List<Member> list = svc.MemberList(search);
		
		
		
		PageDTO pageDTO = new PageDTO(Integer.parseInt(page), svc.MemberTotalCnt(search));
		
					//list -> 데이터베이스 처리된 결과를 담고 있음.
					//boradList.do 페이지에서 boardList.jsp 로 데이터 전달
		req.setAttribute("list", list);
		req.setAttribute("page", pageDTO);
		req.setAttribute("searchCondition", searchCond);
		req.setAttribute("keyword", keyword);
	
		String path = "member/memberList.tiles";
		req.getRequestDispatcher(path).forward(req, resp);

	}

}
