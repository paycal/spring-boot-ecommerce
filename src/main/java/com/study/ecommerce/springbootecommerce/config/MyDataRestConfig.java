package com.study.ecommerce.springbootecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.study.ecommerce.springbootecommerce.entity.Product;
import com.study.ecommerce.springbootecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		HttpMethod[] unsupportedActions = { HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE }; 

		// disable http method for product ' put, post, and delete
		config.getExposureConfiguration()
			.forDomainType(Product.class)
			.withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions))
			.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));
			
		config.getExposureConfiguration()
			.forDomainType(ProductCategory.class)
			.withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions))
			.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));
		
	}		
}
