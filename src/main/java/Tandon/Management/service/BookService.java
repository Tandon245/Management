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
        books.setBookAuthor(newBook.getBookAuthor());
        books.setBookId(newBook.getBookId());
        books.setBookDescription(newBook.getBookDescription());
        books.setBookPrice(newBook.getBookPrice());
        books.setBookTitle(newBook.getBookTitle());
        books.setStudent(newBook.getStudent());

        bookRepository.save(books);


    }


}