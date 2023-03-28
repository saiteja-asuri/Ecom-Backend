package com.backend.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ecommerce.model.Product;
import com.backend.ecommerce.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/{p_id}")
	public Product getProduct(@PathVariable String p_id)
	{
		return this.productService.getProduct(Integer.parseInt(p_id));
	}
	@GetMapping("/")
	public List<Product> getAllProducts()
	{
		return this.productService.getAllProducts();
	}
	@PostMapping("/")
	public String addProduct(@RequestBody Product prd)
	{
		return this.productService.addProduct(prd);
	}
	@PutMapping("/")
	public String updateProduct(@RequestBody Product prd)
	{
		return this.productService.updateProduct(prd);
	}
	@DeleteMapping("/{p_id}")
	public String removeProduct(@PathVariable String p_id)
	{
		return this.productService.deleteProduct(Integer.parseInt(p_id));
	}
}
