package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class ResisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ResisterServlet() {
    	super();
    	System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");		// 한글 안깨지게 넣어줘야함
		System.out.println("register doGet");

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("register doPost");
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");		// insert.html에 있는 id인 value="호랑이"를 가져온거임
		System.out.println(id);		// insert.html에 있는 value="호랑이"를 가져온거임
		
		response.setContentType("text/html;charset=UTF-8");		// 한글 안깨지게 넣어줘야함
		PrintWriter out = response.getWriter();		// html쓰기위해 out이름으로 객체생성 함
		out.println("<html>");		
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
			
				out.println("<h1>" + id + "가입됨" + "</h1>");
				
			out.println("</body>");
		out.println("</html>");		
		out.close();


		
	}


}