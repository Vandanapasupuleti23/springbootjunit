package com.accenture.service;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.accenture.model.Books;  
import com.accenture.repository.BooksRepository;  

@Service  
public class BooksService   
{  
@Autowired  
BooksRepository booksRepository;  
public List<Books> getAllBooks()   
{  
List<Books> books = new ArrayList<Books>();  
booksRepository.findAll().forEach(books1 -> books.add(books1));  
return books;  
}   
public void saveOrUpdate(Books books)   
{  
booksRepository.save(books);  
}     
}  