package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign")
public class SignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("���� �ΰ�");
		PrintWriter out = response.getWriter();
		out.println("<html>");		// ���� ���ڿ� ���̿� �±׸� �Է��ؿ� ��, ������ html�� ����
		out.println("<head>");
		out.println("</head>");
		
		out.println("<body>");
			out.print("���� �Ϸ�");
		out.println("</body>");
	out.println("</html>");		
	out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}