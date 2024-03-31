import org.junit.jupiter.api.Test;
//import sequences.*;
import java.util.Arrays;
import java.util.Random;


import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

public class StudentTest {

    @Test
    public void test() {
        //Array Tests
        oopsAllTheSameArray();
        oopsAllLessThanArray();
        oopsAllEmptyArray();
        randomArray();

        //List Tests
        oopsAllTheSameList();
        oopsAllLessThanList();
        oopsAllEmptyList();
    }

    @Test
    public void oopsAllTheSameArray(){
        String testDescription = "tests if algorithm sorts despite all values being the same";
        Integer[] allSame = new Integer[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ArraySequence<Integer> allSameSequence = new ArraySequence<>(allSame);
        ArraySequence<Integer> correctSequence = new ArraySequence<>(allSame);
        /*array sequences created using same array because final "sorted" array should be same*/
        Iterator<Integer> allSameBegin = allSameSequence.begin();
        Iterator<Integer> allSameEnd = allSameSequence.end();
        QuickSort.quicksort(allSameBegin, allSameEnd);
        try{
            assertTrue(Algorithms.equal_sequences(allSameSequence, correctSequence));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    @Test
    public void oopsAllLessThanArray(){
        String testDescription = "tests if algorithm sorts when pivot (last element) is the biggest element";
        Integer[] allLessThan = new Integer[]{3, 5, 8, 23, 6, 7, 14, 16, 10, 39, 40, 2, 4, 99};
        Integer[] correctAllLessThan = new Integer[]{2, 3, 4, 5, 6, 7, 8, 10, 14, 16, 23, 39, 40, 99};
        ArraySequence<Integer> allLessThanSequence = new ArraySequence<>(allLessThan);
        ArraySequence<Integer> correctSequence = new ArraySequence<>(correctAllLessThan);
        Iterator<Integer> allLessThanBegin = allLessThanSequence.begin();
        Iterator<Integer> allLessThanEnd = allLessThanSequence.end();
        QuickSort.quicksort(allLessThanBegin, allLessThanEnd);
        try{
            assertTrue(Algorithms.equal_sequences(allLessThanSequence, correctSequence));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    @Test
    public void oopsAllEmptyArray(){
        String testDescription = "tests if algorithm sorts when pivot (last element) is the biggest element";
        Integer[] allEmpty = new Integer[]{};
        Integer[] correctEmpty = new Integer[]{};
        ArraySequence<Integer> allEmptySequence = new ArraySequence<>(allEmpty);
        ArraySequence<Integer> correctSequence = new ArraySequence<>(correctEmpty);
        Iterator<Integer> allEmptyBegin = allEmptySequence.begin();
        Iterator<Integer> allEmptyEnd = allEmptySequence.end();
        QuickSort.quicksort(allEmptyBegin, allEmptyEnd);
        try{
            assertTrue(Algorithms.equal_sequences(allEmptySequence, correctSequence));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    @Test
    public void randomArray(){
        String testDescription = "tests the algorithm on a randomly generated array";
        Integer[] randomArray = new Integer[20];
        ArraySequence<Integer> randomArraySequence = new ArraySequence<>(randomArray);
        Iterator<Integer> i = randomArraySequence.begin();
        Iterator<Integer> randomArrayBegin = randomArraySequence.begin();
        Iterator<Integer> randomArrayEnd = randomArraySequence.end();
        Random rand = new Random();
        while(!i.equals(randomArrayEnd)){
            i.set(rand.nextInt());
            i.advance();
        }
        QuickSort.quicksort(randomArrayBegin, randomArrayEnd);
        try{
            assertEquals(Algorithms.max_of_sequence(randomArraySequence, 0), Algorithms.last(randomArrayBegin, randomArrayEnd).get());
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    @Test
    public void oopsAllTheSameList(){
        String testDescription = "tests if algorithm sorts despite all values being the same";
        Integer[] allSame = new Integer[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ArraySequence<Integer> allSameSequence = new ArraySequence<>(allSame);
        ArraySequence<Integer> correctSequence = new ArraySequence<>(allSame);
        /*array sequences created using same array because final "sorted" array should be same*/
        Iterator<Integer> allSameBegin = allSameSequence.begin();
        Iterator<Integer> allSameEnd = allSameSequence.end();
        QuickSort.quicksort(allSameBegin, allSameEnd);
        try{
            assertTrue(Algorithms.equal_sequences(allSameSequence, correctSequence));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    @Test
    public void oopsAllLessThanList(){
        String testDescription = "tests if algorithm sorts despite all values being the same";
        Integer[] allSame = new Integer[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ArraySequence<Integer> allSameSequence = new ArraySequence<>(allSame);
        ArraySequence<Integer> correctSequence = new ArraySequence<>(allSame);
        Iterator<Integer> allSameBegin = allSameSequence.begin();
        Iterator<Integer> allSameEnd = allSameSequence.end();
        QuickSort.quicksort(allSameBegin, allSameEnd);
        try{
            assertTrue(Algorithms.equal_sequences(allSameSequence, correctSequence));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    @Test
    public void oopsAllEmptyList(){
        String testDescription = "tests if algorithm sorts despite all values being the same";
        Integer[] allSame = new Integer[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ArraySequence<Integer> allSameSequence = new ArraySequence<>(allSame);
        ArraySequence<Integer> correctSequence = new ArraySequence<>(allSame);
        Iterator<Integer> allSameBegin = allSameSequence.begin();
        Iterator<Integer> allSameEnd = allSameSequence.end();
        QuickSort.quicksort(allSameBegin, allSameEnd);
        try{
            assertTrue(Algorithms.equal_sequences(allSameSequence, correctSequence));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    @Test
    public void randomList(){
        String testDescription = "tests the algorithm on a randomly generated list";
        Integer[] randomArray = new Integer[20];
        ArraySequence<Integer> randomArraySequence = new ArraySequence<>(randomArray);
        Iterator<Integer> i = randomArraySequence.begin();
        Iterator<Integer> randomArrayBegin = randomArraySequence.begin();
        Iterator<Integer> randomArrayEnd = randomArraySequence.end();
        Random rand = new Random();
        while(!i.equals(randomArrayEnd)){
            i.set(rand.nextInt());
            i.advance();
        }
        QuickSort.quicksort(randomArrayBegin, randomArrayEnd);
        try{
            assertEquals(Algorithms.max_of_sequence(randomArraySequence, 0), Algorithms.last(randomArrayBegin, randomArrayEnd).get());
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }


}
