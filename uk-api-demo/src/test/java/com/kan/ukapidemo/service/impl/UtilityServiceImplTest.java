package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.service.UtilityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UtilityServiceImplTest {

  private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String CHARS = "ABCD";
  private static final String NUMBERS = "012";
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

  private static final List<String> PERMUTATIONS_WITH_PREFIX = List.of("A000",
                                                                       "A001",
                                                                       "A002",
                                                                       "A010",
                                                                       "A011",
                                                                       "A012",
                                                                       "A020",
                                                                       "A021",
                                                                       "A022",
                                                                       "A100",
                                                                       "A101",
                                                                       "A102",
                                                                       "A110",
                                                                       "A111",
                                                                       "A112",
                                                                       "A120",
                                                                       "A121",
                                                                       "A122",
                                                                       "A200",
                                                                       "A201",
                                                                       "A202",
                                                                       "A210",
                                                                       "A211",
                                                                       "A212",
                                                                       "A220",
                                                                       "A221",
                                                                       "A222",
                                                                       "B000",
                                                                       "B001",
                                                                       "B002",
                                                                       "B010",
                                                                       "B011",
                                                                       "B012",
                                                                       "B020",
                                                                       "B021",
                                                                       "B022",
                                                                       "B100",
                                                                       "B101",
                                                                       "B102",
                                                                       "B110",
                                                                       "B111",
                                                                       "B112",
                                                                       "B120",
                                                                       "B121",
                                                                       "B122",
                                                                       "B200",
                                                                       "B201",
                                                                       "B202",
                                                                       "B210",
                                                                       "B211",
                                                                       "B212",
                                                                       "B220",
                                                                       "B221",
                                                                       "B222",
                                                                       "C000",
                                                                       "C001",
                                                                       "C002",
                                                                       "C010",
                                                                       "C011",
                                                                       "C012",
                                                                       "C020",
                                                                       "C021",
                                                                       "C022",
                                                                       "C100",
                                                                       "C101",
                                                                       "C102",
                                                                       "C110",
                                                                       "C111",
                                                                       "C112",
                                                                       "C120",
                                                                       "C121",
                                                                       "C122",
                                                                       "C200",
                                                                       "C201",
                                                                       "C202",
                                                                       "C210",
                                                                       "C211",
                                                                       "C212",
                                                                       "C220",
                                                                       "C221",
                                                                       "C222",
                                                                       "D000",
                                                                       "D001",
                                                                       "D002",
                                                                       "D010",
                                                                       "D011",
                                                                       "D012",
                                                                       "D020",
                                                                       "D021",
                                                                       "D022",
                                                                       "D100",
                                                                       "D101",
                                                                       "D102",
                                                                       "D110",
                                                                       "D111",
                                                                       "D112",
                                                                       "D120",
                                                                       "D121",
                                                                       "D122",
                                                                       "D200",
                                                                       "D201",
                                                                       "D202",
                                                                       "D210",
                                                                       "D211",
                                                                       "D212",
                                                                       "D220",
                                                                       "D221",
                                                                       "D222");

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

  @Test
  void getNthPermutationWithRepetitionAndPrefix() {
    for (int i = 0; i < PERMUTATIONS_WITH_PREFIX.size(); i++) {
      String actual = utilityService.getNthPermutationWithRepetitionAndPrefix(i+1, CHARS, NUMBERS, 4);
      assertEquals(PERMUTATIONS_WITH_PREFIX.get(i), actual);
    }
  }

//  @Test
  void getPermutationsWithRepetitionAndPrefix() {
    List<String> actual = utilityService.getPermutationsWithRepetitionAndPrefix(CHARS, NUMBERS, 3);
    assertNotNull(actual);
  }
}