package com.malik.zarrar.thrillio.main;

import com.malik.zarrar.thirillio.managers.BookmarkManager;
import com.malik.zarrar.thirillio.managers.UserManager;
import com.malik.zarrar.thrillio.datastore.DataStore;
import com.malik.zarrar.thrillio.datastore.View;
import com.malik.zarrar.thrillio.entities.Bookmark;
import com.malik.zarrar.thrillio.entities.User;

public class Launcher {

	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("1. Loading data....");
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();

		/*
		 * System.out.println("Printing data....."); printUserData();
		 * printBookmarkData();
		 */
	}

	private static void printUserData() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void printBookmarkData() {
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void start() {
		//System.out.println("2. Loading data.....");

		for (User user : users) {
			View.browse(user, bookmarks);
		}

	}

	public static void main(String[] args) {
		loadData();
		start();
	}

}
