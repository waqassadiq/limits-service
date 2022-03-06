/**
 * 
 */
package com.waqassadiq.microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waqassadiq.microservices.bean.LimitConfiguration;

/**
 * @author Waqas Sadiq
 * @date 6 Mar 2022
 * project limit-service
 */
@RestController
public class LimitsConfigurationController {
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(1000, 1);  
	}  

}
