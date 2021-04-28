package ru.boger.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.boger.project.config.MyConfig;
import ru.boger.project.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employeeById = communication.getEmployee(5);
//        System.out.println(employeeById);

//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 700);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(8);
    }
}
