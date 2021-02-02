package lk.elastic.apm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import co.elastic.apm.api.ElasticApm;
import co.elastic.apm.api.Span;

@RestController
public class CustomerServiceResource {
	
	@Autowired
	private CustomerService cusService;
	
	@GetMapping("/customer/{id}")
	public Customers getCustomer(@PathVariable("id") int id) {
		return cusService.getCustomer(id);
	}
}