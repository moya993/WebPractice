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
    	System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");		// �ѱ� �ȱ����� �־������
		System.out.println("register doGet");

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("register doPost");
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");		// insert.html�� �ִ� id�� value="ȣ����"�� �����°���
		System.out.println(id);		// insert.html�� �ִ� value="ȣ����"�� �����°���
		
		response.setContentType("text/html;charset=UTF-8");		// �ѱ� �ȱ����� �־������
		PrintWriter out = response.getWriter();		// html�������� out�̸����� ��ü���� ��
		out.println("<html>");		
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
			
				out.println("<h1>" + id + "���Ե�" + "</h1>");
				
			out.println("</body>");
		out.println("</html>");		
		out.close();


		
	}


}