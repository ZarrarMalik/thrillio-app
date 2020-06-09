package com.malik.zarrar.thrillio.dao;

import com.malik.zarrar.thrillio.datastore.DataStore;
import com.malik.zarrar.thrillio.entities.Bookmark;
import com.malik.zarrar.thrillio.entities.UserBookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
	}

}
