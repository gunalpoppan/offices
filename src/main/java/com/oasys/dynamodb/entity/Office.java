package com.oasys.dynamodb.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
@EntityScan

@DynamoDBTable(tableName = "office")
public class Office {
	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
private String id;
	@DynamoDBAttribute
private String name;
	@DynamoDBAttribute
private String noofemployee;
	@DynamoDBAttribute
private String location;
	@DynamoDBAttribute
	private String officetype;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoofemployee() {
		return noofemployee;
	}
	public void setNoofemployee(String noofemployee) {
		this.noofemployee = noofemployee;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOfficetype() {
		return officetype;
	}
	public void setOfficetype(String officetype) {
		this.officetype = officetype;
	}


	
	
}
