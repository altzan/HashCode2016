import java.util.ArrayList;
import java.util.StringTokenizer;

public class Products {
	private ArrayList<Integer> weights;
	
	public Products(int P, String line){
		weights = new ArrayList<Integer>();
		StringTokenizer tokens = new StringTokenizer(line, " ");
		for(int i=0;i<P;i++)
			weights.add(Integer.parseInt(tokens.nextToken()));
		
	}

	public ArrayList<Integer> getWeights() {
		return weights;
	}

	public void setWeights(ArrayList<Integer> weights) {
		this.weights = weights;
	}

}
