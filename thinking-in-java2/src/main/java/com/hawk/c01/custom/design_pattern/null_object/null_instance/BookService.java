package com.hawk.c01.custom.design_pattern.null_object.null_instance;

public class BookService {
	public Book getBook(int id) {
		if (id<0) {
			return new NullBook();
		}
		return new Book(id, "Design Pattern", 100);
	}
}
