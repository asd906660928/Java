package wxh.ssm.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wxh.ssm.dao.StudentMapper;
import wxh.ssm.domain.Student;
import wxh.ssm.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public int delStudent(Integer id) {
        return studentMapper.delStudent(id);
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }
    //实现分页
    public PageInfo<Student> findByPage(Integer pageNum, Integer pageSize) {
        if (pageNum == null){
            pageNum = 1;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Student> students = studentMapper.findAll();
        PageInfo<Student> pageInfo = new PageInfo<Student>(students);
        return pageInfo;
    }
}
