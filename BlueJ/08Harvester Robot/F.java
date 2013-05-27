import java.util.*;
/**
 * Write a description of class fdsadf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class F
{
  private String myS; 

  public F() 
  { 
    myS = "fred"; 
  } 

  public F( int n ) 
  { 
    myS = "eric"; 
  } 

  public F( String t ) 
  { 
    myS = t; 
  } 

  public String toString() 
  { 
     return myS; 
  } 

    public static void main (String[] args) 
    {
       F f1 = new F();
  F f2 = new F( 5 );
  F f3 = new F( 6 );
  F f4 = new F( "jane" );
  System.out.println( f1.toString() + f2 + f3 + f4 );
    }
}
