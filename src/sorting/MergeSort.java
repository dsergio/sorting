package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T> extends Sort<T> {

	public MergeSort(List<T> data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
	
	public void mergeSort(int left, int right) {
		
		System.out.println("Mergesort: ");
		
		if (left > right) {
			return;
		}
		
		Integer mid = left + (right - left) / 2;
		
//		mergeSort(left, mid);
//		mergeSort(mid + 1, right);
//		merge(left, mid, right);
		
	}

	private void merge(int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		List<T> L = new ArrayList<T>();
		List<T> R = new ArrayList<T>();
		
		for (int i = 0; i < n1; i++) {
			L.set(i, data.get(left + i));
		}
		for (int i = 0; i < n2; i++) {
			
		}
		
	}

	@Override
	public void sort() {
		this.mergeSort(0, data.size() - 1);
		
	}

	@Override
	public void timeAnalysis() {
		// TODO Auto-generated method stub
		
	}

}
