package com.personal.erdc.trash;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;



class Result {

    /*
     * Complete the 'fetchItemsToDisplay' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_STRING_ARRAY items
     *  2. INTEGER sortParameter
     *  3. INTEGER sortOrder
     *  4. INTEGER itemsPerPage
     *  5. INTEGER pageNumber
     */

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
    	//create a hashmap that stores the page index and the items that are stored in it
    	List<String> itemsReturned = new ArrayList<>();//holds page index and items on page eventually
    	
    	//sort by sorting parameter
    	List<List<String>> priority = new ArrayList<List<String>>();
    		while(items.size() > 0) {

    			int greatestOrLeastIndice = 0;
    			for(int i= 0; i<items.size()-1; i++) {
    				// unfortunately, compare each item to each other item for each item n^2 complexity...
    				if(sortParameter == 2)
	
    				
					if(sortOrder == 0) {
						//we want ascending
	    				if(items.get(greatestOrLeastIndice).get(sortParameter).compareTo(items.get(i+1).get(sortParameter)) > 0){
	    					//assign it to priority
	    					//since the greatest found so far is less than the found, we keep going since we want desc
	    					//if we want ASC we need to find the least
	    					greatestOrLeastIndice = i+1;
							System.out.println("first was greater than second");	
	    				}
					}
					else {
						//we want descending
	    				if(items.get(greatestOrLeastIndice).get(sortParameter).compareTo(items.get(i+1).get(sortParameter)) < 0){
	    					//assign it to priority
	    					//since the greatest found so far is less than the found, we keep going since we want desc

							greatestOrLeastIndice = i+1;

	    					
	    				}

					}

    			}
				priority.add(items.get(greatestOrLeastIndice));
    			items.remove(greatestOrLeastIndice);
    		}
    	//find page based on # of items per page and priority
    	int indiceStartForPage = pageNumber * itemsPerPage;
    	int indiceEndForPage = pageNumber+1 *itemsPerPage;
    	for(int i = indiceStartForPage; i< indiceEndForPage; i++) {
    		//print items on page based on indices from found priority
    		itemsReturned.add(priority.get(i).get(0));
    	}
        return itemsReturned;
    }

}

public class App {
	public static void main(String[] args) {
		Result r = new Result();
		/*
		 * test case 1 finished
		 */
		List<List<String>> items = new ArrayList<List<String>>();
		items.add(new ArrayList<String>());
		items.add(new ArrayList<String>());
		items.get(0).add("item1");
		items.get(0).add("10");
		items.get(0).add("15");
		items.get(1).add("item2");
		items.get(1).add("10");
		items.get(1).add("15");
//		for(List<String> item: items) {
//			System.out.println(item);
//		}
		int itemsPerPage = 1;
		int pageNumber = 0;
		int sortOrder = 0;//ascending
		int sortParameter = 0; //name
		
		
		
		
		/*
		 * Test case 2 finished
		 */
//		List<List<String>> items = new ArrayList<List<String>>();
//		items.add(new ArrayList<String>());
//		items.add(new ArrayList<String>());
//		items.add(new ArrayList<String>());
//		items.add(new ArrayList<String>());
//		items.get(0).add("owjevtkuyv");
//		items.get(0).add("58584272");
//		items.get(0).add("62930912");
//		items.get(1).add("rpaqgbjxik");
//		items.get(1).add("9425650");
//		items.get(1).add("96088250");
//		items.get(2).add("dfbkasyqcn");
//		items.get(2).add("37469674");
//		items.get(2).add("4363902");
//		items.get(3).add("vjrrisdfxe");
//		items.get(3).add("18666489");
//		items.get(3).add("88046739");
////		for(List<String> item: items) {
////			System.out.println(item);
////		}
//		int itemsPerPage = 2;
//		int pageNumber = 0;
//		int sortOrder = 1;//descending
//		int sortParameter = 2; //name
		
		
		
		
		

		System.out.println(Result.fetchItemsToDisplay(items, sortParameter, sortOrder, itemsPerPage, pageNumber));
		//should output p1 because each page contains 1 item, page 0 contains 1 item, sorting by name gives p1
	
}
}