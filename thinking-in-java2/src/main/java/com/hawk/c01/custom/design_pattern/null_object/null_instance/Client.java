package com.hawk.c01.custom.design_pattern.null_object.null_instance;

public class Client {
	public static void main(String[] args) {
		BookService service = new BookService();
		Book book = service.getBook(-1);
		if (book instanceof NullBook) {
			System.out.println("Not found!");
		} else {
			System.out.println("name: " + book.getName());
			System.out.println("price: " + book.getPrice());
		}
	}
}
