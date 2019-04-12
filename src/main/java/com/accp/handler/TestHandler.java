package com.accp.handler;

import com.accp.po.Student;
import com.accp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author YPC
 * @create 2018 12 24 13:45
 */
@Controller
public class TestHandler {
    @Resource
    private StudentService ss;
    @RequestMapping("/")
        public String load(){
        return "index";
        }
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public String findAll(Map<String,Object> map){
        List<Student> list = ss.findAll();
        map.put("list",list);
        return "findAll";
    }

    /**
     *
     * @param model 类似于Request
     * @return
     */
    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    public String findById(Model model, @PathVariable("id")int id){
        Student student = ss.findById(id);
        model.addAttribute("stu",student);
        return "update";
    }
    @RequestMapping(value = "/loadinsert")
    public String loadinsert(){
        return "insert";
    }

    /**
     * redirect 重定向
     * @param stu
     * @return
     */
    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public String insert(Student stu){
        System.out.println(ss.insert(stu));
        return "redirect:student";
    }
    @RequestMapping(value = "/student",method = RequestMethod.PUT)
    public String update(Student stu){
        System.out.println(ss.update(stu));
        return "redirect:student";
    }
    @RequestMapping(value = "/student/{id}",method = RequestMethod.DELETE)
    public String delete( @PathVariable("id")int id){
        System.out.println(ss.delete(id));
        return "redirect:student";
    }

}
