/*
 20210125				Attempt to implement custom instrumentation. The Agent supports to capture transactions, spans to some level
  						if there is a need to add custom spans the Agent API would need t be used.
 */
package lk.elastic.apm;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.elastic.apm.api.ElasticApm;
import co.elastic.apm.api.Span;
import co.elastic.apm.api.Transaction;

@Service
public class CustomerService {

	public CustomerDTO getCustomer() {
		//This does not start a tansaction. The agent starts a tansaction if the traceparent HTTP header is not found.
		Transaction txn = ElasticApm.currentTransaction();
		Span span = txn.startSpan();

		CustomerDTO o = new CustomerDTO();
		o.setId(1);
		o.setCustomerName("Foo Bar");
		o.setCustomerAge(33);
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			span.setLabel("Customer Data",objectMapper.writeValueAsString(o));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		span.end();
		txn.end();
		return o;
	}
	
}
