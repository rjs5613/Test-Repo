package com.rajesh.student;

import org.springframework.data.repository.Repository;

interface StudentRepository extends Repository<Student, Long> {

	Student findById(long id);

}
