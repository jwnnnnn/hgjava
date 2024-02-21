package co.yedam.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// init -> service -> destroy
public class FrontController extends HttpServlet {
	
	
	// Map 타입으로 url과 실행할 클래스를 등록.
	//String 타입인 Control 클래스의 값
	Map<String, Control> controls;
	
	public FrontController(){
		controls = new HashMap<>();
	}
	
	
	// init. 최초한번 실행.
	@Override
	public void init(ServletConfig config) throws ServletException {
		controls.put("/resume.do", new ResumeForm());
		//System.out.println("init 실행.");
		//controls.put("/a.do", new Acontrol());
		//controls.put("/b.do", new Bcontrol());
	}
	
	
	// service. 요청떄마다 실행.
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//	System.out.println("service 실행.");
		String uri = req.getRequestURI();
	//	System.out.println("uri: " + uri);
		String context = req.getContextPath();
	//	System.out.println("context:  " + context);
		String path = uri.substring(context.length());
		System.out.println("path:  " + path);
		
		Control control = controls.get(path);
		control.exec(req, resp); //요청 url에 따른 실행컨트롤을 호출.
	}
	
	
	// destroy
	
}
