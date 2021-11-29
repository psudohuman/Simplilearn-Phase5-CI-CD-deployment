package com.simplilearn.sportyshoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sportyshoes.dao.ProductDao;
import com.simplilearn.sportyshoes.entities.Product;

@Service
public class ProductServiceimpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getProducts() {
		return productDao.findAll();
	}

	@Override
	public Product getProduct(long productId) {
		return productDao.getOne(productId);
	}

	@Override
	public Product addProduct(Product product) {
		productDao.save(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		productDao.save(product);
		return product;
	}

	@Override
	public void deleteProduct(long productId) {
		Product entity = productDao.getOne(productId);
		productDao.delete(entity);
	}
//     List<Product> list;
//     public ProductServiceimpl() {
//    	 list = new ArrayList<>();
//    	 list.add(new Product(1,"Sparks Shoes","This is for men",2400 ) );
//    	 list.add(new Product(2,"Addidas Shoes","This is a sports shoes",3600 ) );
//    	 list.add(new Product(3,"Puma Shoes","This is for Women",1400 ) );
//    	 list.add(new Product(4,"Relaxo Shoes","This shoe is best for dancing",3300 ) );
//     }
//	
//	
//	
//	@Override
//	public List<Product> getProducts() {
//		return list;
//	}
//
//
//
//	@Override
//	public Product getProduct(long productId) {
//		Product p = null;
//		for(Product product : list) {
//			if(product.getId()==productId) {
//				p = product;
//				break;
//			}
//		}
//		return p;
//	}
//
//
//
//	@Override
//	public Product addProduct(Product product) {
//           list.add(product); 
//		return product;
//	}
//
//
//
//	@Override
//	public Product updateProduct(Product product) {
//         for(Product p : list) {
//        	 if(p.getId() == product.getId() ) {
//        		 p.setDescription(product.getDescription());
//        		 p.setName(product.getName());
//        		 p.setPrice(product.getPrice());
//        	 }
//         }
//		return product;
//	}
//
//
//
//	@Override
//	public void deleteProduct(long productId) {
//       for(Product p : list) {
//    	   if(p.getId() == productId) {
//    		   list.remove(p);
//    	   }
//       }		
//	}

}




