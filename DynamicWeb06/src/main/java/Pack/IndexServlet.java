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


// �ؾ��Ұ� 3����
// 1. @WebServlet("/HelloServlet")�� -> ("/hello")�� �ٲ����
@WebServlet("/")		// index�� ��������� root(/)�� �����
public class IndexServlet extends HttpServlet {		// 2. class �̸� ����
	private static final long serialVersionUID = 1L;
       
    public IndexServlet() {		// 3. ������ �̸� ����
        super();
        System.out.println("������ ��");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �Ʒ� �� ���� ������ ������ ���α׷��̶�� �Ѵ�.
		// Servlet�� �ʿ��� ���� : ������ ���̽� ������ �ʿ��ϱ� ����
		// ������ �ε��Ѵ�.
		
		// foward : ���ϴ� ����Ʈ�� �̵������ϰ� ��ȭ��
		System.out.println("doGet");	
		ServletContext context = getServletContext();		// foward�� �ϱ� ���� ��ü ����
		RequestDispatcher dispatchar =context.getRequestDispatcher("/test.jsp");	// ������ �������ִ� ���� dispatchar��� ��
		dispatchar.forward(request, response);	
		// DynamicWeb06���� new -> jsp File ������ �̸��� index�� �����ϸ� �װ� jsp��
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}