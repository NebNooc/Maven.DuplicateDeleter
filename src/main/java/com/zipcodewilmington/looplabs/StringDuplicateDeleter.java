package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public long getNumberOfOccurrances(String element) {
        return (Arrays.stream(array)
                .filter(word -> word.equals(element))
                .count());
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) < maxNumberOfDuplications)
                .toArray(String[]::new);
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) != exactNumberOfDuplications)
                .toArray(String[]::new);
    }
}
