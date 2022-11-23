package de.zerocode.util;

public class Library {
	public int noOfBooks;
	public String libraryName;
	Book book;

	public Library(int noOfBooks, String libraryName, Book book) {
		this.noOfBooks = noOfBooks;
		this.libraryName = libraryName;
		this.book = book;
	}

}
