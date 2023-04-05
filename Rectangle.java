package Abc;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package encapsulationTest; 
	}
		// Declare instance variables as private in the class. 
		   private int length; 
		   private int breadth; 
		// Declare a constructor Rectangle and define parameters of constructor. 
		 Rectangle(int length, int breadth)
		 { 
		  this.length = length; 
		  this.breadth = breadth; 
		 } 
		// Create a getter method for each private variable. 
		public int getLength()
		{ 
		 return length; 
		} 
		public int getBreadth()
		{ 
		 return breadth; 
		} 
		// Create a setter method for each private variable and define parameter. 
		public void setLength(int length)
		{ 
		 this.length = length; 
		} 
		public void setBreadth(int breadth)
		{ 
		 this.breadth = breadth; 
		 } 
		}
	


