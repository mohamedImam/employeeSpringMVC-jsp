package services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.models.EmployeeDTO;

import repos.EmployeeRepository;

@Component
@Transactional
public class EmployeeService {
	
	 @Autowired private  EmployeeRepository repo;
     
	    public void save(EmployeeDTO customer) {
	        repo.save(customer);
	    }
	     
	    public List<EmployeeDTO> listAll() {
	        return (List<EmployeeDTO>) repo.findAll();
	    }
	     
	    public EmployeeDTO get(Long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Long id) {
	        repo.deleteById(id);
	    }

}
