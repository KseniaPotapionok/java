import by.gsu.pms.Chair;
import by.gsu.pms.Cupboard;
import by.gsu.pms.Furniture;
import by.gsu.pms.Table;

public class Runner {

	public static void main(String[] args) {

		final Furniture[] furnitures = new Furniture[3];



		furnitures[0] = new Chair("Ukraine", 400, "plastic", true);
		furnitures[1] = new Cupboard("Russia", 300, "wood", 150, 60, 70);
		furnitures[2] = new Table("Russia", 30, "wood", 5, 50);
		

		for (int i = 0; i < furnitures.length; i++) {
			furnitures[i].Write();
		}
}
}