package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ProductDAO;
import com.model.Product;
import com.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	ProductService service;
	/*
	 * @RequestMapping("/productSave") public ModelAndView gg(Product product) {
	 * System.out.println("Inside Controller"+product); service.addProduct(product);
	 * return new ModelAndView("productdisplay","p",product); }
	 */
	//Previosuly Used@RequestMapping("/getProduct")
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		System.out.println("Get method for single product");
		return service.getProduct(productId);
	}
	@GetMapping()
	public List<Product> getProduct() {
		System.out.println("Get method for all products");
		
		return service.getallProducts();
	}
	@DeleteMapping("/{productId}")
	public boolean deleteProduct(@PathVariable("productId")int productId) {
		System.out.println("Delete method called");
		
		return service.deleteProduct(productId);
	}
	@PostMapping()
	public boolean addProduct(@RequestBody Product product) {
		System.out.println("Post method called");
		System.out.println(product);
		return service.addProduct(product);
	}
	@PutMapping()
	public boolean updateProduct(@RequestBody Product product) {
		System.out.println("Put method called");
		service.updateProduct(product);
		return false;
	}
	
}
