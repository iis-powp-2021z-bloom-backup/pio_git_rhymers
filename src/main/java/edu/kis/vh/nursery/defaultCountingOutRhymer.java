package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
	private final int NUMBERS_ARRAY_SIZE = 12;
	private final int EMPTY_STACK_VALUE = -1;
	private final int FULL_STACK_VALUE = 11;

	private int[] NUMBERS = new int[NUMBERS_ARRAY_SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == EMPTY_STACK_VALUE;
		}
		
			public boolean isFull() {
				return total == FULL_STACK_VALUE;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return EMPTY_STACK_VALUE;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return EMPTY_STACK_VALUE;
						return NUMBERS[total--];
					}

}
