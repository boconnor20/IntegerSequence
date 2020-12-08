import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  //Constructors
  public ArraySequence(int [] other){
      data=other;
      currentIndex=0;
  }
  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    for (int i=0; i<otherseq.length();i++){
      data[i]=otherseq.next();
    }
    currentIndex=0;
    otherseq.reset();
    }
  //Methods
  public boolean hasNext(){
    return currentIndex<data.length;
    }
  public int next(){
    int beforenext = data[currentIndex];
    try{
      if(currentIndex>=data.length){
        throw new NoSuchElementException("Current can't be greater than end");
      }
      currentIndex++;
    }
    catch(NoSuchElementException e){
    throw new NoSuchElementException("Current can't be greater than end");
    }
   return beforenext;
  }
  public int length(){
    return data.length;
      }
  public void reset(){
    currentIndex=0;
    }
}
