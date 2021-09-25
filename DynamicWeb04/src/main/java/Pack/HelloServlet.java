package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 해야할것 3가지
// 1. @WebServlet("/HelloServlet")을 -> ("/hello")로 바꿔야함
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {		// 2. class 이름 변경
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {		// 3. 생성자 이름 변경
        super();
        System.out.println("생성자 콜");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");	
		response.setContentType("text/html; charset=UTF-8");	// 한글을 쓰려면 문자열 안에 ("text/html; charset=UTF-8") 넣어주셈
		PrintWriter out = response.getWriter();		
		// 좀 더 깔끔하게 HTML문서 작성하는 방법 2번째
		out.println(
			"<html>" + 
					"<body>" +
						"<h1>호랑이</h1>" + 
					"</body>" +
			"</html>"		
		);
		
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}