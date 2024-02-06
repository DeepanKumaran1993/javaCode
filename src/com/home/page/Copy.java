package com.home.page;


class Running{
	
	int x,y;
}


class Sprint implements Cloneable{
	
	int a,b;
	Running usain=new Running();
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		
	}	
}





public class Copy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Sprint spr=new Sprint();
		spr.usain.x=100;
		spr.a=350;
		spr.b=416;
		spr.usain.y=200;
		
		Sprint spr2= (Sprint)spr.clone();
		spr2.usain.x=80;
		spr2.usain.y=900;
		System.out.println(spr2.usain.x);
		System.out.println(spr2.usain.y);
		System.out.println(spr.usain.x);
		System.out.println(spr.usain.y);
		
		
	}

}
