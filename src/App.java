import java.util.*;
public class App {
    
    public static void main(String[] args) throws Exception {
    //write a program to redistribute pegs from biggest to lowest on three pegs
    LinkedList<Integer> pegOne = new LinkedList<Integer>();
    LinkedList<Integer> pegTwo = new LinkedList<Integer>();
    LinkedList<Integer> pegThree = new LinkedList<Integer>();
    for (int i = 4; i>= 1; i--){
        pegOne.add(i);
    }
    pegTwo.add(0); pegTwo.add(pegOne.getLast()); pegOne.remove(pegOne.getLast());
    pegThree.add(0); pegThree.add(pegOne.getLast()); pegOne.remove(pegOne.getLast());
    System.out.println(iteration(pegOne, pegTwo, pegThree));
    }
        public static LinkedList<Integer> iteration(LinkedList<Integer> pegOne,LinkedList<Integer> pegTwo,LinkedList<Integer> pegThree){
            if (pegOne.size()==1){
                return pegOne; 
            }
            System.out.println(pegOne);
                if(pegOne.getLast() < pegTwo.getLast() && pegOne.getLast() != 0){
                    pegTwo.add(pegOne.getLast());
                    pegOne.remove(pegOne.getLast());
                    return iteration(pegOne,pegTwo,pegThree);  
                }
                if(pegOne.getLast() < pegThree.getLast() && pegOne.getLast() != 0){
                    pegThree.add(pegOne.getLast());
                    pegOne.remove(pegOne.getLast());
                    return iteration(pegOne,pegTwo,pegThree);
                }
                if(pegTwo.getLast() < pegOne.getLast() && pegTwo.getLast() != 0){
                    pegOne.add(pegTwo.getLast());
                    pegTwo.remove(pegTwo.getLast());
                    return iteration(pegOne,pegTwo,pegThree);
                }
                if(pegTwo.getLast() < pegThree.getLast()&& pegTwo.getLast() != 0){
                    pegThree.add(pegTwo.getLast());
                    pegTwo.remove(pegTwo.getLast());
                    return iteration(pegOne,pegTwo,pegThree);
                }
                if(pegThree.getLast() < pegOne.getLast() && pegThree.getLast() != 0){
                    pegOne.add(pegThree.getLast());
                    pegThree.remove(pegThree.getLast());
                    return iteration(pegOne,pegTwo,pegThree);
                }
                if(pegThree.getLast() < pegTwo.getLast() && pegThree.getLast() != 0){
                    pegTwo.add(pegThree.getLast());
                    pegThree.remove(pegThree.getLast());
                    return iteration(pegOne,pegTwo,pegThree);
                }
                return pegOne;
        }
        
    
    }
          

        

