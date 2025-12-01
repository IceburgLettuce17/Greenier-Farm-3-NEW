package java.lang;

// Simple StringBuilder shim I made to fix an error.
// Only has functions that Green Farm 3 calls.
public final class StringBuilder extends Object
{
  
	private String currAppend;
  public StringBuilder(){new StringBuffer();}

  
  public StringBuilder(int arg0){new StringBuffer(arg0);}

  
  public StringBuilder(String arg0){new StringBuffer(arg0);}

  
  public int length() {return new StringBuffer().length();}

  
  public synchronized StringBuilder append(Object arg0){System.out.println(currAppend+arg0); return this;}

  
  public synchronized StringBuilder append(String arg0){System.out.println(currAppend+arg0); return this;}

  
  public synchronized StringBuilder append(char[] arg0){System.out.println(currAppend+arg0.toString());return this;}
  
  public synchronized StringBuilder append(char[] arg0, int arg1, int arg2){System.out.println(currAppend+arg0.toString()+arg1+arg2);return this;}
  
  public StringBuilder append(boolean arg0){System.out.println(currAppend+arg0); return this;}

  
  public synchronized StringBuilder append(char arg0){System.out.println(currAppend+arg0); return this;}

  
  public StringBuilder append(int arg0){System.out.println(currAppend+arg0); return this;}

  
  public StringBuilder append(long arg0){System.out.println(currAppend+arg0); return this;}

  
  public StringBuilder append(float arg0){System.out.println(currAppend+arg0); return this;}

  
  public StringBuilder append(double arg0){System.out.println(currAppend+arg0); return this;}
  
  public String toString(){return new StringBuffer(currAppend).toString();}

}