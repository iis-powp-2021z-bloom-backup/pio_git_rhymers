package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int _11 = 11;

	private static final int _12 = 12;

	private static final int _negative1 = -1;

	private int[] numbers = new int[_12];

	public int total = _negative1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == _negative1;
	}
	
	public boolean isFull() {
		return total == _11;
	}

	protected int peekaboo() {
		if (callCheck())
			return _negative1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return _negative1;
		return numbers[total--];
	}

}
