package com.malik.zarrar.thrillio.dao;

import com.malik.zarrar.thrillio.datastore.DataStore;
import com.malik.zarrar.thrillio.entities.User;
import com.malik.zarrar.thrillio.entities.UserBookmark;

public class UserDao {
	
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
