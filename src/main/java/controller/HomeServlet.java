package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/home/index","/home/news","/home/vanhoa"})
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest req,  HttpServletResponse resp)
    throws ServletException, IOException{
    	String uri = req.getRequestURI();
    	if(uri.contains("index")) {
    		req.setAttribute("view","/views/home/index.jsp");
    	}else if(uri.contains("news")) {
    		req.setAttribute("view","/views/home/news.jsp");
    	}else if(uri.contains("newsDetail")) {
    		req.setAttribute("view","/views/home/vanhoa.jsp");
    }
    	req.getRequestDispatcher("views/index.jsp").forward(req, resp);
    	
}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
