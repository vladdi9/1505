package animals;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.ResolvableType;
import org.springframework.core.SpringVersion;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

@ComponentScan
public class Runner {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(Runner.class);
            for (String beanName:context.getBeanDefinitionNames())
                System.out.println(beanName);
            //Вызвать метод бина
            context.getBean(Dog.class).soud();
            //Содержит ли контекст указанный бин
        System.out.println("Context contains bean: "+
                context.containsBean("cat1"));

        //Версия Spring
        System.out.println(SpringVersion.getVersion());
        //Версия Hibernate
        System.out.println(org.hibernate.Version.getVersionString());
        //Версия Java
        System.out.println(System.getProperty("java.version"));
        }

        private class Bean{}

        @org.springframework.context.annotation.Bean
        public Bean getBean(){
        return new Bean();
    }
}
