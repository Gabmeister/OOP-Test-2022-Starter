package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	Nematode[] nematodes = new Nematode[13]; //13 nematodes in csv file
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

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		table = loadTable("nematodes.csv","header"); //csv file contains headers
		for(TableRow row:table.rows()){ //loop to collect data from .csv file inside nematode constructor
            name = row.getString("name");
            length = row.getInt("length");
            limbs = row.getInt("limbs");
            gender = row.getString("gender");
            eyes = row.getInt("eyes");
        }
	}


	public void draw()
	{	
	}
}
