package com.kodnest.composition;


class Page{
	String content;
	public Page(String content) {
		this.content=content;
	}
	void displayContent() {
		System.out.println("Content");
	}
}

class Book{
	Page p;
	public Book(String content) {
		this.p=new Page(content);
	}
	void readPage() {
		System.out.println("reading page");
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("This is a Book");
		book.readPage();
		book=null;
		book.readPage();//exception
		
	}

}
