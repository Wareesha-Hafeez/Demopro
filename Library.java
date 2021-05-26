
public class Library {
	public static void main (String[]args) {
		Librarymember book=new libraryinfo(01,"The guest book", 44523," mystery", "ANGELA", 20, new Books());
		Librarymember Magazines=new libraryinfo(01,"American heritage", 5643, "biograpghy", "Robert Nail", 12, new Magziness());
		Librarymember journal=new libraryinfo(01, "emerald journal", 8764, "Friction", "Lusi beg", 10, new Journals());
		book.checkedout();
		Magazines.checkedout();
		journal.checkedout();
		}

}
