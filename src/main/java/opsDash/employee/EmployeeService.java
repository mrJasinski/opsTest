package opsDash.employee;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EmployeeService
{
    private final EmployeeRepository employeeRepo;

    EmployeeService(final EmployeeRepository employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }

    public Employee getEmployeeByEmail(final String email)
    {
        return this.employeeRepo.findByEmail(email)
                .orElseThrow(() -> new NoSuchElementException("Employee with given email not found!"));
    }
}
