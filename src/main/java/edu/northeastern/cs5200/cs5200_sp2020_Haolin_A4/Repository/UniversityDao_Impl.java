package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Course;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Person;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Section;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Student;

//@Repository
public abstract class UniversityDao_Impl{// implements UniversityDao{
//	private EntityManager manager;
//	@Override
//	public void truncateDatabase() {
//		//delete all record in schema
//		Query query1 =  manager.createQuery("DELETE FROM Answer");//(value = "DELETE FROM Answer")
//		query1.executeUpdate();
//		Query query2 =  manager.createQuery("DELETE FROM Question");//(value = "DELETE FROM Answer")
//		query2.executeUpdate();
//		Query query3 =  manager.createQuery("DELETE FROM Widget");//(value = "DELETE FROM Answer")
//		query3.executeUpdate();
//		Query query4 =  manager.createQuery("DELETE FROM Topic");//(value = "DELETE FROM Answer")
//		query4.executeUpdate();
//		Query query5 =  manager.createQuery("DELETE FROM Lesson");//(value = "DELETE FROM Answer")
//		query5.executeUpdate();
//		Query query6 =  manager.createQuery("DELETE FROM Module");//(value = "DELETE FROM Answer")
//		query6.executeUpdate();
//		Query query7 =  manager.createQuery("DELETE FROM Enrollment");//(value = "DELETE FROM Answer")
//		query7.executeUpdate();
//		Query query8 =  manager.createQuery("DELETE FROM Section");//(value = "DELETE FROM Answer")
//		query8.executeUpdate();
//		Query query9 =  manager.createQuery("DELETE FROM Course");//(value = "DELETE FROM Answer")
//		query9.executeUpdate();
//		Query query10 =  manager.createQuery("DELETE FROM Person");//(value = "DELETE FROM Answer")
//		query10.executeUpdate();
//	}
//	// create
//	@Override
//	public Faculty createFaculty(Faculty faculty) {
//		Query query =  manager.createQuery("Insert into Person (first_name, last_name, username, office, tenured, dtype)values(?, ?, ?, ?, ?, ?)");//(value = "DELETE FROM Answer")
//		//query1.executeUpdate();
//		query.setParameter(1, faculty.getFirstName());
//		query.setParameter(2, faculty.getLadtName());
//		query.setParameter(3, faculty.getUsername());
//		query.setParameter(4, faculty.getOffice());
//		query.setParameter(5, faculty.getTenured());
//		query.setParameter(6, "Faculty");
//		query.executeUpdate();
//		return faculty; //????????
//	}
//	@Override
//	public Student createStudent(Student student) {
//		Query query =  manager.createQuery("Insert into Person(first_name, last_name, username, grad_year, scholarship, dtype)values(?, ?, ?, ?, ?, ?)");//(value = "DELETE FROM Answer")
//		//query1.executeUpdate();
//		query.setParameter(1, student.getFirstName());
//		query.setParameter(2, student.getLadtName());
//		query.setParameter(3, student.getUsername());
//		query.setParameter(4, student.getGradYear());
//		query.setParameter(5, student.getScholarship());
//		query.setParameter(6, "Student");
//		query.executeUpdate();
//		return student; //????????
//	}
//	@Override
//	public Course createCourse(Course course) {
//		Query query = manager.createQuery("Insert into Course(label, faculty_course_person_id)values(?,?)");
//		query.setParameter(1, course.getLabel());
//		query.setParameter(2, course.getFaculty());
//		query.executeUpdate();
//		return course;
//	}
//	@Override
//	public Section createSection(Section section) {
//		Query query = manager.createQuery("Insert into Course(seats, course_section_g_course_id)values(?,?)");
//		query.setParameter(1, section.getSeats());
//		query.setParameter(2, section.getCourse());
//		query.executeUpdate();
//		return section;
//	}
//	//Update
////	public Course addSectionToCourse(Section section, Course course) {
////		
////	}
////	public Course setAuthorForCourse(Faculty faculty, Course course) {
////		
////	}
////	public Boolean enrollStudentInSection(Student student, Section section) {
////		
////	}
//	//List
//	@Override
//	public List<Person> findAllUsers(){
//		List<Person> person=new ArrayList<Person>();  
//		Query query = manager.createQuery("Select * from Person");
//		person = query.getResultList();
//		return person;
//	}
//	@Override
//	public List<Faculty> findAllFaculty(){
//		List<Faculty> faculty=new ArrayList<Faculty>();  
//		Query query = manager.createQuery("Select * from Person where dtype = Faculty");
//		faculty = query.getResultList();
//		return faculty;
//	}
//	@Override
//	public List<Student> findAllStudents(){
//		List<Student> student=new ArrayList<Student>();  
//		Query query = manager.createQuery("Select * from Person where dtype = Student");
//		student = query.getResultList();
//		return student;
//	}
//	@Override
//	public List<Course> findAllCourses(){
//		List<Course> course=new ArrayList<Course>();  
//		Query query = manager.createQuery("Select * from Course");
//		course = query.getResultList();
//		return course;
//	}
//	@Override
//	public List<Section> findAllSections(){
//		List<Section> section=new ArrayList<Section>();  
//		Query query = manager.createQuery("Select * from Section");
//		section = query.getResultList();
//		return section;
//	}
//	@Override
//	public List<Course> findCoursesForAuthor(Faculty faculty){
//		List<Course> course_faculty=new ArrayList<Course>();  
//		Query query = manager.createQuery("Select * from Course c where c.faculty_course_person_id in (select faculty.person_id from faculty)");// where Person.dtype = Faculty)");
//		course_faculty = query.getResultList();
//		return course_faculty;
//	}
//	@Override
//	public List<Section> findSectionForCourse(Course course){
//		List<Section> section_course=new ArrayList<Section>();  
//		Query query = manager.createQuery("Select * from Section s where s.course_section_g_course_id in (select course_id from course)");// where Person.dtype = Faculty)");
//		section_course = query.getResultList();
//		return section_course;
//	}
	//public List<Student> findStudentsInSection(Section section);
	//public List<Section> findSectionsForStudent(Student student);
}
