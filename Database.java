package com.ar;

/*import com.ar.ui.Admin;*/

import java.util.TreeSet;

/*import com.ar.dao.BookDAO;
import com.ar.model.Book;*/

public class Database {
	
	public static  TreeSet<Book> data;
	static{
		data=new TreeSet<>();
	    
	     data.add(new Book (1,"abc","643",233.00));
	     data.add(new Book (2,"bcd","rte",233.00));
	     data.add(new Book (3,"cde","yug",233.00));
	     data.add(new Book (4,"def","ahj",233.00));
	     //System.out.println(db);
	}


}
