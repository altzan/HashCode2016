import java.util.ArrayList;
import java.util.StringTokenizer;

public class Order {
		private int targetx,targety,num_products;
		private ArrayList<Integer> productIDs ;
		
		public Order(String target, String size, String products) {
			StringTokenizer tokens = new StringTokenizer(target, " ");
			
			this.targetx = Integer.parseInt(tokens.nextToken());
			this.targety = Integer.parseInt(tokens.nextToken());
			
			this.num_products =Integer.parseInt(size);

			productIDs = new ArrayList<Integer>();
			tokens = new StringTokenizer(products, " ");
			for(int i=0; i< num_products;i++)
				productIDs.add(Integer.parseInt(tokens.nextToken()));
		}
		
		
		public String toString()
		{
			String s="To: "+targetx+","+targety+" delivering "+num_products;
			return s;
		}
		
		public int getTargetx() {
			return targetx;
		}
		public void setTargetx(int targetx) {
			this.targetx = targetx;
		}
		public int getTargety() {
			return targety;
		}
		public void setTargety(int targety) {
			this.targety = targety;
		}
		public int getNum_products() {
			return num_products;
		}
		public void setNum_products(int num_products) {
			this.num_products = num_products;
		}
		public ArrayList<Integer> getProductIDs() {
			return productIDs;
		}
		public void setProductIDs(ArrayList<Integer> productIDs) {
			this.productIDs = productIDs;
		}
		
}
