package lk.elastic.apm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`Customers`")
public class Customers {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
    private Integer Id;
	@Column(name="Code")
    private String Code;
	//@Column(name="CompanyName")
    //private String CompanyName;
	@Column(name="Email")
    private String Email;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	
}
