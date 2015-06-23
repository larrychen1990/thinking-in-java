package com.hawk.c01.custom.null_object;

public class Client {
	public static void main(String[] args) {
		BookService service = new BookService();
		Book book = service.getBook(-1);
		if (book.isNull()) {
			System.out.println("Not found!");
		} else {
			System.out.println("name: " + book.getName());
			System.out.println("price: " + book.getPrice());
		}
	}
}
