package co.yedam.member.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.yedam.common.Control;
import co.yedam.member.Member;
import co.yedam.member.service.MemberService;
import co.yedam.member.service.MemberServiceImp1;

public class AddMemberControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		// 1) 요청정보
		// 2) 저장경로
		// 3) 최대크기
		// 4) 인코딩
		// 5) 리네임정책
		req.setCharacterEncoding("utf-8");
		
		String savePath =  req.getServletContext().getRealPath("images");
		int maxSize = 1024 * 1024 *5 ;
		String enc = "utf-8";
		MultipartRequest multi = new MultipartRequest(req,savePath,maxSize,enc, new DefaultFileRenamePolicy());
		
		String id = multi.getParameter("id");
		String pw = multi.getParameter("pw");
		String name = multi.getParameter("name");
		String img = multi.getFilesystemName("image"); // 업로드 되고나서 변경된 파일이름.
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		member.setImage(img);
		
		MemberService svc = new MemberServiceImp1();
		if (svc.addMember(member) ) {
			resp.sendRedirect("boardList.do");
		}else {
			req.setAttribute("message", "삭제 중 에러가 발생했습니다.");
			String path = "WEB-INF/view/error.jsp"; // 원래페이지로 이동.
			req.getRequestDispatcher(path).forward(req, resp);
		}
		// mapper: insertMember
		// service: addMember
		// 게시글목록 이동/ 에러페이지로 이동
		
	}

}
