package lk.elastic.apm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {
	
	@GetMapping("/customer")
	public void getCustomer() {
		System.out.println("This is a customer");
	}
}