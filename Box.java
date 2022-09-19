/**
* Student: Hiren Patel <br>
* Class Name: Box <br>
* Class Purpose: Written methods  <br>
*
* <hr>
* Date created: 4/5/2019 <br>
* Date last modified: 4/15/2019
* @author Hiren Patel
*/public class Box
{
	private int length;			//Boxes length 
	private int width;			//Boxes weight
	private int height;			//Boxes height
	private String type;		//Variable for box type
	private String color;		//Variable for box color

/** Method Name: Box <br>
* Method Purpose: A contractor for Box <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019
* <hr>
*	na 
*	na
* <hr>
*	@param NONE
*
*/
	public Box()
	{
		setDim(12, 12, 12);
		setType("CARDBOARD");
		setColor("TAN");
	}//end Box()

/** Method Name: Box <br>
* Method Purpose: returning the current class instance  <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*
*   @param  length:int - the length measurement
*   @param  width:int - the width measurement
*   @param  height:int - the height measurement
*   @return NONE
*/
	public Box(int length, int width, int height)
	{
		setLength(length);
		setWidth(width);
		setHeight(height);
	}//end Box(int,int,int)

/** Method Name: Box <br>
* Method Purpose: returning the current class instance  <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*
*   @param  color:String - the color of the box
*   @param  type:String - the type of the car
*   @return NONE
*/
	public Box(String type, String color)
	{
		setType(type);
		setColor(color);
	}//end Box(String,String)
	
/** Method Name: Box <br>
* Method Purpose: Copy construtor <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  a:Advisee - the new value of the box
*   @return NONE
*/	
	public Box(Box b)
	{
		this.length = b.length;
		this.width = b.width;
		this.height = b.height;
		this.type = b.type;
		this.color = b.color;
	}//end Box(box)
	
/** Method Name: setLength <br>
* Method Purpose: Assigns a new value to the length <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  length:int  - the new value of the length
*   @return NONE
*/	
	public void setLength(int length)
	{
		if(length > 0)
		{
			this.length = length;
		}//end if
	}//end setLength(int)
	
/** Method Name: setWidth <br>
* Method Purpose: Assigns a new value to the width <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  width:int  - the new value of the width
*   @return NONE
*/
	public void setWidth(int width)
	{
		if(width > 0)
		{
			this.width = width;
		}//end if
	}//end setWidth(int)
	
/** Method Name: setHeight <br>
* Method Purpose: Assigns a new value to the height <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  height:int  - the new value of the height
*   @return NONE
*/
	public void setHeight(int height)
	{
		if(height > 0)
		{
			this.height = height;
		}//end if
	}//end setHeight(int)

/** Method Name: setType <br>
* Method Purpose: Assigns a new value to the type <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  type:String  - the new value of the type
*   @return NONE
*/
	public void setType(String material)
	{
		material = material.toUpperCase();
		if(!material.equals(""))
		{
			if(material.equals("WOOD") || material.equals("METAL") ||
				material.equals("PLASTIC") || material.equals("CARDBOARD"))
			{
				this.type = material ;	
			}//end if
		}//end if
		
	}//end setType(String)
	
/** Method Name: setColor <br>
* Method Purpose: Assigns a new value to the color <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  color:String  - the new value of the color
*   @return NONE
*/
	public void setColor(String color)
	{
		if(!color.equals(""))
		{
			this.color = color.toUpperCase();
		}//end if
	}//end setColor(String)
	
/** Method Name: setDim <br>
* Method Purpose: Assigns a new value to the dimensions <br>
*
* <hr>
* Date created: 4/14/19 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  len:int  - the new value of the length
*   @param  wid:int  - the new value of the width
*   @param  ht:int  - the new value of the height
*   @return NONE
*/	
	public void setDim(int len, int wid, int ht)
	{
		if(len > 0 && wid > 0 && ht > 0)
		{
			this.length = len; 
			this.width = wid; 
			this.height = ht;
		}//end if
	}//end setDim(int, int, int)
	
	

/** Method Name: getLength <br>
* Method Purpose: this method gets the length and returns
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*  
*	@return a int containing the length 
*/
	public int getLength()
	{
		return this.length;
	}//end getLength

/** Method Name: getWidth <br>
* Method Purpose: this method gets the width and returns
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*  
*	@return a int containing the width 
*/
	public int getWidth()
	{
		return this.width;
	}//end getWidth
	
/** Method Name: getHeight <br>
* Method Purpose: this method gets the height and returns
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*  
*	@return a int containing the height
*/
	public int getHeight()
	{
		return this.height;
	}//end getHeight
	
/** Method Name: getType <br>
* Method Purpose: this method gets the type and returns
* as a String <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*  
*	@return a String containing the type 
*/
	public String getType()
	{
		return this.type;
	}//end getType
	
/** Method Name: getColor <br>
* Method Purpose: this method gets the color and returns
* as a String <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*  
*	@return a String containing the color 
*/
	public String getColor()
	{
		return this.color;
	}//end getColor
	
/** Method Name: areaBottom <br>
* Method Purpose: this method calculates the area of the bottom
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a int containing the areaBottom
*/
	public int areaBottom()
	{
		int iAreaBottom;
		iAreaBottom = (int) this.length*this.width;
		return iAreaBottom;
	}//end areaBottom
	
/** Method Name: areaSide <br>
* Method Purpose: this method calculates the area of the side
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a int containing the areaSide
*/
	public int areaSide()
	{
		int iAreaSide;
		iAreaSide = (int) this.length*this.height;
		return iAreaSide;
	}//end areaSide
	
/** Method Name: areaEnd <br>
* Method Purpose: this method calculates the area of the end
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a int containing the areaEnd
*/
	public int areaEnd()
	{
		int iAreaEnd;
		iAreaEnd = (int) this.width*this.height;
		return iAreaEnd;
	}//end areaEnd
	
/** Method Name: volume <br>
* Method Purpose: this method calculates the volume
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a int containing the volume
*/
	public int volume()
	{
		int iVolume;
		iVolume = (int) this.length*this.width*this.height;
		return iVolume;
	}//end volume
	
/** Method Name: surfaceArea <br>
* Method Purpose: this method calculates the surface area
* as a int <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a int containing the surface area
*/
	public int surfaceArea()
	{
		int iSurfaceArea;
		iSurfaceArea = (int) (2*areaBottom())+(2*areaSide())+(2*areaEnd());
		return iSurfaceArea;
	}//end surfaceArea
	
/** Method Name: materialCost <br>
* Method Purpose: this method calculates the cost of the material
* as a double <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a double containing the cost of the material
*/
	public double materialCost()
	{
		double dMatCost;
		dMatCost = 0;
		if(this.type.equals("CARDBOARD"))
		{
			dMatCost = .01;
		}
		else if(this.type.equals("PLASTIC"))
		{
			dMatCost = .02;
		}
		else if(this.type.equals("WOOD"))
		{
			dMatCost = .04;
		}
		else if(this.type.equals("METAL"))
		{
			dMatCost = .06;
		}//end if
		
		return dMatCost;
	}//end materialCost
	
/** Method Name: boxCost <br>
* Method Purpose: this method calculates the cost of the whole box
* as a double <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a double containing the cost of the whole box
*/
	public double boxCost()
	{
		double dCost = surfaceArea() * materialCost();
		
		return dCost;
	}//end boxCost

/** Method Name: boxInfo <br>
* Method Purpose: this method shows the boxes info
* as a String <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/14/2019 <br>
*
* <hr>
*
* <hr>
*	@return a String containing the cost boxes info
*/
	public String boxInfo()
	{
		String strBoxInfo ="";
		strBoxInfo += "\nLength: " + this.length;
		strBoxInfo += "\tWidth: " + this.width;
		strBoxInfo += "\tHeight: " + this.height;
		strBoxInfo += "\nVolume: " + volume();
		strBoxInfo += "\tSurface Area: " + surfaceArea();
		strBoxInfo += " \nMaterial: " + this.type;
		strBoxInfo += " \tColor:  " + this.color;
		strBoxInfo += " \nCost of material:  " + materialCost();
		strBoxInfo += " \tTotal cost of Box:  " + boxCost();
		return strBoxInfo;
	}//end boxInfo
	
/** Method Name: equals <br>
* Method Purpose: this method tests if it is equal
* as a boolean <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/15/2019 <br>
*
* <hr>
*
* <hr>
*	@param a: equals - box b 
*	@return a boolean containing address
*/
	public boolean equals(Box b)
	{
		boolean blnEqual = true;
		
		if(this.length != b.length)
		{
			blnEqual = false;
		}
		else if(this.width != b.width)
		{
			blnEqual = false;
		}
		else if(this.height != b.height)
		{
			blnEqual = false;
		}
		else if(this.type != b.type)
		{
			blnEqual = false;
		}
		else if(this.color != b.color)
		{
			blnEqual = false;
		}//end if
		
		return blnEqual;
	}//end equals(b)
	
}//end class Box

