package com.oasys.dynamodb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class Dynamodbconfig {
    @Bean
	public DynamoDBMapper dynamoDBMapper() {
		return new DynamoDBMapper(
				buildAmozonDynamoDb()
				);
	}

	private AmazonDynamoDB buildAmozonDynamoDb() {
		// TODO Auto-generated method stub
		
		return AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration( new 
				AwsClientBuilder.EndpointConfiguration(
                "dynamodb.eu-north-1.amazonaws.com",
                "eu-north-1"
        )
				).withCredentials(
						  new AWSStaticCredentialsProvider(
	                                new BasicAWSCredentials(
	                                        "AKIAVF3VBUCMMLD3UG5G",
	                                        "Fy9woNWDCBNktXLsJDUUo/xzuBZp+mzH9sBxynU+"
	                                )
	                        )
						).build();
	}
}
