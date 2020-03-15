package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Dao;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_AnswerRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_CourseRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_EnrollmentRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_FacultyRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_LessonRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_ModuleRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_PersonRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_QuestionRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_SectionRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_StudentRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_TopicRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_WidgetRepository;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Course;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Enrollment;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Person;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Section;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Student;

@Component
public class UniversityImpl implements UniversityDao{
	@Autowired
	University_AnswerRepository answerRepository;
	@Autowired
	University_QuestionRepository questionRepository;
	@Autowired
	University_WidgetRepository widgetRepository;
	@Autowired
	University_TopicRepository topicRepository;
	@Autowired
	University_LessonRepository lessonRepository;
	@Autowired
	University_ModuleRepository moduleRepository;
	@Autowired
	University_EnrollmentRepository enrollmentRepository;
	@Autowired
	University_SectionRepository sectionRepository;
	@Autowired
	University_CourseRepository courseRepository;
	@Autowired
	University_PersonRepository personRepository;
	@Autowired
	University_FacultyRepository facultyRepository;
	@Autowired
	University_StudentRepository studentRepository;
	
	public UniversityImpl() {
		
	}
	
	//@Test
	//@Autowired//
	//@PostConstruct
	public void truncateDatabase() {
		answerRepository.deleteAll();
		questionRepository.deleteAll();
		widgetRepository.deleteAll();
		topicRepository.deleteAll();
		lessonRepository.deleteAll();
		moduleRepository.deleteAll();
		enrollmentRepository.deleteAll();
		sectionRepository.deleteAll();
		courseRepository.deleteAll();
		personRepository.deleteAll();
	}
	//insert
	//faculty
	//@Test
	//@Override
	//@Transactional
	//@Test//@Autowired//@PostConstruct
	public void create_all_faculty() {
		Faculty faculty1 = new Faculty().create_faculty( "Alan", "Turin", "alan", "password", "123A", true);
		Faculty faculty2 = new Faculty().create_faculty( "Ada", "Lovelace", "ada", "password", "123B", true);
		facultyRepository.save(faculty1);
		facultyRepository.save(faculty2);
//		personRepository.save(faculty1);
//		personRepository.save(faculty2);
	}
	//@Test//@PostConstruct
	public Faculty create_faculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}
	//student
	//@Test
	//@Test//@PostConstruct
	public void create_all_student() {
		Student student1 = new Student().create_student( "Alice","Wonderland", "alice", "password", 2020, 12000L);
		Student student2 = new Student().create_student( "Bob", "Hope", "bob", "password", 2021, 23000L);
		Student student3 = new Student().create_student( "Charlie", "Brown", "charlie","password", 2019, 21000L);
		Student student4 = new Student().create_student( "Dan", "Craig", "dan", "password", 2019, 0L);
		Student student5 = new Student().create_student( "Edward", "Scissorhands", "edward", "password", 2022, 11000L);
		Student student6 = new Student().create_student( "Frank", "Herbert", "frank", "password", 2018, 0L);
		Student student7 = new Student().create_student( "Gregory", "Peck", "gregory", "password", 2023, 10000L);
		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);
		studentRepository.save(student5);
		studentRepository.save(student6);
		studentRepository.save(student7);
	}
	//@Test//@PostConstruct
	public Student create_student(Student student) {
		return studentRepository.save(student);
	}
	//course
	//@Test
	public void create_all_course() {
		Course course1 = new Course().create_course("CS1234", personRepository.findfacultyByname("Alan"));
		Course course2 = new Course().create_course("CS2345", personRepository.findfacultyByname("Alan"));
		Course course3 = new Course().create_course("CS3456", personRepository.findfacultyByname("Ada"));
		Course course4 = new Course().create_course("CS4567", personRepository.findfacultyByname("Ada"));
		courseRepository.save(course1);
		courseRepository.save(course2);
		courseRepository.save(course3);
		courseRepository.save(course4);
	}
	public Course create_course(Course course) {
		return courseRepository.save(course);
	}
	//section
	//@Test
	public void create_all_section() {
		Section section1 = new Section().create_section("SEC4321",50, courseRepository.findBytitle("CS1234"));
		Section section2 = new Section().create_section("SEC5432",50, courseRepository.findBytitle("CS1234"));
		Section section3 = new Section().create_section("SEC6543",50, courseRepository.findBytitle("CS2345"));
		Section section4 = new Section().create_section("SEC7654",50, courseRepository.findBytitle("CS3456"));
		sectionRepository.save(section1);
		sectionRepository.save(section2);
		sectionRepository.save(section3);
		sectionRepository.save(section4);
	}
	public Section create_section(Section section) {
		return sectionRepository.save(section);
	}
	//enrollment
	public void create_all_enrollment() {
		Section section1 = sectionRepository.findBytitle("SEC4321");
		Section section2 = sectionRepository.findBytitle("SEC5432");
		Section section3 = sectionRepository.findBytitle("SEC6543");
		Student student1 = personRepository.findstudentByname("Alice");
//		Student student2 = personRepository.findstudentByname("Bob");
//		Student student3 = personRepository.findstudentByname("Charlie");
//		Enrollment enrollment1 = new Enrollment().create_enrollment(0, section1, student1);
//		Enrollment enrollment2 = new Enrollment().create_enrollment(0, section2, student1);
//		Enrollment enrollment3 = new Enrollment().create_enrollment(0, section2, student2);
//		Enrollment enrollment4 = new Enrollment().create_enrollment(0, section3, student3);
		section1.setSeats(section1.getSeats()-1);
		sectionRepository.save(section1);
		Enrollment enrollment1 = new Enrollment().create_enrollment(0, sectionRepository.findBytitle("SEC4321"), personRepository.findstudentByname("Alice"));
		
		section2.setSeats(section2.getSeats()-1);
		sectionRepository.save(section2);
		Enrollment enrollment2 = new Enrollment().create_enrollment(0, sectionRepository.findBytitle("SEC5432"), personRepository.findstudentByname("Alice"));
		
		section2.setSeats(section2.getSeats()-1);
		sectionRepository.save(section2);
		Enrollment enrollment3 = new Enrollment().create_enrollment(0, sectionRepository.findBytitle("SEC5432"), personRepository.findstudentByname("Bob"));
		
		section3.setSeats(section3.getSeats()-1);
		sectionRepository.save(section3);
		Enrollment enrollment4 = new Enrollment().create_enrollment(0, sectionRepository.findBytitle("SEC6543"), personRepository.findstudentByname("Charlie"));
		enrollmentRepository.save(enrollment1);
		enrollmentRepository.save(enrollment2);
		enrollmentRepository.save(enrollment3);
		enrollmentRepository.save(enrollment4);
	}
	public Enrollment create_enrollment(Enrollment enrollment) {
		return enrollmentRepository.save(enrollment);
	}
	public Boolean enrollStudentInSection(Student student, Section section) {
		Enrollment enrollment = new Enrollment().create_enrollment(0, section, student);
		try {
			enrollmentRepository.save(enrollment);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	public List<Person> findAllUsers(){
		return (List<Person>) personRepository.findAll();
	}
	public List<Faculty> findAllFaculty() {
		return (List<Faculty>) facultyRepository.findAll();
	}

	public List<Student> findAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	public List<Course> findAllCourses() {
		return (List<Course>) courseRepository.findAll();
	}

	public List<Section> findAllSections() {
		return (List<Section>) sectionRepository.findAll();
	}
	
	public List<Course> findCoursesForAuthor(Faculty faculty) {
		return (List<Course>) courseRepository.findcourseforauthor(faculty);
	}

	public List<Section> findSectionForCourse(Course course) {
		return (List<Section>) sectionRepository.findsectionforcourse(course);
	}

	public Set<Student> findStudentsInSection(Section section) {
		return (Set<Student>) enrollmentRepository.findstudentsinsection(section);
	}

	public Set<Section> findSectionsForStudent(Student student) {
		return (Set<Section>) enrollmentRepository.findsectionsforstudent(student);
	}
}
