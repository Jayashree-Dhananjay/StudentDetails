package service;

import entity.Student;
import repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements  StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return (Student) studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return (Student) studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return (Student) studentRepository.save(student);
    }

    @Override

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}
