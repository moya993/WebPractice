package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("삭제 두갯");
		PrintWriter out = response.getWriter();
		out.println("<html>");		// 이제 문자열 사이에 태그를 입력해여 함, 구성은 html과 동일
		out.println("<head>");
		out.println("</head>");
		
		out.println("<body>");
			out.println("삭제 완료");
		out.println("</body>");
	out.println("</html>");		
	out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

