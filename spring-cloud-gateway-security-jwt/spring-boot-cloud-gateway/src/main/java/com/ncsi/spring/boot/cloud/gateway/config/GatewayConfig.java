package com.ncsi.spring.boot.cloud.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import com.ncsi.spring.boot.cloud.gateway.filter.JwtAuthenticationFilter;

@Configuration
public class GatewayConfig {

	@Autowired
	private JwtAuthenticationFilter filter;

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes().route("auth", r -> r.path("/auth/**").filters(f -> f.filter(filter)).uri("lb://auth"))
				.route("send-message-service1", r -> r.path("/service1/**").filters(f -> f.filter(filter).retry(config -> config.setRetries(2).setStatuses(HttpStatus.INTERNAL_SERVER_ERROR))).uri("lb://service1"))
				
				.route("send-message-service2", r -> r.path("/service2/**").filters(f -> f.filter(filter).retry(config -> config.setRetries(2).setStatuses(HttpStatus.INTERNAL_SERVER_ERROR))).uri("lb://service2"))
				
				.route("send-message-service3", r -> r.path("/service3/**").filters(f -> f.filter(filter).retry(config -> config.setRetries(2).setStatuses(HttpStatus.INTERNAL_SERVER_ERROR))).uri("lb://service3")).build();            		

	}
}
