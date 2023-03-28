package com.backend.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.ecommerce.dao.ProductDao;
import com.backend.ecommerce.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;
	public String addProduct(Product prd)
	{
		this.productDao.save(prd);
		return "product added successfully";
	}
	public List<Product> getAllProducts()
	{
		return this.productDao.findAll();
	}
	public Product getProduct(int p_id)
	{
		Optional<Product> op= productDao.findById(p_id);
		if(op.isPresent())
			return op.get();
		return	null;
	}
	public String deleteProduct(int p_id)
	{
		Product p= getProduct(p_id);
		if(p!=null)
		{
			this.productDao.delete(p);
			return "product deleted successfully";
		}
		return "product not found";
	}
	public String updateProduct(Product prd)
	{
		Product p=getProduct(prd.getProduct_id());
		if(p!=null)
		{
			this.productDao.save(p);
			return "product updated succesfuly";
		}
		return "Product not found";
	}
}
