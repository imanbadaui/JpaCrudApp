package com.learnSWE.crud_JPA.employee;

import com.learnSWE.crud_JPA.employee.jpa.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner {

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        employeeJpaRepository.insert(
                new Employee("4fj3jds6", "Iman", "Badaui", 25, 500000));
        employeeJpaRepository.insert(
                new Employee("f4hs9f5h", "Laila", "Fahmy", 45, 250000));
        employeeJpaRepository.insert(
                new Employee("d6hs7j4d", "Aly", "Sami", 35, 150000));
        employeeJpaRepository.insert(
                new Employee("s0fn4dg6", "Shady", "Samir", 24, 50000));
        employeeJpaRepository.insert(
                new Employee("s3gd56d4", "Rania", "Yousef", 23, 45000));
        employeeJpaRepository.insert(
                new Employee("4dg5d5gf", "Noha", "Salama", 22, 20000));

      Employee employee1 =  employeeJpaRepository.findById("4fj3jds6");
      Employee employee2 = employeeJpaRepository.findById("s0fn4dg6");

        employeeJpaRepository.update("4fj3jds6", 550000);
        employeeJpaRepository.update("f4hs9f5h", 200000);

        employeeJpaRepository.deleteById("s3gd56d4");
    }
}
