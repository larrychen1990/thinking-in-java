package com.hawk.c01.custom.interview.abstract_class;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends BaseServlet{
	private String name;
	
	public MyServlet1() {
		super(); // if don't reffer here, the compiler will reffer for us by default
//		this();	// mutex with super()
		// TODO Auto-generated constructor stub
		this.name = "ll";
	}
	
	public MyServlet1(String name) {
//		super(name);  // for constructor that has params it's not
		this.name = "ll";
	}

	@Override
	protected void doService(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in child doService");
		
	}
	
	public static void main(String[] args) {
		BaseServlet myServlet1 = new MyServlet1();
		BaseServlet myServlet2 = new MyServlet1("Larry");
		myServlet1.prt("hehe");
	}

	@Override
	protected void prt(String str) {
		// TODO Auto-generated method stub
		System.out.println("in child");
		
	}
	
	
}
