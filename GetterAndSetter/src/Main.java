
public class Main {

	public static void main(String[] args) {
		//biraz kafama göre deney yaptım 
		Product product = new Product(1,"kangoo","reno",150000,3,"grey");
		System.out.println(product.getId()+product.getName());
		product.setName("Kangoo");
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		
		productManager.add2(product);
		System.out.println(product.getCode());
	}

}
