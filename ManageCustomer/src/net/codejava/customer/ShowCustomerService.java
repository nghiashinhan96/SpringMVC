package net.codejava.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowCustomerService {
	@Autowired
	private CustomerRespository customerRepo;

	public List<Customer> getListCust() {
		return (List<Customer>) customerRepo.findAll();
	}

	public void saveCustomer(Customer argCustomer) {
		customerRepo.save(argCustomer);
	}

	public Customer getCustomerById(long argCustomerId) {
		Optional<Customer> result = customerRepo.findById(argCustomerId);
		return result.get();
	}
	public void deleteCustomerById(long argCustId) {
		customerRepo.deleteById(argCustId);
	}
	public List<Customer>searchCustomer(String argKeyWord){
		return customerRepo.searchWithAttribute(argKeyWord);
	}
	
}
