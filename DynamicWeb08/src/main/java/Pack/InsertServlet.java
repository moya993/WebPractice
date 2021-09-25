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
	
		
		// 1. �Ķ���ͷ� ���۵� ���� ������.
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		System.out.println(id);
		
		// 3. �����(Ŭ���̾�Ʈ)�� ����� �����ϱ�.
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();		// HTML�� ����� ��ü�� ������ ��, PrintWriter�� import�ؾ���
		out.println("<html>");		// ���� ���ڿ� ���̿� �±׸� �Է��ؿ� ��, ������ html�� ����
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
			if(id != null) {
				out.println(id + "�� ȯ���մϴ�.");				
			}else {
				out.println("�α��ο� �����Ͽ����ϴ�.");
			}
			out.println("</body>");
		out.println("</html>");		
		out.close();
		
		
		
		
		
		
		
	}


}
