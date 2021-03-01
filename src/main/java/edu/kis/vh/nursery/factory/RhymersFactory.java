package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

/**
 * This line implements default RhymersFactory interface
 */
public interface RhymersFactory {

    /**
     * @return DefaultCountingOutRhymer
     */
    DefaultCountingOutRhymer getStandardRhymer();

    /**
     * @return DefaultCountingOutRhymer
     */
    DefaultCountingOutRhymer getFalseRhymer();

    /**
     * @return DefaultCountingOutRhymer
     */
    DefaultCountingOutRhymer getFIFORhymer();

    /**
     * @return DefaultCountingOutRhymer
     */
    DefaultCountingOutRhymer getHanoiRhymer();

}
