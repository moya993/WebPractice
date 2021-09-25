package Pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@WebServlet("/list")     
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<String> list = new ArrayList<String>();
		list.add("사자");
		list.add("호랑이");
		list.add("악어");
	
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();		// HTML을 만드는 객체를 생성한 것, PrintWriter은 import해야함
		out.println("<html>");		// 이제 문자열 사이에 태그를 입력해여 함, 구성은 html과 동일
			out.println("<head>");
			out.println("</head>");
			
			
			out.println("<body>");
			out.println("<table border='1' style = 'text-align:center' width = '80%'>");
			out.println("<tr>");
			out.println("<th>이름</th>");
			out.println("<th>삭제</th>");
			out.println("<th>수정</th>");
			out.println("</tr>");
			for (int i = 0; i < list.size(); i++) {
				out.println("<tr>");
				out.println("<td>"+list.get(i));
				out.println("</td>");
				out.println("<td><a href='delete'>삭제</a></td>");
				out.println("<td><a href='sign'>수정</a></td>");
				out.println("</tr>");
				
			}
			
			out.println("</table>");
			out.println("</body>");
		out.println("</html>");		
		out.close();
		
		
		
		
		
		
		
	}


}