import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    for (int i=0; i<other.length; i++){
      data[i]=other[i];
    }
  }
  public boolean hasNext(){
    }
  public int next(){

  }
  public int length(){
      }
  public void reset(){

    }
}
