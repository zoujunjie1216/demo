package com.gree.controller;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gree.model.Student;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	private static List<Student>studentlist=new ArrayList<Student>();
	//1. �����ڲ���ʹ��������ʹ�� 2.��̬����飬ֻʹ��һ�Σ�������ݿ�����
	static {
		studentlist.add(new Student(1,"����",22));
		studentlist.add(new Student(2,"����",23));
		studentlist.add(new Student(3,"����",24));
	}
  @RequestMapping("/list")
  public ModelAndView list() {
	  ModelAndView mav=new ModelAndView();
	  mav.addObject("studentlist",studentlist);
	  mav.setViewName("student/list");
	  return mav;
  }
  
  @RequestMapping("/preSave")
  public ModelAndView preSave(@RequestParam(value="id",required=false)String id) {
	  ModelAndView mav=new ModelAndView();
	  if(id!=null) {
		  mav.addObject("student",studentlist.get(Integer.parseInt(id)-1));
		  mav.setViewName("student/update");
	  }else {
	  mav.setViewName("student/add");
	  }
	  return mav;
  }
  

}
