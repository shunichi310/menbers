package jp.co.aforce.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistAction extends Action {
	public String execute(HttpServletRequest request , HttpServletResponse response)
	throws Exception{
		
		String name = request.getParameter("name");
		
		
		
		
		
		return name;
	}

}
