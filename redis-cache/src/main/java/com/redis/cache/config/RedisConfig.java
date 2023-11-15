//package com.redis.cache.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import com.redis.cache.entity.Student;
//
//@Configuration
//public class RedisConfig {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(RedisConfig.class.getName());
//
//	@Bean
//	public RedisConnectionFactory wdpRedifactory() {
//		LOGGER.info("Connection details :: {}");
//		return new LettuceConnectionFactory();
//	}
//
//	public RedisTemplate<String, Student> redisTemplate() {
//		RedisTemplate<String, Student> redisTemplate = new RedisTemplate<>();
//		redisTemplate.setConnectionFactory(wdpRedifactory());
//		return redisTemplate;
//	}
//
//}
