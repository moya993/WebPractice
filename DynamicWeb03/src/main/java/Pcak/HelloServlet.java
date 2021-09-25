package Pcak;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {
        super();
        System.out.println("생성자 콜");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		PrintWriter out = response.getWriter();		// HTML을 만드는 객체를 생성한 것, PrintWriter은 import해야함
		out.println("<html>");		// 이제 문자열 사이에 태그를 입력해여 함, 구성은 html과 동일
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
			out.println("<h1> Tiger100 </h1>");	// 원래는 한글이 안됨, 나중에 바꿔줘야함
			out.println("</body>");
		out.println("</html>");		
		out.close();	// 태그 설정 마치고 close로 닫아줘야함
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
