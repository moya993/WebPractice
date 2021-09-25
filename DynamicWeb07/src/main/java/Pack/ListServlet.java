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
		list.add("����");
		list.add("ȣ����");
		list.add("�Ǿ�");
		
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
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<td>�̸�</td>");
			out.println("<td>����</td>");
			out.println("<td>����</td>");
			out.println("</tr>");
			for (int i = 0; i < list.size(); i++) {
				out.println("<tr>");
				out.println("<td>"+list.get(i));
				out.println("</td>");
				out.println("<td><a href='sign'>����</a></td>");
				out.println("<td>����</td>");
				out.println("</tr>");
				
			}
			
			out.println("</table>");
			out.println("</body>");
		out.println("</html>");		
		out.close();
		
		
		
		
		
		
		
	}


}