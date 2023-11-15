//package com.redis.cache.controller;
//
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.cache.annotation.Caching;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.redis.cache.entity.Product;
//
//@RestController
//public class ProductController {
//
//	@GetMapping("/product/{id}")
//	@Cacheable(value = "product", key = "#id")
//	public Product getProductById(@PathVariable long id) {
//		return null;
//	}
//
//	@PutMapping("/product/{id}")
//	@CachePut(cacheNames = "product", key = "#id")
//	public Product editProduct(@PathVariable long id, @RequestBody Product product) {
//		return null;
//	}
//
//	@DeleteMapping("/product/{id}")
//	@CacheEvict(cacheNames = "product", key = "#id", beforeInvocation = true)
//	public String removeProductById(@PathVariable long id) {
//		return null;
//	}
//
////	@DeleteMapping("/product/{id}")
////	@CacheEvict(cacheNames = "product", allEntries = true)
////	public String removeProductByIdAll(@PathVariable long id) {
////		return null;
////	}
//
//	@PutMapping("/{id}")
//	@Caching(evict = { @CacheEvict(value = "productList", allEntries = true) }, put = {
//			@CachePut(value = "product", key = "#id") })
//	public Product editProductMultiple(@PathVariable long id, @RequestBody Product product) {
//		return null;
//	}
//
//}
