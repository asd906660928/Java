package wxh.ssm.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wxh.ssm.domain.Student;
import wxh.ssm.service.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    //将页面展示在客服端，并分页
    @RequestMapping("/students")
    public String findByPage(Model model, Integer pageNum){
        PageInfo<Student> pageInfo = studentService.findByPage(pageNum,3);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }
    @RequestMapping("/delete")
    public  String  delete(Integer id){
        int i = studentService.delStudent(id);
        if (i>0){
            return "redirect:students";
        }else{
            return "index";
        }
    }
    @RequestMapping("/edit")
    public String edit(Integer id, Model model){
        if (id != null){//进行修改
            Student student = studentService.findById(id);
            model.addAttribute("student",student);
        }
        return "edit";
    }

    @RequestMapping("/doUpdate")
    public String doUpdate(Student student){
        studentService.update(student);
        return "redirect:students";
    }
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:students";
    }
}
