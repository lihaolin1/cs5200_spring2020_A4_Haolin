package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Person;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Student;
@Repository
public interface University_PersonRepository extends CrudRepository<Person, Integer>{
	//find person by name
//	@Query("SELECT f FROM Faculty f where f.firstname=:fn")
	@Query("SELECT f FROM Faculty f where f.firstName=:fn")
    public Faculty findfacultyByname(@Param("fn") String firstname);
	@Query("SELECT s FROM Student s where s.firstName=:sn")
    public Student findstudentByname(@Param("sn") String firstname);
//	@Query(value = "SELECT * FROM Faculty f where f.firstname=?1", nativeQuery=true)
//  public Optional<Todo> findfacultyByname(String firstname);
}
