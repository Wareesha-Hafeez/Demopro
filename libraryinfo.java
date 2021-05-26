
public class libraryinfo extends Librarymember{
	private int no, num, date;
	private String name, title, author; 
public libraryinfo(int no,String name, int num, String title, String author, int date, BookItem bookitem)
{
	super(bookitem);
	this.no=no;
	this.name=name;
	this.num=num;
	this.title=title;
	this.author=author;
	this.date=date;
}
public void checkedout() {
	bookitem.Items(no, name,num, title, author, date);
}
}
