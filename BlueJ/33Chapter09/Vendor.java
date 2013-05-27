/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

public class Vendor
{
  // Fields:
  private int price, number, money, change;
  private static double totalSales = 0.0;
  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
  public Vendor (int p, int n)
  {
    price = p;
    number = n;
  }

  //  Sets the quantity of items in stock.
  //  Parameters:
  //    int number of items to place in stock
  //  Return:
  //    None
  public void setStock (int n)
  {
    number = n;
  }

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock
  public int getStock()
  {
    return number;
  }

  //  Adds a specified amount (in cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
  public void addMoney (int m)
  {
    money += m;
  }

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit
  public int getDeposit()
  {
    return money;
  }

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
  public boolean makeSale()
  {
    if (number > 0 && money >= price)
      {
      number--;
      change = money - price;
      money = 0;
      totalSales += price / 100.0;
      return true;
    }
    else
      {
      change = money;
      money = 0;
      return false;
      }
  }
  
  public static double getTotalSales()
  {
      double q = 0.0;
      q = totalSales;
      totalSales = 0;
      return totalSales;
  }
    

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change
  public int getChange()
  {
    return change;
  }
}
