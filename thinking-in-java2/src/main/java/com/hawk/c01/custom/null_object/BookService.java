package com.hawk.c01.custom.null_object;

public class BookService {
	public Book getBook(int id) {
		if (id<0) {
			return Book.createNullBook();
		}
		return new Book(id, "Design Pattern", 100);
	}
}
