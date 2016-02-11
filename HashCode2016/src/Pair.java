
public class Pair< First , Second> {
	
	
	First first;
	Second second;
	
	Pair(First first, Second second){
		this.first = first;
		this.second = second;
		
	}
	
	public boolean equals(Object o){
		if(o==this)
			return true;
		Pair po = (Pair) o;
		if(po.first == first && po.second == second)
			return true;
		return false;
		
	}
	
	public First getFirst() {
		return first;
	}

	public void setFirst(First first) {
		this.first = first;
	}

	public Second getSecond() {
		return second;
	}

	public void setSecond(Second second) {
		this.second = second;
	}

	int compareTo(Pair o){
		//to do
		return 0;
	}

}
