package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// �ؾ��Ұ� 3����
// 1. @WebServlet("/HelloServlet")�� -> ("/hello")�� �ٲ����
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {		// 2. class �̸� ����
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {		// 3. ������ �̸� ����
        super();
        System.out.println("������ ��");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");	
		response.setContentType("text/html; charset=UTF-8");	// �ѱ��� ������ ���ڿ� �ȿ� ("text/html; charset=UTF-8") �־��ּ�
		PrintWriter out = response.getWriter();		
		// �� �� ����ϰ� HTML���� �ۼ��ϴ� ��� 2��°
		out.println(
			"<html>" + 
					"<body>" +
						"<h1>ȣ����</h1>" + 
					"</body>" +
			"</html>"		
		);
		
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}