package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Dao.UniversityDao;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Course;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Enrollment;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Section;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Student;
//@RunWith(SpringRunner.class)
//@ContextConfiguration(locations = { "classpath*:spring*.xml", "classpath*:struts.xml", "classpath*:spring-hibernate.xml" })
@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(locations = {"classpath:applicationContext*.xml", "classpath:spring-servlet.xml"})
public class TestSuite {
	//delete all
	@Autowired
	UniversityDao ud;
	@Before//@BeforeAll
	public void test_delete_and_create(){
		try {
			ud.truncateDatabase();
			ud.create_all_faculty();
			ud.create_all_student();
			ud.create_all_course();
			ud.create_all_section();
			ud.create_all_enrollment();
		} catch (SQLException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void validateUsers() {
		assertEquals(9, ud.findAllUsers().size()); //if the reuslt equals to the right answer
	}
	@Test
	public void validateFaculty() {
		assertEquals(2, ud.findAllFaculty().size());
	}
	@Test
	public void validateStudents() {
		assertEquals(7,ud.findAllStudents().size());
	}
	@Test
	public void validateCourses() {
		assertEquals(4,ud.findAllCourses().size());
	}
	@Test
	public void validateSections() {
		assertEquals(4,ud.findAllSections().size());
	}
	@Test
	public void validatecourseAuthorship() {
		List<Faculty> faculty = ud.findAllFaculty();
		for (int i = 0; i < faculty.size(); i++) {
			int count = 0;
			Faculty f = faculty.get(i);
			List<Course> courses = ud.findCoursesForAuthor(f);
			for (int j = 0; j < courses.size(); j++) {
				count++;
			}
			assertEquals(2, count);
		}
	}
	
	@Test
	public void validateSectionPerCourse() {
		List<Course> courses = ud.findAllCourses();
		for (int i = 0; i < courses.size(); i++) {
			int count = 0;
			Course c = courses.get(i);

			List<Section> sections = ud.findSectionForCourse(c);
			for (int j = 0; j < sections.size(); j++) {
				count++;
			}
			if (c.getLabel().equals("CS1234"))
				assertEquals(2, count);
			else if (c.getLabel().equals("CS2345"))
				assertEquals(1, count);
			else if (c.getLabel().equals("CS3456"))
				assertEquals(1, count);
			else
				assertEquals(0, count);
		}
	}
	
	@Test
	public void validatesectionenrollmentsstudent() {
		List<Section> sections = ud.findAllSections();
		for (int i = 0; i < sections.size(); i++) {
			int count = 0;
			Section s = sections.get(i);
			Set<Student> students = ud.findStudentsInSection(s);
			for (int j = 0; j < students.size(); j++) {
				count++;
			}
			if (s.gettitle().equals("SEC4321")) {
				assertEquals(1, count);
			}
			else if (s.gettitle().equals("SEC5432")) {
				assertEquals(2, count);
			}
			else if (s.gettitle().equals("SEC6543")) {
				assertEquals(1, count);
			}
			else {
				assertEquals(0, count);
			}
		}
	}
	
	@Test
	public void validatestudentenrollmentsection() {
		List<Student> students = ud.findAllStudents();
		for (int i = 0; i < students.size(); i++) {
			int count = 0;
			Student s = students.get(i);
			Set<Section> section = ud.findSectionsForStudent(s);
			for (int j = 0; j < section.size(); j++) {
				count++;
			}
			if (s.getFirstName().equals("Alice")) {
				assertEquals(2, count);
			}
			else if (s.getFirstName().equals("Bob")) {
				assertEquals(1, count);
			}
			else if (s.getFirstName().equals("Charlie")) {
				assertEquals(1, count);
			}
			else {
				assertEquals(0, count);
			}
		}
	}
	
	@Test
	public void validatesectionseats() {
		List<Section> sections = ud.findAllSections();
		for (int i = 0; i < sections.size(); i++) {
			Section s = sections.get(i);
			if (s.gettitle().equals("SEC4321"))
				assertEquals(49, s.getSeats());
			else if (s.gettitle().equals("SEC5432"))
				assertEquals(48, s.getSeats());
			else if (s.gettitle().equals("SEC6543"))
				assertEquals(49, s.getSeats());
			else
				assertEquals(50, s.getSeats());
		}
	}
}
