/**
 * 
 */
package com.waqassadiq.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waqassadiq.microservices.bean.LimitConfiguration;
import com.waqassadiq.microservices.config.Configuration;

/**
 * @author Waqas Sadiq
 * @date 6 Mar 2022
 * project limit-service
 */
@RestController
public class LimitsConfigurationController {
	
	@Autowired    
	private Configuration configuration;     
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());  
	}  

}
