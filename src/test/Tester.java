package test;

import java.util.ArrayList;
import java.util.List;

import sorting.ISort;
import sorting.MergeSort;

public class Tester {

	public static void main(String[] args) {
		
		List<Integer> dataInt = new ArrayList<Integer>();
		dataInt.add(2);
		dataInt.add(3);
		dataInt.add(1);
		dataInt.add(34);
		dataInt.add(10);
		
		ISort<Integer> mergeSortInt = new MergeSort<Integer>(dataInt);
		mergeSortInt.print();
		mergeSortInt.sort();
		mergeSortInt.print();
		
		List<Double> dataDouble = new ArrayList<Double>();
		dataDouble.add(2.2);
		dataDouble.add(3.0);
		dataDouble.add(0.1);
		dataDouble.add(3.4);
		dataDouble.add(1.0);
		
		ISort<Double> mergeSortDouble = new MergeSort<Double>(dataDouble);
		mergeSortDouble.print();
		mergeSortDouble.sort();
		mergeSortDouble.print();
		
		
	}

}
