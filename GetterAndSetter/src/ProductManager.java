
public class ProductManager {

	void add(Product product) {
		System.out.println(product.getName() + " adlı ürün eklendi");
	}
	
	void add2(Product product) {
		System.out.println(product.getId() + product.getName() + product.getColor());
	}
	
}
