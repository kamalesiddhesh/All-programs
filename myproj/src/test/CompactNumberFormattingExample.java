package test;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingExample {
	
	public static void main(String[] args) {
		
//		NumberFormat compactFormatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.INTEGER_FIELD);

        // Formatting large numbers
//        System.out.println("Short Format: " + compactFormatter.format(1000));  // Output: 1K
//        System.out.println("Short Format: " + compactFormatter.format(1000000));  // Output: 1M

        // Creating a number formatter with compact style (long)
//        NumberFormat compactLongFormatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.FRACTION_FIELD);

        // Formatting large numbers in long style
//        System.out.println("Long Format: " + compactLongFormatter.format(10000000));  // Output: 10 million
//        System.out.println("Long Format: " + compactLongFormatter.format(1000000000));  // Output: 1 billion
	}

}
