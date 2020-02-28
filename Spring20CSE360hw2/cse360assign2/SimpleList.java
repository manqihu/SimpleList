package cse360assign2;
/**
 * Name of author: Manqi Hu
 * Class ID: 383
 * CSE 360 Assignment #2
 * File description: This assignment is designed to practice 
 * with using a version control system like Github.
 */

public class SimpleList {
	
	private int[] list;
	private int count;
	
	/* This method initialize an array with 10 elements and set count to 0. 
	 */
	public SimpleList() {
		this.list = new int[10];
		this.count = 0;
	}
	
	
	/* This method adds the parameter to the list at the beginning (index = 0)
	 * and move all all the other integers in the list over so there is room.
	 * If the list was initially full, then increase the size by 50% so there 
	 * will be room. Increment the count.
	 * @param num This integer will be added to the beginning of the list.
	 */
	public void add(int num) {
	       if(count == 0) {
	    	   list[0] = num;
	    	   count++;
	       }
	       else if(count > 0 && count < list.length) {
	    	   for(int i = count; i > 0; i--) {
	    		   list[i] = list[i-1];
	    	   }
	    	   list[0] = num;
	    	   count++;
	       }
	       else if(count >= list.length) {
	    	   increasesize();
	    	   for(int i = count; i > 0; i--) {
	    		   list[i] = list[i-1];
	    	   }
	    	   list[0] = num;
	    	   count++;
	       }
	   }
	
	
	/* if the parameter is in the list, then remove it.  The other values 
	 * in the list may need to be moved down.  Adjust the count as needed.  
	 * If the list has more than 25% empty places, the decrease the size of the list.  
	 * The list cannot be reduced to less than 1 entry.
	 * @param num This integer will be removed from the list.
	 */
	public void remove(int num) {
		
		if(count > 0) {
		for(int i=0;i<count;i++) {
			if(list[i]==num) {
				for(int j=i;j<count-1;j++) {
					list[j]=list[j+1];
				}
			}
		}
		count--;
		decreasesize();
		}
	}
	
	
	/* Return the list as a String. The elements must be separated by a space.
	 * @see java.lang.Object#toString()
	 * @return Return a string with the current elements in the list.
	 */
	public String toString() {
		String str = " ";
		for(int i = 0; i < count; i++) {
			str += list[i] + " ";
		}
		
		return str;
	}
	
	
	/* Return the location of the parameter in the list.  
	 * If the parameter is not in the list, then return -1.
	 * @param num This will be search in the list using loop.
	 * @return Return the index of num. 
	 */
	public int search(int num) {
		int position = -1;
		for(int i = 0;i < count;i++) {
			if(list[i] == num) {
				position=i;
			}
		}
		return position;
	}
	
	
	/* The append method should append the parameter to the end of the list.  
	 * If the list was full, then increase the size by 50% so there will be room.  
	 * Increment the count.
	 * @param num This integer will be added to the end of the list.
	 */
	public void append(int num) {
		int size = list.length;
		if(count < size) {
			list[count] = num;
			count++;
		}
		else if(count >= size) {
			increasesize();
			list[count] = num;
			count++;
		}
	}
	
	
	/* Return the first element in the list.  
	 * If there are no elements n the list, then return -1.
	 * @return Return the index 0 of the list.
	 */
	public int first() {
		if(count == 0) {
			return -1;
		}
		else {
		return list[0];
		}
	}
	
	
	/* Return the last element in the list.  
	 * If there are no elements n the list, then return -1.
	 * @return Return the integer at index count.
	 */
	public int last() {
		if(count == 0) {
			return -1;
		}
		else {
			return list[count - 1];
		}
	}
	
	
	/* This method increase 50% size of list when the list is full.
	 */
	public void increasesize() {
		int size = list.length;
		if(count == size) {
			int newsize = count + (count / 2);
			int newlist[] = new int[newsize];
			for(int i = 0; i < count; i++) {
				newlist[i] = list[i];
			}
			list = newlist;
			
		}
	}
	/* This method decrease the size of the list that equals to the numbers of integers
	 * in the list when there are more than 25% blank space in the list.
	 */
	public void decreasesize() {
		int size = list.length;
		double rate = count / size;
		if(rate < 0.75) {
			int newsize = count;
			int newlist[] = new int[newsize];
			for(int i = 0; i < count; i++) {
				newlist[i] = list[i];
			}
			list = newlist;
		}
	}
	
	
	/* This method returns the number of elements stored in the list.
	 * @return integer the current number of integers in the list.
	 */
	public int count() {
		return count;
	}
	
	
	/* This method returns the current number of possible locations in the list. 
	 * @return integer list length.
	 */
	public int size() {
		return list.length;
	}
	
}

