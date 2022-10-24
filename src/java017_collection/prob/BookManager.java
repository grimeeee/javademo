package java017_collection.prob;

import java.util.ArrayList;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		BookDTO title = bookList.get(6);
		System.out.println(title);
		
		int rentalPrice = 4; 
		
		return rentalPrice;
	}//end getRentalPrice()
}//end class








