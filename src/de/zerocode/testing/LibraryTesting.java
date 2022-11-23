package de.zerocode.testing;

import de.zerocode.util.Book;
import de.zerocode.util.Library;

public class LibraryTesting {

	public static void main(String[] args) {
		Book book = new Book("java", "james", 400, 500);
		Library library = new Library(5000, "College Library", book);
		System.out.println(library.noOfBooks);
		System.out.println(library.libraryName);
		System.out.println(book.bookName);
		System.out.println(book.authourName);
		System.out.println(book.noOfPages);
		System.out.println(book.price);
	}
}
