package Module_7;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class databasePassing {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	private String list;

	public int getAid() {
		return id;
	}

	public void setAid(int aid) {
		this.id = aid;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

}
