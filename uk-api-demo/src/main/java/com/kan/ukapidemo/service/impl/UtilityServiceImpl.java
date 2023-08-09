package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.service.UtilityService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilityServiceImpl implements UtilityService {

  @Override
  public String getNthPermutationWithRepetition(long n, @NonNull String chars, int sampleSize) {
//    StringBuilder stringBuilder = new StringBuilder();
//    int charsLength = chars.length();
//
//    for (int i = 1; i <= sampleSize; i++) {
//      int charPos;
//      int remainder;
//
//      if (i == sampleSize) {
//        remainder = (int) (n % charsLength);
//      } else {
//        double divisor = Math.pow(charsLength, sampleSize - i);
//        int quotient = (int) Math.ceil(n / divisor);
//        remainder = quotient % charsLength;
//      }
//
//      if (remainder == 0) {
//        charPos = charsLength;
//      } else {
//        charPos = remainder;
//      }
//
//      stringBuilder.append(chars.charAt(--charPos));
//    }
//
//    return stringBuilder.toString();
    return getNthPermutationWithRepetitionAndPrefix(n, chars, chars, sampleSize);
  }

  @Override
  public String getNthPermutationWithRepetitionAndPrefix(long n, String prefixChars, String chars, int sampleSize) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 1; i <= sampleSize; i++) {
      String currentChars = chars;
      if(i == 1) {
        currentChars = prefixChars;
      }
      int charsLength = currentChars.length();

      int charPos;
      int remainder;

      if (i == sampleSize) {
        remainder = (int) (n % charsLength);
      } else {
        double divisor = Math.pow(charsLength, sampleSize - i);
        int quotient = (int) Math.ceil(n / divisor);
        remainder = quotient % charsLength;
      }

      if (remainder == 0) {
        charPos = charsLength;
      } else {
        charPos = remainder;
      }

      stringBuilder.append(currentChars.charAt(--charPos));
    }

    return stringBuilder.toString();
  }

  @Override
  public List<String> getPermutationsWithRepetition(@NonNull String chars, int sampleSize) {
    List<String> permutations = new ArrayList<>();
    generatePositionToPermutationWithRepetitionMap(permutations, chars, sampleSize, "");
    return permutations;
  }

  @Override
  public List<String> getPermutationsWithRepetitionAndPrefix(@NonNull String prefixChars, @NonNull String chars, int sampleSize) {
    List<String> permutationsWithPrefix = new ArrayList<>();

//    double permutaionSize = Math.pow(chars.length(), sampleSize);

    List<String> permutations = getPermutationsWithRepetition(chars, sampleSize);
    for (int i = 0; i < prefixChars.length(); i++) {
      for (int j = 0; j < permutations.size(); j++) {
        String permutation = prefixChars.charAt(i) + permutations.get(j);
        permutationsWithPrefix.add(permutation);
        System.out.println((i*64 + j + 1) + ": " + permutation);
      }
    }
    return permutationsWithPrefix;
  }

  private void generatePositionToPermutationWithRepetitionMap(List<String> permutations, String chars, int sampleSize, String previousStr) {
    for (int i = 0; i < chars.length(); i++) {
      String currentStr = previousStr + chars.charAt(i);

      if (currentStr.length() == sampleSize) {
        permutations.add(currentStr);
//        System.out.println(currentStr);
      } else {
        generatePositionToPermutationWithRepetitionMap(permutations, chars, sampleSize, currentStr);
      }
    }
  }

}
