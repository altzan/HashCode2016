
public class Simulation {
	int num_rows,num_cols,num_drones,num_turns,max_weight;
	

	public Simulation(int num_rows, int num_cols, int num_drones, int num_turns, int max_weight) {
		this.num_rows = num_rows;
		this.num_cols = num_cols;
		this.num_drones = num_drones;
		this.num_turns = num_turns;
		this.max_weight = max_weight;
	}
	
	public String toString(){
		String s = num_rows + " " +num_cols + " " +num_drones + " " +num_turns + " " +max_weight ;
		return s;
	}
	
	

	public int getNum_rows() {
		return num_rows;
	}

	public void setNum_rows(int num_rows) {
		this.num_rows = num_rows;
	}

	public int getNum_cols() {
		return num_cols;
	}

	public void setNum_cols(int num_cols) {
		this.num_cols = num_cols;
	}

	public int getNum_drones() {
		return num_drones;
	}

	public void setNum_drones(int num_drones) {
		this.num_drones = num_drones;
	}

	public int getNum_turns() {
		return num_turns;
	}

	public void setNum_turns(int num_turns) {
		this.num_turns = num_turns;
	}

	public int getMax_weight() {
		return max_weight;
	}

	public void setMax_weight(int max_weight) {
		this.max_weight = max_weight;
	}


}
