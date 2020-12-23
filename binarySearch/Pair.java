package binarySearch;

public class Pair {

	int row;
	int column;

	Pair() {
		row = 0;
		column = 0;
	}

	Pair(int r, int c) {
		row = r;
		column = c;
	}

	@Override
	public String toString() {
		return "(" + row + ", " + column + ")";
	}

}
