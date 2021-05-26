
public class Journals implements BookItem {
	@Override
	  public void Items(int no,String name,int num, String title, String author, int date) {
	        	  System.out.println(" Journal collection: " + no);
	        	  System.out.print("\t Journal Name: " + name);
	        	  System.out.print("\t Journal NumberID: " + num); 
	        	  System.out.print("\t JournalTitle: " + title); 
	        	  System.out.print("\t Journal Author: " +author); 
	        	  System.out.print("\t Publication date : " + date); 
	        	  System.out.print("\n\n");
	          }
}
