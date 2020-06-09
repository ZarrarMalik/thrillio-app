package com.malik.zarrar.thrillio.controller;

import java.security.PublicKey;

import com.malik.zarrar.thirillio.managers.BookmarkManager;
import com.malik.zarrar.thrillio.entities.Bookmark;
import com.malik.zarrar.thrillio.entities.User;

public class BookmarkController {
	
	private static BookmarkController instance = new BookmarkController();
	
	private BookmarkController() {
		
	}

	public static BookmarkController getInstance() {
		return instance;
	}
	
	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
		
	}

	public void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) {
		BookmarkManager.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus, bookmark);
		
	}

	public void share(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().share(user, bookmark);
		
	}
}
