package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRespository employeeRespository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Benezeth");
		employee.setLastName("Petro");
		employee.setEmailId("benezethpetrus@gmail.com");
		employeeRespository.save(employee);

		Employee employee1 = new Employee();
		employee.setFirstName("Kasimu");
		employee.setLastName("Yusuph");
		employee.setEmailId("khasimu@gmail.com");
		employeeRespository.save(employee1);

	}
}
