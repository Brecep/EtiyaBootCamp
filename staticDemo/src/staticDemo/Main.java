package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product pc1 = new Product(1, "Dell", 1200);
		Product pc2 = new Product(2, "", -1);
		Product pc3 = new Product(3, "", 1500);

		ProductManager manager = new ProductManager();
		manager.add(pc1);
		manager.add(pc2);
		manager.add(pc3);

		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Crud.add();
		DatabaseHelper.Crud.update();

	}

}
