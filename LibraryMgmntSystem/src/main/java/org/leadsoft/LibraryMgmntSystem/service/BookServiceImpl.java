package org.leadsoft.LibraryMgmntSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.leadsoft.LibraryMgmntSystem.models.Book;
import org.leadsoft.LibraryMgmntSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		
		List<Book> books = new ArrayList<Book>();
		
		Iterable<Book> itr = bookRepository.findAll();
		
		for (Book book : itr) {
			books.add(book);
		}
		return books;
	}

}
