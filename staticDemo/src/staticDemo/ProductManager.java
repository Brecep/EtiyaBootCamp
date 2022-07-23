package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if (ProductValidator.isValid(product))
			System.out.println("Dao'ya Eklendi");
		else
			System.out.println("Eklenemedi");
	}
}
