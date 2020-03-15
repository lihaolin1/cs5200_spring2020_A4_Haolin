package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Course;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Enrollment;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Person;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Section;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Student;

public interface UniversityDao {
	void truncateDatabase() throws SQLException;
	
	void create_all_faculty() throws SQLException;
	
	Faculty create_faculty(Faculty faculty) throws SQLException;
	
	void create_all_student() throws SQLException;
	
	Student create_student(Student student) throws SQLException;
	
	void create_all_course() throws SQLException;
	
	Course create_course(Course course) throws SQLException;
		
	void create_all_section() throws SQLException;
	
	Section create_section(Section section);
	
	void create_all_enrollment();
	
	Enrollment create_enrollment(Enrollment enrollment);
	
	Boolean enrollStudentInSection(Student student, Section section);
		
	//list 
	List<Person> findAllUsers();
	List<Faculty> findAllFaculty();
	List<Student> findAllStudents();
	List<Course> findAllCourses();
	List<Section> findAllSections();
	
	List<Course> findCoursesForAuthor(Faculty faculty);
	List<Section> findSectionForCourse(Course course);
	Set<Student> findStudentsInSection(Section section);
	Set<Section> findSectionsForStudent(Student student);
	
	//validation
	//void number_users(); 
}
