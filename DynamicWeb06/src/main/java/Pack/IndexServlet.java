package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 해야할것 3가지
// 1. @WebServlet("/HelloServlet")을 -> ("/hello")로 바꿔야함
@WebServlet("/")		// index를 쓰고싶으면 root(/)만 써야함
public class IndexServlet extends HttpServlet {		// 2. class 이름 변경
	private static final long serialVersionUID = 1L;
       
    public IndexServlet() {		// 3. 생성자 이름 변경
        super();
        System.out.println("생성자 콜");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아래 두 이유 때문에 동적인 프로그램이라고 한다.
		// Servlet이 필요한 이유 : 데이터 베이스 접속이 필요하기 때문
		// 정보를 로딩한다.
		
		// foward : 원하는 사이트로 이동가능하게 도화줌
		System.out.println("doGet");	
		ServletContext context = getServletContext();		// foward를 하기 위한 객체 생성
		RequestDispatcher dispatchar =context.getRequestDispatcher("/test.jsp");	// 방향을 지정해주는 것을 dispatchar라고 함
		dispatchar.forward(request, response);	
		// DynamicWeb06에서 new -> jsp File 누르고 이름을 index로 생성하면 그게 jsp임
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}