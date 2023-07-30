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
    StringBuilder stringBuilder = new StringBuilder();
    int charsLength = chars.length();

    for (int i = 1; i <= sampleSize; i++) {
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

      stringBuilder.append(chars.charAt(--charPos));
    }

    return stringBuilder.toString();
  }

  private List<String> getPermutationsWithRepetition(@NonNull String chars, int sampleSize) {
    List<String> permutations = new ArrayList<>();
    generatePositionToPermutationWithRepetitionMap(permutations, chars, sampleSize, "");
    return permutations;
  }

  private void generatePositionToPermutationWithRepetitionMap(List<String> permutations, String chars, int sampleSize, String previousStr) {
    for (int i = 0; i < chars.length(); i++) {
      String currentStr = previousStr + chars.charAt(i);

      if (currentStr.length() == sampleSize) {
        permutations.add(currentStr);
      } else {
        generatePositionToPermutationWithRepetitionMap(permutations, chars, sampleSize, currentStr);
      }
    }
  }

}
