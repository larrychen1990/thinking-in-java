package com.hawk.c01.custom.design_pattern.null_object.null_class_method;

public class BookService {
	public Book getBook(int id) {
		if (id<0) {
			return Book.createNullBook();
		}
		return new Book(id, "Design Pattern", 100);
	}
}
