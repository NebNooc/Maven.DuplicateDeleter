package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public long getNumberOfOccurrances(Integer element) {
        return (Arrays.stream(array)
                .filter(number -> number.equals(element))
                .count());
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) < maxNumberOfDuplications)
                .toArray(Integer[]::new);
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) != exactNumberOfDuplications)
                .toArray(Integer[]::new);
    }
}
