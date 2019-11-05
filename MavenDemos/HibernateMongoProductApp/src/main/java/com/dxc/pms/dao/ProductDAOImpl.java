package com.dxc.pms.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dxc.pms.model.Product;
import com.dxc.pms.util.HibernateUtil;

public class ProductDAOImpl implements ProductDAO {
	SessionFactory sf=HibernateUtil.getSessionFactory();

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Product product=(Product) session.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query q=session.createQuery("from Product");
		return q.list();
		
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		System.out.println("Saved Succesfully");
		
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=new Product();
		product.setProductId(productId);
		session.delete(product);
		transaction.commit();
		session.close();
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction transaction =session.beginTransaction();
		product.setPrice(100);
	
		session.update(product);
		/*
		 * Product oldProduct=(Product) session.get(Product.class,
		 * product.getProductId()); oldProduct.setProductName(product.getProductName());
		 * oldProduct.setQuantityOnHand(product.getQuantityOnHand());
		 * oldProduct.setPrice(product.getPrice());
		 */
		transaction.commit();
		session.close();
		
	}

	@Override
	public boolean isProductExists(int productId) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Product product=(Product) session.get(Product.class, productId);
		if(product==null)
		return false;
		else
			return true;
	}
}
