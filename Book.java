public class Book extende TangibleAsset{
	private String isbn;
	public Book (String name,intpraice,String color,Sting isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public String getIsbn(){return this.isbn;}
