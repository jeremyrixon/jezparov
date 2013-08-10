package au.com.icmconsulting.training.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ForumGroup {
	private Long id;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
