package boss;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Operations {

	@PersistenceContext(name = "jumba")
	EntityManager entityManager;

	void retrieve() {

		Product product = new Product();
		product.setId(1);

		Product productEntity = entityManager.find(Product.class, product);

		System.out.println(productEntity);
	}

	public static void main(String[] args) {
		
	}
	
	public Operations() {
		new Operations().retrieve();
	}
}
