package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet() {
    	super();
    	System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("update doGet");
				
		String id = request.getParameter("id");
		
		
		PrintWriter out = response.getWriter();		
		out.println("<html>");		
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
			
			out.println("<h1>" + id + "수정됨" + "</h1>");
		
		out.println("</body>");
		out.println("</html>");		
		out.close();

		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");		// 한글 안깨지게 넣어줘야함
		System.out.println("update doPost");
	}

}