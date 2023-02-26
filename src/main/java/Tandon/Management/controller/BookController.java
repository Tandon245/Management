package Tandon.Management.controller;


import Tandon.Management.model.Book;
import Tandon.Management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/book/")
public class BookController {
    @Autowired
    private BookService bookService;

    //add
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    //get by id
    @GetMapping("/getBook/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }


    //update
    @PutMapping("/updateBook/{id}")
    public void updateBook(@PathVariable int id,@RequestBody Book newBook) {
        bookService.updateBookById(id, newBook);
    }

    //delete student by id

    @DeleteMapping("deleteBook/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBookById(id);
    }

    //get all

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBook();
    }


}