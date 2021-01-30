package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private static final int CONST_MINUS1 = -1;

	private static final int CONST_12 = 12;

	private int[] NUMBERS = new int[CONST_12];

	public int total = CONST_MINUS1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == CONST_MINUS1;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return CONST_MINUS1;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return CONST_MINUS1;
						return NUMBERS[total--];
					}

}
