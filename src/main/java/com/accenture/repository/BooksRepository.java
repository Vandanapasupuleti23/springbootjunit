package com.accenture.repository;  
import org.springframework.data.repository.CrudRepository;  
import com.accenture.model.Books;   
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  