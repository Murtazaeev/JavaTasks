import java.util.Iterator;
import java.util.NoSuchElementException;

public class Hailstone implements Iterator<Integer>, Iterable<Integer> {
    int prevNum = 1;
    int currNum = 1;

    Hailstone(int a0){
        this.currNum = a0;
        this.prevNum = 0;
    }

    public Hailstone iterator(){
        return this;
    }

    public Integer next(){
        if(hasNext()){
            if(prevNum == 0){ //First iteration case
                prevNum = currNum;
                return currNum;
            }
            if(isEven(currNum)){ //Even case
                currNum = currNum / 2;
            } else { //Odd case
                currNum = 3*currNum+1;
            }
            return currNum;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext(){
        return !(currNum == 1);
    }

    private boolean isEven(int n){
        return (n % 2 == 0);
    }

    public static void main(String[] args) {
        int ini = 12, count = -1, maxel = 0;
        Hailstone hailstone = new Hailstone(ini);
        for (int h : hailstone) {
            if (h > maxel) maxel = h;
            ++count;
        }
        System.out.println(ini + " " + count + " " + maxel);
    }
}
