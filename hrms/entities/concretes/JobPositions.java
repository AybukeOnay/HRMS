package kodlamaio.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="JobPositions")
public class JobPositions {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="position")
	private String jobPosition;
	
	public JobPositions() {
		
	}
	
	public JobPositions(int id, String jobPosition) {
		super();
		this.id = id;
		this.jobPosition = jobPosition;
	}
	
}
