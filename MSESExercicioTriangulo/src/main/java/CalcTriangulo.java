

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcTriangulo
 */
@WebServlet("/CalcTriangulo")
public class CalcTriangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletRequest request;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcTriangulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("").append(" ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int lado1 = Integer.parseInt(request.getParameter("n"));
		int lado2 = Integer.parseInt(request.getParameter("n2"));
		int lado3 = Integer.parseInt(request.getParameter("n3"));
	      
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
			response.getWriter().println(" E um triangulo");
		}
		
		
		
		else {
			response.getWriter().println(" N?o ? um triangulo");
			
		}
		
		
		if(lado1 == lado2 && lado1 == lado3 || lado2 == lado1 && lado2 == lado3 || lado3 == lado1 && lado3 == 2) {
			response.getWriter().println("ISSO ? UM TRI?NGULO EQUIL?TERO! ");     			
		}
		else if(lado1 == lado2 && lado1 != lado3 || lado1== lado3 && lado1 != lado2 || lado2 == lado1 && lado2 != lado3 || lado2 == lado3 && lado2 != 1 || lado3 == lado1 && lado3 != lado2 || lado3== lado2 && lado3 != lado1) {
			response.getWriter().println("ISSO ? UM TRI?NGULO IS?SCELES! ");     		
		}
		else if(lado1 != lado2 && lado1 != lado3 || lado2 != lado1 && lado2 != lado3 || lado3 != lado1 && lado3 != 2) {
			response.getWriter().println("ISSO ? UM TRI?NGULO ESCALENO! ");     			
		}	
			
		

		
	
	}
	

	
	
	


}
