 /*
  Microdata Tabulator
  https://github.com/mnpopcenter/microdata-tabulator
  Copyright (c) 2012-2017 Regents of the University of Minnesota

  Contributors:
    Alex Jokela, Minnesota Population Center, University of Minnesota
    Pranjul Yadav, Minnesota Population Center, University of Minnesota
 
  This project is licensed under the Mozilla Public License, version 2.0 (the
  "License"). A copy of the License is in the project file "LICENSE.txt",
  and is also available at https://www.mozilla.org/en-US/MPL/2.0/.
 */
package org.terrapop.tabulation.exception;

public class QueryFormatException extends Exception {
	/**
   * 
   */
  private static final long serialVersionUID = 3808854676839346198L;
  private String message = "";

	public QueryFormatException(String mess) {
		this.message = mess;
	}

	public String getMessage() {
		return ("Please Set the Value Correctly For Field " + message);
	}

	public static void main(String args[]) {
		try {
			throw new QueryFormatException("Helo w");

		} catch (QueryFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
