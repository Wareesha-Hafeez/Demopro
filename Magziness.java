
public class Magziness implements BookItem {
	@Override
	  public void Items(int no, String name, int num, String title, String author, int date) {
	        	  System.out.println(" Magazines collection: " + no);
	        	  System.out.print("\t Magazines Name: " + name);
	        	  System.out.print("\t MagazinesNumberID: " + num); 
	        	  System.out.print("\t Magazines Title: " + title); 
	        	  System.out.print("\t Magazines Author: " +author); 
	        	  System.out.print("\t Publication date : " + date); 
	        	  System.out.print("\n\n");
	          }
}
