package com.org.app;

import java.util.ArrayList;
import java.util.List;

/**
 * User defined constants will be defined within this file.
 * Always use static 
 * @author vjreddy
 *
 */
public class AppConst {

	
	/**
	 * List of allowed operator
	 */
	public static final List<String> allowedOperators = new ArrayList<String>() {
		{
			add("+");
			add("-");
			add("*");
			add("/");
			add("&");
			add("=");
		}
	};
}
