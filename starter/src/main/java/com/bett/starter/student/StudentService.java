package com.bett.starter.student;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
    public List<Student> getStudents(){
		return List.of(
				new Student(
					1L,
					"Bett",
					21L
				),
				new Student(2L, "Alice", 22L),
                new Student(3L, "John", 20L),
                new Student(4L, "Mary", 23L)
		);
	}

}
