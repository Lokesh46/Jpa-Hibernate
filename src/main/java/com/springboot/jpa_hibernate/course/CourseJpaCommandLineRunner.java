package com.springboot.jpa_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{
	
	/*@Autowired
	private CourseJpaRepository repository;
	
	@Autowired
	private CourseJdbcRepository repository;*/
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS", "Lokesh"));
		repository.save(new Course(2, "Learn GCP", "Bokka"));
		repository.save(new Course(3, "Learn AZURE", "Someone"));
		repository.save(new Course(4, "Learn SPRING", "Anonymouus"));
		repository.save(new Course(5, "Learn JPA", "Evadiki Telusu"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findAll());
		
		System.out.print(repository.findById(1l));
		
		System.out.println(repository.findByAuthor("Someone"));
		
		System.out.println(repository.findByName("Learn AWS"));
	}
	
} 
