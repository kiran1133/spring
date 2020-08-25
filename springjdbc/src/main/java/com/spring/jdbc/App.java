package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Dao.studentDaoimpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao dao=context.getBean("studentdao", StudentDao.class);
        
        Student student=new Student();
        student.setId(11);
        student.setName("MR");
        student.setCity("Solapur");
        
        
        int r=dao.insert(student);
        System.out.println(r);

        
        
        
    }
}
