package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@WebServlet("/insert")     
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		// 1. 파라미터로 전송된 값을 얻어오기.
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		System.out.println(id);
		
		// 3. 사용자(클라이언트)에 결과를 응답하기.
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();		// HTML을 만드는 객체를 생성한 것, PrintWriter은 import해야함
		out.println("<html>");		// 이제 문자열 사이에 태그를 입력해여 함, 구성은 html과 동일
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
			if(id != null) {
				out.println(id + "님 환영합니다.");				
			}else {
				out.println("로그인에 실패하였습니다.");
			}
			out.println("</body>");
		out.println("</html>");		
		out.close();
		
		
		
		
		
		
		
	}


}
