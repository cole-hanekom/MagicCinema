package za.ac.cput.services.employee;

import za.ac.cput.entity.Employee;
import za.ac.cput.services.IService;

import java.util.Set;

public interface IEmployeeService extends IService<Employee,String> {
    boolean Login(String username, String password);
    Set<Employee> getAll();
}
