package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import com.sun.research.ws.wadl.Application;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Dao.UniversityDao;
import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Faculty;
//@Configuration
//@ComponentScan
@Component
//@SpringBootApplication
public class University_run {
//	@Autowired
//	static
//	UniversityDao universitydao;// = new UniversityDao();
//	@Autowired
//	public static void main(String[] args) {
//		//ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
//		//UniversityDao universitydao = context.getBean(UniversityDao.class);
//		universitydao.delete_all();
//		//UniversityDao.delete_all();
//		Faculty f1 = new Faculty().create_faculty(1, "Alan", "Turin", "alan", "password", "123A", true);
//		universitydao.create_faculty(f1);
//	}
}
