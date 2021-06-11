package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.action.Action;

@WebServlet(urlPatterns = {"*.action"})
public class FrontController extends HttpServlet {

	public void doPost(HttpServletRequest request , HttpServletResponse response )
	throws ServletException , IOException{
	
		PrintWriter out = response.getWriter();
		
		if (out.equals("regist.action")) {
			try {
				String path = request.getServletPath().substring(1);
				String name = path.replace(".a", "A").replace('/', '.');
				Action action = (Action)Class.forName(name).getDeclaredConstructor().newInstance();
				String url = action.execute(request, response);
				request.getRequestDispatcher(url).forward(request, response);
			}
			catch(Exception e) {
				e.printStackTrace(out);
			}
		}
		
		else if (out.equals("modify.action")) {
			try {
				String path = request.getServletPath().substring(1);
				String name = path.replace(".a", "A").replace('/', '.');
				Action action = (Action)Class.forName(name).getDeclaredConstructor().newInstance();
				String url = action.execute(request, response);
				request.getRequestDispatcher(url).forward(request, response);
			}
			catch(Exception e) {
				e.printStackTrace(out);
			}
		}
		
		else if (out.equals("delete.action")) {
			try {
				String path = request.getServletPath().substring(1);
				String name = path.replace(".a", "A").replace('/', '.');
				Action action = (Action)Class.forName(name).getDeclaredConstructor().newInstance();
				String url = action.execute(request, response);
				request.getRequestDispatcher(url).forward(request, response);
			}
			catch(Exception e) {
				e.printStackTrace(out);
			}
		}
	}
	
	public void doGet(HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException{
				doPost(request , response);
	}
}
