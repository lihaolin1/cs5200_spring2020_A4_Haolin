package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Course;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
@Repository
public interface University_CourseRepository extends CrudRepository<Course, Integer>{
	//find by course label
	@Query("SELECT c FROM Course c WHERE c.label=:lab")
    public Course findBytitle(@Param("lab") String label);
	
	//@Query("SELECT c FROM Course c WHERE c.Auther=:fn")
	//public List<Course> findcourseforauthor(@Param("fn") int person_id);
	public default List<Course> findcourseforauthor(Faculty faculty){
		return faculty.getAuthoredCourses();
	}
}
