package com.cg.finalkeyword;

class C
{
//we cannot override any final method
//final void accept()
	void accept()
{
	System.out.println("Hey there, I wanna provie restriction");
}
}
class D extends C
{
	void accept()
	{
		System.out.println("Restriction provided");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		D d=new D();
		d.accept();

	}

}
