package coffee.lang;

import java.lang.Object;
import java.lang.String;
import java.lang.System;

// A basic StringBuilder/Buffer implementation I made to fix an error.
// Only has functions that Green Farm 3 calls.
public final class StringBuilder extends Object
{
	private String currAppend;
	
	private final static boolean enableDebugAdd = true;
	private boolean hasPrintedWhenInit;
	
	private void AddToAppend(Object string)
	{
		currAppend += string;
		if (enableDebugAdd)
		{
			PrintToBuffer("[CoffeeStringBuilder] " + string + " was appended to this buffer.");
		}
	}
	
	private void PrintToBuffer(Object text)
	{
		System.out.println(text);
	}
	
	public StringBuilder()
	{
		if (!hasPrintedWhenInit)
		{
			PrintToBuffer("[CoffeeStringBuilder] Initialized StringBuilder successfully.");
		}
	}

	public StringBuilder(int arg0){PrintToBuffer(arg0);}

	  
	public StringBuilder(String arg0){PrintToBuffer(arg0);}

	  
	public int length() {return currAppend.length();}

	  
	public synchronized StringBuilder append(Object arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}

	  
	public synchronized StringBuilder append(String arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}

	  
	public synchronized StringBuilder append(char[] arg0){PrintToBuffer(currAppend+arg0.toString());return this;}
	  
	public synchronized StringBuilder append(char[] arg0, int arg1, int arg2){PrintToBuffer(currAppend+arg0.toString()+arg1+arg2);return this;}
	  
	public StringBuilder append(boolean arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}

	  
	public synchronized StringBuilder append(char arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}

	  
	public StringBuilder append(int arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}

	  
	public StringBuilder append(long arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}

	  
	public StringBuilder append(float arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}

	  
	public StringBuilder append(double arg0){AddToAppend(arg0); PrintToBuffer(currAppend); return this;}
	  
	public String toString(){return currAppend; }

}