package com.accenture.controller;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PostMapping;   
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;  
import com.accenture.model.Books;  
import com.accenture.service.BooksService;   
@RestController  
public class BooksController   
{   
@Autowired  
BooksService booksService;    
@GetMapping("/book")  
private List<Books> getAllBooks()   
{  
return booksService.getAllBooks();  
}     
@PostMapping("/books")  
private int saveBook(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books.getBookid();  
}   
@RequestMapping(value = "/Books", method = RequestMethod.GET)
public Books Books() {

	Books bk = new Books();
	bk.setBookid(1001);
	bk.setBookname("managerbk");
	bk.setAuthor("vvv");
	bk.setPrice(3000);

	return bk;
}
}  
 