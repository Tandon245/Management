package Tandon.Management.repository;

import Tandon.Management.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course,Integer> {
}
