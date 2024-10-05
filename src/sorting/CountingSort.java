package sorting;

import java.util.ArrayList;
import java.util.List;

public class CountingSort<T> extends Sort<T> {
	
	private List<T> countArr = new ArrayList<T>();
	
	public CountingSort(List<T> data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
	
	private void countingSort() {
		
		System.out.println("Counting Sort: ");
		
		for (int i = 0; i < data.size(); i++) {
			countArr.set(i, countArr.get(i));
		}
	}

	@Override
	public void sort() {
		this.countingSort();
		
	}

	@Override
	public void timeAnalysis() {
		// TODO Auto-generated method stub
		
	}
}
