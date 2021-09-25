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
        System.out.println("������ ��");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		PrintWriter out = response.getWriter();		// HTML�� ����� ��ü�� ������ ��, PrintWriter�� import�ؾ���
		out.println("<html>");		// ���� ���ڿ� ���̿� �±׸� �Է��ؿ� ��, ������ html�� ����
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
			out.println("<h1> Tiger100 </h1>");	// ������ �ѱ��� �ȵ�, ���߿� �ٲ������
			out.println("</body>");
		out.println("</html>");		
		out.close();	// �±� ���� ��ġ�� close�� �ݾ������
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
