package com.hawk.c01.custom.interview.abs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends BaseServlet{
	
	public MyServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doService(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in child doService");
		
	}
	
	public static void main(String[] args) {
		BaseServlet myServlet1 = new MyServlet1();
		myServlet1.prt("hehe");
	}

	@Override
	protected void prt(String str) {
		// TODO Auto-generated method stub
		System.out.println("in child");
		
	}
	
	
}
