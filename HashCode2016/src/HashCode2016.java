import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HashCode2016 {

	static String fileName = "mother_of_all_warehouses.in";
	static String fileFullPath = System.getProperty("user.dir") + File.separator + "input" + File.separator;

	static ArrayList<Warehouse> warehouses;
	static ArrayList<Order> orders;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readInput(fileName,fileFullPath);
	}
	
	static public void readInput(String filename, String filepath){
		FileAction aFileAction = new FileAction(fileName,fileFullPath);
		ArrayList<String>  inData = aFileAction.fileRead();
		StringTokenizer tokens = new StringTokenizer(inData.get(0), " ");
		//tokens = new StringTokenizer(line, " ");
		Simulation sim = new Simulation(Integer.parseInt(tokens.nextToken()),Integer.parseInt(tokens.nextToken()),Integer.parseInt(tokens.nextToken()),Integer.parseInt(tokens.nextToken()),Integer.parseInt(tokens.nextToken()));
		Products products = new Products(Integer.parseInt(inData.get(1)),inData.get(2));
		warehouses = new ArrayList<Warehouse>();
		int numWarehouses = Integer.parseInt(inData.get(3));
		int i;
		for(i=4;i< numWarehouses +4;i+=2){
			warehouses.add( new Warehouse(inData.get(i),inData.get(i+1)));
		}
		int num_orders = Integer.parseInt(inData.get(i));
		System.out.println("Orders " +num_orders);
		i++;
		orders = new ArrayList<Order>();
		for(int j = i; j <num_orders*3 + i; j+=3){
			orders.add( new Order(inData.get(j),inData.get(j+1),inData.get(j+2)) );
		}
		
		System.out.println("Parageleies " + orders.size());
		System.out.println("Last Order"+orders.get(orders.size()-2));
		//System.out.println(sim + " " +inData.get(1) + products.getWeights().get(products.getWeights().size() -1));
	}
	
	

}
