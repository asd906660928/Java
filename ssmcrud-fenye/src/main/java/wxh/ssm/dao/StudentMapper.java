package wxh.ssm.dao;

import org.springframework.stereotype.Repository;
import wxh.ssm.domain.Student;

import java.util.List;

@Repository
public interface StudentMapper {
    //查询全部
    List<Student> findAll();
    int addStudent(Student student);
    int delStudent(Integer id);
    int update(Student student);
    Student findById(Integer id);
}
