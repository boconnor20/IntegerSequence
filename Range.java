import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start,  int end){
  try{
      if(start>end){
        throw new IllegalArgumentException("Start value must be less than or equal to end");
      }
      this.start=start;
      this.end=end;
      current = start;
    }
    catch(IllegalArgumentException e){
      throw new IllegalArgumentException("Start value must be less than or equal to end");
    }
  }
  public void reset(){
    current=start;
    }
  public int length(){
    return end-start+1;
    }
  public boolean hasNext(){  }

  //@throws NoSuchElementException
  public int next(){    }

}
