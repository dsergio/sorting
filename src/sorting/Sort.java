package sorting;

import java.util.ArrayList;
import java.util.List;

public abstract class Sort<T> implements ISort<T> {
	
	protected List<T> data = new ArrayList<T>();
	protected List<T> sortedData = new ArrayList<T>();
	
	@Override
	public List<T> getSortedData() {
		return sortedData;
	}
	
	public Sort(List<T> data) {
		super();
		this.data = data;
	}
	
	public void print() {
		this.print(null);
	}
	
	public void print(String label) {
		System.out.println("Printing" + (label == null ? "" : (" " + label)) + ":");
		System.out.println(data.toString());
		System.out.println();
	}
	
}
