package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Course;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Section;
@Repository
public interface University_SectionRepository extends CrudRepository<Section, Integer>{
	//add section to course
	@Query("SELECT s FROM Section s where s.title=:st")
	public Section findBytitle(@Param("st") String title);
    //public Course addSectionToCourse(Section section, Course course);
	
	//@Query("SELECT s FROM Section s where s.course_section_g=:cou")
	//public List<Section> findsectionforcourse(@Param("cou") int course_id);
	public default List<Section> findsectionforcourse(Course course){
		return course.findsectionforcourse();
	}
}
