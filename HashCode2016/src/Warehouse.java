import java.util.ArrayList;
import java.util.StringTokenizer;

public class Warehouse {
	private int coord_x,coord_y;
	private ArrayList<Integer> productAvailability;
	
	
	public Warehouse(String coords, String availability ) {

		StringTokenizer tokens = new StringTokenizer(coords, " ");
		this.coord_x = Integer.parseInt(tokens.nextToken());
		this.coord_y = Integer.parseInt(tokens.nextToken());
		//System.out.println(availability);
		
		tokens = new StringTokenizer(availability, " ");
		System.out.println(tokens.countTokens());
		int i=0;
		productAvailability = new ArrayList<Integer>();
		while(tokens.hasMoreTokens()){
			int t =  Integer.parseInt(tokens.nextToken());
			productAvailability.add(t);
		//	System.out.println(t);
		}
	}
	
	
	public int getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(int coord_x) {
		this.coord_x = coord_x;
	}
	public int getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(int coord_y) {
		this.coord_y = coord_y;
	}
	public ArrayList<Integer> getProductAvailability() {
		return productAvailability;
	}
	public void setProductAvailability(ArrayList<Integer> productAvailability) {
		this.productAvailability = productAvailability;
	}
}
