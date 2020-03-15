package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Dao.UniversityDao;

//import org.junit.jupiter.api.Test;
////import org.junit.jupiter.api.extension.ExtendWith;
////import org.junit.Test;
////import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.stereotype.Service;
////import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Transactional;
//
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_AnswerRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_CourseRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_EnrollmentRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_FacultyRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_LessonRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_ModuleRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_PersonRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_QuestionRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_SectionRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_StudentRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_TopicRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_WidgetRepository;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Course;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Section;
//import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Student;

//import org.springframework.test.context.junit.jupiter.SpringExtension;
//@ExtendWith(SpringExtension.class)
//@SpringBootTest 
//@Service
public class University_Dao_test2 {
//	@Autowired
//	University_AnswerRepository answerRepository;// = new University_AnswerRepository();
//	@Autowired
//	University_QuestionRepository questionRepository;
//	@Autowired
//	University_WidgetRepository widgetRepository;
//	@Autowired
//	University_TopicRepository topicRepository;
//	@Autowired
//	University_LessonRepository lessonRepository;
//	@Autowired
//	University_ModuleRepository moduleRepository;
//	@Autowired
//	University_EnrollmentRepository enrollmentRepository;
//	@Autowired
//	University_SectionRepository sectionRepository;
//	@Autowired
//	University_CourseRepository courseRepository;
//	@Autowired
//	University_PersonRepository personRepository;
//	@Autowired
//	University_FacultyRepository facultyRepository;
//	@Autowired
//	University_StudentRepository studentRepository;
//	//delete
//	//@Transactional
//	//@Test
//	@Modifying
//	@Transactional
//	public void delete_all() {
//		answerRepository.deleteAll();
//		questionRepository.deleteAll();
//		widgetRepository.deleteAll();
//		topicRepository.deleteAll();
//		lessonRepository.deleteAll();
//		moduleRepository.deleteAll();
//		enrollmentRepository.deleteAll();
//		sectionRepository.deleteAll();
//		courseRepository.deleteAll();
//		personRepository.deleteAll();
//	}
//	//insert
//	//faculty
//	//@Test
//	//@Override
//	//@Transactional
//	public void create_all_faculty() {
//		Faculty faculty1 = new Faculty().create_faculty(1, "Alan", "Turin", "alan", "password", "123A", true);
//		Faculty faculty2 = new Faculty().create_faculty(2, "Ada", "Lovelace", "ada", "password", "123B", true);
//		facultyRepository.save(faculty1);
//		facultyRepository.save(faculty2);
////		personRepository.save(faculty1);
////		personRepository.save(faculty2);
//	}
//	//student
//	//@Test
//	public void create_all_student() {
//		Student student1 = new Student().create_student(1, "Alice","Wonderland", "alice", "password", 2020, 12000L);
//		Student student2 = new Student().create_student(2, "Bob", "Hope", "bob", "password", 2021, 23000L);
//		Student student3 = new Student().create_student(3, "Charlie", "Brown", "charlie","password", 2019, 21000L);
//		Student student4 = new Student().create_student(4, "Dan", "Craig", "dan", "password", 2019, 0L);
//		Student student5 = new Student().create_student(5, "Edward", "Scissorhands", "edward", "password", 2022, 11000L);
//		Student student6 = new Student().create_student(6, "Frank", "Herbert", "frank", "password", 2018, 0L);
//		Student student7 = new Student().create_student(7, "Gregory", "Peck", "gregory", "password", 2023, 10000L);
//		personRepository.save(student1);
//		personRepository.save(student2);
//		personRepository.save(student3);
//		personRepository.save(student4);
//		personRepository.save(student5);
//		personRepository.save(student6);
//		personRepository.save(student7);
//	}
//	//course
//	//@Test
//	public void create_all_course() {
//		Course course1 = new Course().create_course("CS1234", personRepository.findfacultyByname("Alan"));
//		Course course2 = new Course().create_course("CS2345", personRepository.findfacultyByname("Alan"));
//		Course course3 = new Course().create_course("CS3456", personRepository.findfacultyByname("Ada"));
//		Course course4 = new Course().create_course("CS4567", personRepository.findfacultyByname("Ada"));
//		courseRepository.save(course1);
//		courseRepository.save(course2);
//		courseRepository.save(course3);
//		courseRepository.save(course4);
//	}
//	//section
//	//@Test
//	public void create_all_section() {
//		Section section1 = new Section().create_section("SEC4321",50, courseRepository.findBytitle("CS1234"));
//		Section section2 = new Section().create_section("SEC5432",50, courseRepository.findBytitle("CS1234"));
//		Section section3 = new Section().create_section("SEC6543",50, courseRepository.findBytitle("CS2345"));
//		Section section4 = new Section().create_section("SEC7654",50, courseRepository.findBytitle("CS3456"));
//		sectionRepository.save(section1);
//		sectionRepository.save(section2);
//		sectionRepository.save(section3);
//		sectionRepository.save(section4);
//	}
	//enrollment
	
}
