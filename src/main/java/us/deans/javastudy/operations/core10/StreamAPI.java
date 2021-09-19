package us.deans.javastudy.operations.core10;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

import us.deans.javastudy.base.BaseOperation;

public class StreamAPI extends BaseOperation {

    @Override
    public void start() {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(18);
        list1.add(10);
        list1.add(24);
        list1.add(17);
        list1.add(5);

        lp.printMsg("original list1:  " + list1);

        // obtain a stream to the array list
        Stream<Integer> str1 = list1.stream();

        // obtain min and max values 
        Optional<Integer> minVal = str1.min(Integer::compare);
        if (minVal.isPresent())
            lp.printMsg("minimum value = " + minVal.get());

        // obtain a new stream because previous call to min() is a terminal operation that consumed the stream
        str1 = list1.stream();

        Optional<Integer> maxVal = str1.max(Integer::compare);
        if (maxVal.isPresent())
            lp.printMsg("maximum value = " + maxVal.get());

        // Sort stream using sorted() and display using forEach  .
        Stream<Integer> sortedStream = list1.stream().sorted();
        System.out.printf(".. sorted stream:   ");
        sortedStream.forEach((n) -> System.out.printf("%d ", n));                        // .forEach(action) : using a lambda exp
        System.out.printf("\n");

        // filter on odd values only  ... filter(predicate)
        Stream<Integer> oddVals = list1.stream().sorted().filter((n) -> (n % 2) == 1);    // .filter(predicate) : using a lambda exp
        System.out.printf(".. odd values:   ");
        oddVals.forEach((n) -> System.out.printf("%d ", n));
        System.out.printf("\n");

        // filter on odd values greater than 5 by piping filters
        oddVals = list1.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.printf(".. odd values greater than 5:   ");
        oddVals.forEach((n) -> System.out.printf("%d ", n));
        System.out.printf("\n");


    }

}
