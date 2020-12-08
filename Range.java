import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start,  int end){
  try{
      if(start>end){
        throw new IllegalArgumentException("Start value must be less than or equal to the end value");
      }
      this.start=start;
      this.end=end;
      current = start;
    }
    catch(IllegalArgumentException e){
      throw new IllegalArgumentException("Start value must be less than or equal to the end value");
    }
  }
   //start over from the start of the sequence
  public void reset(){
    current=start;
    }
    //returns the total length of the sequence
  public int length(){
    return end-start;
    }
    //does the sequence have more elements?
  public boolean hasNext(){
      return current<=end;
    }

  //@throws NoSuchElementException
  //return the current value in the sequence and advances to the next
  public int next(){
    int beforenext = current;
    try{
      if(current>end){
        throw new NoSuchElementException("Current can't be greater than end");
      }
      current++;
    }
    catch(NoSuchElementException e){
    throw new NoSuchElementException("Current can't be greater than end");
    }
   return beforenext;
 }
}
