/**
 * 
 */
package com.waqassadiq.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Waqas Sadiq
 * @date 6 Mar 2022 project limit-service
 */
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int maximum;
	private int minimum;

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}
}
