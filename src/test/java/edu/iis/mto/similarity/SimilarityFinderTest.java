package edu.iis.mto.similarity;

import org.junit.Before;
import org.junit.Test;

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

	}

}