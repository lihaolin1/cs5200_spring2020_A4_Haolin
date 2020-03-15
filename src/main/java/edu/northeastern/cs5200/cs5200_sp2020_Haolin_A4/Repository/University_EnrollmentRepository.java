package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository;

//import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Enrollment;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Section;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Student;
@Repository
public interface University_EnrollmentRepository extends CrudRepository<Enrollment, Integer>{
	//@Query("Select s from Student s WHERE s.person_id in (SELECT e.to_student FROM Enrollment e WHERE e.to_section=:sec)")
	//public Set<Student> findstudentsinsection(@Param("sec") int section_id);
	public default Set<Student> findstudentsinsection(Section section){
		//Enrollment enrollment = new Enrollment();
		return section.findstudentsinsection();
	}
	
//	@Query("Select s from Section s WHERE s.section_id in (SELECT e.to_section FROM Enrollment e WHERE e.to_student=:sp)")
//	public Set<Section> findsectionsforstudent(@Param("sp") int person_id);
	public default Set<Section> findsectionsforstudent(Student student){
		return student.findsectionforstudent();
	}
}
