package com.malik.zarrar.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.malik.zarrar.thirillio.managers.BookmarkManager;

class WebLinkTest {

	@Test
	void testIsKidFriendlyEligible() {
		//test 1 : name in url -- false
		WebLink webLink =  BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
		boolean isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		
		assertFalse("Test message ", isKidFriendlyEligible);
		
		//test 2 : name in title -- false
		//test 3 : adult in host -- false
		
		//test 4: adult in url but not in host part -- true
		
		// test5
	}

}
