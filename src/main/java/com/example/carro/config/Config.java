package com.example.carro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.example.carro.entity.Product;
import com.example.carro.entity.ProductCategory;

@Configuration
public class Config implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		
		HttpMethod[] test = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
		
		
		config.getExposureConfiguration() 
		.forDomainType(Product.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(test))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(test));
		
		

		config.getExposureConfiguration() 
		.forDomainType(ProductCategory.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(test))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(test));
		
	}

	
	
	
}
