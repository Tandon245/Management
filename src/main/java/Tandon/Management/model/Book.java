package Tandon.Management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    @Column(name="book_title")
    private String bookTitle;
    @Column(name="book_author")
    private String bookAuthor;
    @Column(name="book_description")
    private String bookDescription;
    @Column(name="book_price")
    private String bookPrice;
    @ManyToOne
    private Student student;

}