package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardGomodify implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer requestURL = request.getRequestURL();
		String queryString = request.getQueryString();
		String data = null;
		if(queryString == null) {
			data = requestURL.toString();
		} else {
			data = requestURL.append('?').append(queryString).toString();
		}
		data = data.substring(data.indexOf("=") + 1);
		request.setAttribute("data", data);
		return "boardmodify.jsp";
	}

}
