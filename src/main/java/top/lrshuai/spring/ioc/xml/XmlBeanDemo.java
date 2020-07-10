package top.lrshuai.spring.ioc.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanDemo {

    @Test
    public void testBean01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/learn01/bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.learn();
    }
}
