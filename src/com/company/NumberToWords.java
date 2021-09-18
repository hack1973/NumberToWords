package com.company;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }
        else {
            int digitCount = getDigitCount(number);
            number = reverse(number);
            int reversedDigitCount = getDigitCount(number);
            int lastDigit = 0;
            while (number > 0) {
                lastDigit = number % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number = number / 10;
            }
            int leadingZeros;
            leadingZeros = digitCount - reversedDigitCount;
            while (leadingZeros != 0) {
                System.out.println("Zero");
                leadingZeros = leadingZeros -1;
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return 1;
        } else {
            int count = 0;
            while (number >= 1) {
                count = count + 1;
                number = number / 10;
            }
            return count;
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + lastDigit;
            number = number / 10;
        }
        return reversedNumber;
    }
}
