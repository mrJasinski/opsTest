package opsDash.employee;

import java.util.Optional;

interface EmployeeRepository
{
    Optional<Employee> findByEmail(String email);
}
