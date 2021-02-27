package org.system;

public class Desktop extends Computer implements Hardware, Software{

	public void desktopSize()
	{
		System.out.println("Printing Desktop size");

	}
	public void desktopModel()
	{
		System.out.println("Printing Desktop Model from Desktop class");

	}	
	public static void main(String[] args) {
		Desktop mydesktop = new Desktop();
		mydesktop.computerModel();
		mydesktop.desktopModel();
		mydesktop.desktopSize();
		
	}
	public void hardwareResources() {
		// TODO Auto-generated method stub
		
	}
	public void softwareResources() {
		// TODO Auto-generated method stub
		
	}
}
