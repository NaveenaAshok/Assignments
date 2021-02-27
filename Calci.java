package org.department;

public class Calci {

public void add(int c,int d,int e) {System.out.println(c+d+e);}
public int add(int a,int b) {
		System.out.println(a+b);
	return a+b;
}
public void multiply(int f,int g)
{System.out.println(f * g);
}

public void multiply(int h,double i)
{System.out.println(h * i);}

public void divide( int j, int k)
{
	System.out.println(j/k);}

public void divide(double l, int m)

{System.out.println(l/m);}

public static void main(String[] args) {
	
	Calci prob = new Calci();
	prob.add(5, 6);
	prob.add(3,4,5);
	prob.multiply(1, 4.6);
	prob.multiply(5, 5);
	prob.divide(5.5, 5);
	prob.divide(5, 5);
	
}



}
