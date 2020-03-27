package wxh.ssm.service;

import com.github.pagehelper.PageInfo;
import wxh.ssm.domain.Student;

import java.util.List;

public interface StudentService {

    //查询全部
    List<Student> findAll();

    int addStudent(Student student);
    int delStudent(Integer id);
    int update(Student student);
    Student findById(Integer id);
    //分页
    PageInfo<Student> findByPage(Integer pageNum, Integer pageSize);
}
