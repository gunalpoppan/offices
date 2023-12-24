package com.oasys.dynamodb.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.oasys.dynamodb.entity.Office;
@Repository
public class Employeerepo {

	  @Autowired
	    private DynamoDBMapper dynamoDBMapper;
	  
	  public Office save(Office employee) {
	        dynamoDBMapper.save(employee);
	        return employee;
	    }

	    public Office getEmployeeById(String id) {
	        return dynamoDBMapper.load(Office.class, id);
	    }

	    public Office delete(String id) {
	        Office emp = dynamoDBMapper.load(Office.class, id);
	        dynamoDBMapper.delete(emp);
	        return emp;
	    }

	    public Office update(String id, Office employee) {
	        dynamoDBMapper.save(
	            employee,
	            new DynamoDBSaveExpression().withExpectedEntry(
	                "id",
	                new ExpectedAttributeValue(new AttributeValue().withS(id))
	            )
	        );
	        return employee;
	    }


	    public List<Office> getAllOffices() {
	        return dynamoDBMapper.scan(Office.class, new DynamoDBScanExpression());
	    }
	
}
