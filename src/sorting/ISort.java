package sorting;

import java.util.List;

public interface ISort<T> {
	
	void print();
	void print(String label);
	void sort();
	void timeAnalysis();
	List<T> getSortedData();

}
