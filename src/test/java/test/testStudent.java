package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import entity.Student;

public class testStudent {
	@Test
	public void test1(){
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		int id=1;
		Student stu=(Student)session.get(Student.class,id);
		System.out.println(stu);
		session.close();
	}
}
