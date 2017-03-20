package edu.iis.mto.similarity;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by Patryk Wierzyński
 */

public class SimilarityFinderTest {

	private SequenceSearcherMocker sequenceSearcherMocker;
	private SimilarityFinder similarityFinder;

	@Before
	public void setUp() throws Exception {
		sequenceSearcherMocker = new SequenceSearcherMocker();
		similarityFinder = new SimilarityFinder(sequenceSearcherMocker);
	}

	@Test
	public void calculateJackardSimilarityEmptySeq() throws Exception {
		int[] seq1 = {};
		int[] seq2 = {};
		double result = similarityFinder.calculateJackardSimilarity(seq1, seq2);

		assertThat(result, is(1.0d));
		assertThat(sequenceSearcherMocker.getCalls(), is(0));
	}

	@Test
	public void calculateJackardSimilaritySameSeq() throws Exception {
		int[] seq1 = {1,2,3,4,5,10};
		int[] seq2 = seq1;
		double result = similarityFinder.calculateJackardSimilarity(seq1, seq2);

		assertThat(result, is(1.0d));
		assertThat(sequenceSearcherMocker.getCalls(), is(6));
	}

}