package com.kan.ukapidemo.service;

import lombok.NonNull;

import java.util.List;

public interface UtilityService {

  String getNthPermutationWithRepetition(long n, String chars, int sampleSize);

  String getNthPermutationWithRepetitionAndPrefix(long n, String prefixChars, String chars, int sampleSize);

  List<String> getPermutationsWithRepetition(@NonNull String chars, int sampleSize);

  List<String> getPermutationsWithRepetitionAndPrefix(@NonNull String prefixChars, @NonNull String chars, int sampleSize);
}
