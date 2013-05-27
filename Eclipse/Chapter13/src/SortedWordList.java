import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedWordList extends ArrayList<String> {
 
    public SortedWordList()      { super();   }
    public SortedWordList(int n) { super(n);  }
    
    public int indexOf(String w)
    {
        int left = 0;
        int right = this.size()-1;
        
        while ( left <= right )
        {
            int middle = (left + right) / 2;
            
            if (w.equalsIgnoreCase( this.get(middle) ) )
                return middle;
            else if ( w.compareToIgnoreCase( this.get(middle) ) < 0 )
               right = middle - 1;
            else
               left = middle + 1;    
        }
        return -1;
    }
    
    public boolean contains(String w)  { return (this.indexOf(w) != -1);  }
    
    public String set(int i, String w)
    {
        boolean beforeOK = ( (i-1) >= 0  && w.compareToIgnoreCase( this.get(i-1) ) > 0 );
        boolean afterOK =  ( (i+1) <= this.size() &&  w.compareToIgnoreCase( this.get(i+1) ) < 0 );
        
        if ( (i==0 || beforeOK) && (i==0 || afterOK) )
            return super.set(i, w);
        else
        {
            throw new IllegalArgumentException("word = " + w + "  i = " + i + "  this.size() = "+ this.size()+ " "+ beforeOK + " " + afterOK);
        }
    }
    
    public void add(int i, String w)
    {
        boolean beforeBad = ( i > 0  &&  w.compareToIgnoreCase(get(i-1)) <= 0 );
        boolean afterBad =  ( i < size()-1  &&  w.compareToIgnoreCase(get(i+1)) >= 0 );
        
        if ( beforeBad || afterBad )
            throw new IllegalArgumentException("word = " + w + "  i = " + i);
        else
            super.add(i, w);
    }
    
      public boolean add(String word)
      {
        int left = 0, right = size();  

        while (left < right)
        {
          int middle = (left + right) / 2;
          int diff = word.compareToIgnoreCase(get(middle));

          if (diff > 0)
            left = middle + 1;
          else if (diff < 0)
            right = middle;
          else
            return false;
        }
        super.add(right, word);
        return true;
      }

    
    public void merge(SortedWordList moreWords)
    {
        for (String s : moreWords)
            add(s);
    }
    
    
    
    
}