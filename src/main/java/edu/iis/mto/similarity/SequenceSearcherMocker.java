package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

/**
 * Created by Patryk Wierzyński
 */

public class SequenceSearcherMocker implements SequenceSearcher{

	public SearchResult search(int key, int[] seq) {
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] == key) {
				return new SearchResultMocker(true, i);
			}
		}
		return new SearchResultMocker(false);
	}

}
