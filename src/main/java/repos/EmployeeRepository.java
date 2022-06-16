package repos;

import org.springframework.data.repository.CrudRepository;

import com.models.EmployeeDTO;

public interface EmployeeRepository extends CrudRepository<EmployeeDTO, Long>{

}
