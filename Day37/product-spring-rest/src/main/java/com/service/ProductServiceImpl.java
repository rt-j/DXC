package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDAO;
import com.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO dao;

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.getProduct(productId);
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(productId);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public List<Product> getallProducts() {
		// TODO Auto-generated method stub
		return dao.getallProducts();
	}

	@Override
	public boolean isProductExists(int productId) {
		// TODO Auto-generated method stub
		return dao.isProductExists(productId);
	}

	@Override
	public List<Product> searchProductByName(String productName) {
		// TODO Auto-generated method stub
		return dao.searchProductByName(productName);
	}
	

}
