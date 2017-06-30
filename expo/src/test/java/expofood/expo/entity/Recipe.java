package expofood.expo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Recipe implements Bean {
	@Id
	@GeneratedValue
	private long id;

	@NotNull
	private String description;

	@NotNull
	private String name;
	
	@NotNull
	private Type type;
	
	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipe(long id, String description, String name, Type type) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.type = type;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}


	
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}
	

}
