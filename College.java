package org.college;

public class College extends University{

	public String collegeName()
	{
		System.out.println("My College name is Sairam Engineering College");
		return "name is Sairam";
	}
	public String collegeCode()
	{
		System.out.println("My College code is 4125");
		return "code is 4125";
	}

	
	public String collegeRank()
	{
		System.out.println("My college rank is No 25 in TN");
		return "Rank is 25";
		
	}
	@Override
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("UG");
		
		
	}
	public static void main(String[] args) {
		College newC = new College();
		newC.ug();
		newC.pg();
	}
}
