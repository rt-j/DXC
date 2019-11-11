package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.Product;
import com.mongodb.WriteResult;
@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
MongoTemplate m;
	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		m.save(product);
		return false;
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub		
		return m.findById(productId, Product.class, "product");
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setProductId(productId);
		WriteResult res=m.remove(product);
		int rows=res.getN();
		if(rows==0)
		return false;
		else
			return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		m.save(product);
		return false;
	}

	@Override
	public List<Product> getallProducts() {
		// TODO Auto-generated method stub
		//m.executeQuery("from product", product, dch);
		return  m.findAll(Product.class);
	}

	@Override
	public boolean isProductExists(int productId) {
		// TODO Auto-generated method stub
		Product product=m.findById(productId, Product.class, "product");
		if(product==null)
		return false;
		else
			return true;
	}

	@Override
	public List<Product> searchProductByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
