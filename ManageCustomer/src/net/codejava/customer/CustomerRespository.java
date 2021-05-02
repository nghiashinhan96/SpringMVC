package net.codejava.customer;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRespository extends CrudRepository<Customer, Long>{
	@Query(value="SELECT c from Customer c where c.name LIKE '%' || :keyWord || '%' "
			+"OR c.email LIKE '%' || :keyWord || '%'"
			+"OR c.address LIKE '%' || :keyWord || '%'")
	public List<Customer> searchWithAttribute(@Param("keyWord")String argKeyWord); 
}
