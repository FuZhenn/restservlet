package cn.com.seegoo.servletrest.servlets;

import javax.servlet.http.HttpServlet;

public class FServlet extends HttpServlet {
	private String id;

	public void setId(final String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
