package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	//ArrayList for holding Nematode objects
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();


	Table table;

	String name; //THIS IS ORDERED!!
	int length;
	int limbs;
	String gender;
	int eyes;
	
	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void printNematodes(){ //created method to print info to see if code worked
		for(Nematode n:nematodes){
			System.out.println(n);
		}
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		loadNematodes();
		printNematodes();			
	}
	

	public void loadNematodes()
	{
		table = loadTable("nematodes.csv","header"); //csv file contains headers
		for(TableRow row:table.rows()){ //loop to collect data from .csv file
            Nematode n = new Nematode(row);
			nematodes.add(n); //populate arraylist with objects
        }
	}


	public void draw()
	{	
		textSize(80);
		text("i cannot visualize it :(", 75, 200);
		
	}
}
