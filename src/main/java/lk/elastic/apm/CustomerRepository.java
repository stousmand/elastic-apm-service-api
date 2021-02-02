package lk.elastic.apm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer>{

	@Query(value = "SELECT * FROM cus.\"Customers\" c where c.\"Id\"=?1", nativeQuery = true)
	public Customers getCustomerById(Integer cid);
	
}