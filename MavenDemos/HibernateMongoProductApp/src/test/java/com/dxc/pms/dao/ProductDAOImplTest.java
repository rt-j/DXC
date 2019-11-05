package com.dxc.pms.dao;

import java.util.List;

import com.dxc.pms.model.Product;

import junit.framework.TestCase;

public class ProductDAOImplTest extends TestCase {
	ProductDAO productdao;
	@Override
		protected void setUp() throws Exception {
			// TODO Auto-generated method stub
			productdao=new ProductDAOImpl();
		}

	public void testGetProduct() {
		//fail("Not yet implemented");
		Product product =new Product(1007, "Biscuit", 34, 90)	;
		productdao.addProduct(product);
		Product got=productdao.getProduct(1007);
		assertEquals(got, product);
		
	}

	public void testGetAllProducts() {
		//fail("Not yet implemented");
		List<Product> BeforeAdding=productdao.getAllProducts();
		Product p=new Product(1005, "Dim", 45, 800);
		productdao.addProduct(p);
		List<Product> AfterAdding=productdao.getAllProducts();
		assertEquals(AfterAdding.size(), BeforeAdding.size()+1);
		
	}

	public void testAddProduct() {
		//fail("Not yet implemented");
		Product product=new Product(1006, "Gloves", 15, 678);
		List<Product> allProducts1=productdao.getAllProducts();
		productdao.addProduct(product);
		List<Product> allProducts2=productdao.getAllProducts();
		assertNotSame(allProducts2.size(), allProducts1.size());
		
	}

	public void testDeleteProduct() {
		//fail("Not yet implemented");
		List<Product> beforeDelete=productdao.getAllProducts();
		productdao.deleteProduct(1003);
		List<Product> afterDelete=productdao.getAllProducts();
		assertEquals(afterDelete.size(), beforeDelete.size()-1);
		
		
	}

	public void testUpdateProduct() {
		//fail("Not yet implemented");
	Product beforeUpdate=new Product(1010, "Pizza", 5, 80);
	productdao.addProduct(beforeUpdate);
	Product afterUpdate=new Product(1010, "Cake", 2, 450);
	productdao.updateProduct(afterUpdate);
	assertEquals(afterUpdate.getProductName(), "Cake");			
	}

	public void testIsProductExists() {
		//fail("Not yet implemented");
		Product testing=new Product(1011, "Biriyani", 2, 23);
		productdao.addProduct(testing);
		boolean check=productdao.isProductExists(1011);
		assertEquals(true, check);
	}

}
