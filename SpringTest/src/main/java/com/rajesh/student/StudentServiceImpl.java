package com.rajesh.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Implementation of Student Service
 * 
 * @author rajesh
 *
 */
@Component
class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	/**
	 * @return the studentRepository
	 */
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}
}
