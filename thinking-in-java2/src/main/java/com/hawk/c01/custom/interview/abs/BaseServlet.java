package com.hawk.c01.custom.interview.abs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if (true) {
			try {
				doService(req, resp);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	protected abstract void doService(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
	protected abstract void prt(String str);
	
	protected void pt(String str) {
		prt(str);
	}
	
	
	
}
