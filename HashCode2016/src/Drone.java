import java.util.ArrayList;

public class Drone {
	private int coord_x,coord_y;
	private ArrayList<Pair<Integer,Integer>> Inventory;
	enum state{Available,Unavailable}
	state s;
	
	public Drone(int coord_x, int coord_y, ArrayList<Pair<Integer, Integer>> inventory, state s) {
		this.coord_x = coord_x;
		this.coord_y = coord_y;
		this.Inventory= new ArrayList<>();
		this.s =state.Available;
	}
	public state getState() {
		return s;
	}
	public void setState(state s) {
		this.s = s;
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
	public ArrayList<Pair<Integer, Integer>> getInventory() {
		return Inventory;
	}
	public void setInventory(ArrayList<Pair<Integer, Integer>> inventory) {
		Inventory = inventory;
	};
	
	

}
