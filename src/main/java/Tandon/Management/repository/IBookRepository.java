package Tandon.Management.repository;

import Tandon.Management.model.Book;
import Tandon.Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface IBookRepository extends JpaRepository<Book,Integer> {
    List<Book> findAllBookByStudent(Student student);
}
