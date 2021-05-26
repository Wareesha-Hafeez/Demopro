
public class Books implements BookItem {
          @Override
  public void Items(int no,String name,int num, String title, String author, int date) {
        	  System.out.println(" Book collection: " + no);
        	  System.out.print("\t Book Name: " + name);
        	  System.out.print("\t BookNumberID: " + num); 
        	  System.out.print("\t Book Title: " + title); 
        	  System.out.print("\t Book Author: " +author); 
        	  System.out.print("\t Publication date : " + date); 
        	  System.out.print("\n\n");
          }
}