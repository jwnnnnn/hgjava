package co.yedam.member.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;

public class x_LoginForm implements Control { //로그인 게시판 이동

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "WEB-INF/view/member/loginForm.jsp";
		req.getRequestDispatcher(path).forward(req, resp);
	}

}
