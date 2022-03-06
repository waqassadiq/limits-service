/**
 * 
 */
package com.waqassadiq.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Waqas Sadiq
 * @date 6 Mar 2022
 * project limit-service
 */
@Component
@ConfigurationProperties("limit-service")
public class Configuration {

}
