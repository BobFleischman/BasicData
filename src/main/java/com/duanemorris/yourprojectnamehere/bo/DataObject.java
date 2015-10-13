package com.duanemorris.yourprojectnamehere.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class DataObject {
	
	public static final String PROP_ID = "id";
	public static final String PROP_SOMEDATA = "someData";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String someData;

	public DataObject() {
		super();
	}
	public DataObject(String string) {
		super();
		someData = string;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSomeData() {
		return someData;
	}

	public void setSomeData(String someData) {
		this.someData = someData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataObject [id=");
		builder.append(id);
		builder.append(", someData=");
		builder.append(someData);
		builder.append("]");
		return builder.toString();
	}
	
}
