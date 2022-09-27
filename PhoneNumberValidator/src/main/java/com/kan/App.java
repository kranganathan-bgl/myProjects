package com.kan;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;

import java.util.List;

import static com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        parsePhoneNumbers();
    }

    public static void parsePhoneNumbers() {
        List<String> phoneNumbers = List.of(
            "+61422608899",
            "0422608899",
            "+61 0422 608899",
            "61 422 608899",
            "+44 7863 599199",
            "+1 (248) 385-6665",
            "65 9178 3791",
            "+64-27-2217149"
            );

        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();

        phoneNumbers.forEach((phoneNumber) -> {
            try {
                PhoneNumber phNo = phoneNumberUtil.parse(phoneNumber, "AU");

                System.out.print("Ph: " + phoneNumber);
                System.out.print(", Country code: " + phNo.getCountryCode());
                System.out.println(", National number: " + phNo.getNationalNumber() + ", Number of Leading Zeros: " + phNo.getNumberOfLeadingZeros());
            } catch (NumberParseException e) {
                System.err.println("NumberParseException was thrown: " + e.toString());
            }
        });
    }
}
