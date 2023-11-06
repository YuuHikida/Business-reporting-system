package analix.DHIT.repository;

import analix.DHIT.model.User;

public interface UserRepository {

    User findByEmployeeCode(int employeeCode);
}
