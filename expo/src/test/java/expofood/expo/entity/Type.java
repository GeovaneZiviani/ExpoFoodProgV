package expofood.expo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Type implements Bean{
	
	
	@Id
	@GeneratedValue
	private long id;


	@NotNull
	private String name;
	

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Type(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}

}
