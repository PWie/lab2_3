package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;

/**
 * Created by Patryk Wierzyński
 */

public class SearchResultMocker implements SearchResult {

	private boolean found;
	private int position;

	public SearchResultMocker(boolean found, int position) {
		this.found = found;
		this.position = position;
	}

	public boolean isFound() {
		return found;
	}

	public int getPosition() {
		return position;
	}
}
