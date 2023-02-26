package Tandon.Management.service;

import Tandon.Management.model.Book;
import Tandon.Management.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public Book addBook(Book newBook) {
        return bookRepository.save(newBook);
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }


    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }


    public void deleteBookById(int id) {
        bookRepository.deleteById(id);
    }



    public void updateBookById(int id, Book newBook) {
        Book books = bookRepository.findById(id).get();
        books.setAuthor(newBook.getAuthor());
        books.setBookId(newBook.getBookId());
        books.setDescription(newBook.getDescription());
        books.setPrice(newBook.getPrice());
        books.setTitle(newBook.getTitle());
        books.setStudent(newBook.getStudent());

        bookRepository.save(books);


    }


}