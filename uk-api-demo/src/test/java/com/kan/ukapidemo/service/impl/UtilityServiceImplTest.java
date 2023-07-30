package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.service.UtilityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilityServiceImplTest {

  private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String CHARS = "ABCD";
  private static final int SAMPLE_SIZE = 3;

  private static final List<String> PERMUTATIONS = List.of("AAA",
                                                           "AAB",
                                                           "AAC",
                                                           "AAD",
                                                           "ABA",
                                                           "ABB",
                                                           "ABC",
                                                           "ABD",
                                                           "ACA",
                                                           "ACB",
                                                           "ACC",
                                                           "ACD",
                                                           "ADA",
                                                           "ADB",
                                                           "ADC",
                                                           "ADD",
                                                           "BAA",
                                                           "BAB",
                                                           "BAC",
                                                           "BAD",
                                                           "BBA",
                                                           "BBB",
                                                           "BBC",
                                                           "BBD",
                                                           "BCA",
                                                           "BCB",
                                                           "BCC",
                                                           "BCD",
                                                           "BDA",
                                                           "BDB",
                                                           "BDC",
                                                           "BDD",
                                                           "CAA",
                                                           "CAB",
                                                           "CAC",
                                                           "CAD",
                                                           "CBA",
                                                           "CBB",
                                                           "CBC",
                                                           "CBD",
                                                           "CCA",
                                                           "CCB",
                                                           "CCC",
                                                           "CCD",
                                                           "CDA",
                                                           "CDB",
                                                           "CDC",
                                                           "CDD",
                                                           "DAA",
                                                           "DAB",
                                                           "DAC",
                                                           "DAD",
                                                           "DBA",
                                                           "DBB",
                                                           "DBC",
                                                           "DBD",
                                                           "DCA",
                                                           "DCB",
                                                           "DCC",
                                                           "DCD",
                                                           "DDA",
                                                           "DDB",
                                                           "DDC",
                                                           "DDD");

  private UtilityService utilityService;

  @BeforeEach
  void setUp() {
    utilityService = new UtilityServiceImpl();
  }

  @Test
  void getNthPermutationWithRepetition() {
    for (int i = 0; i < PERMUTATIONS.size(); i++) {
      String actual = utilityService.getNthPermutationWithRepetition(i+1, CHARS, SAMPLE_SIZE);
      assertEquals(PERMUTATIONS.get(i), actual);
    }
  }

  @Test
  void getNthPermutationWithRepetition_withAllAlphabets() {
    String actual = utilityService.getNthPermutationWithRepetition(30, ALPHABETS, 6);
    assertEquals("AAAABD", actual);
  }
}