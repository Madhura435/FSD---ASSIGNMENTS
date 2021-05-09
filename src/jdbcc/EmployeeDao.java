package jdbcc;
import java.sql.SQLException;
import java.util.*;
public interface EmployeeDao {
	void addEmployee(Employee employee) throws Exception;
	void updateEmployee(int id,Employee employee) throws Exception;
    void deleteEmployee(int id) throws Exception;
    Employee getEmployeeById(int empId) throws Exception;
    List<Employee> getEmployees() throws Exception;
}
