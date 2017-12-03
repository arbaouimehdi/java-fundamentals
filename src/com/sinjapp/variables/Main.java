package com.sinjapp.variables;

public class Main {

  public static void main(String[] args) {

    //
    //
    //
    // Integer Types
    byte numberOfEnglishLetters = 26 ;                 // 8bits  (Min -128, Max 127)
    short feetInAMile           = 5283;               // 16bits (Min -32768, Max 32767)
    int   milesToSun            = 92960000;          //  32bits (Min -2147483648, Max 2147483647)
    long  nationalDebt          = 18100000000000L;  //   64bits (Min -9223372036854775808, Max 9223372036854775807)

    System.out.println("# Integer");
    System.out.println("- byte  : "+numberOfEnglishLetters);
    System.out.println("- short : "+feetInAMile);
    System.out.println("- int   : "+milesToSun);
    System.out.println("- long  : "+nationalDebt);

    //
    //
    //
    // Floating Points
    float milesInAMarathon = 26.2f;            // 32bits (Min 1.4 * 10^-45, Max 3.4 * 10^38)
    double atomWidthInMeters = 0.0000000001d; //  64bits (Min 4.9 * 10^-324, Max 1.7 * 10^308)

    System.out.println("\n\n# Floating Point:");
    System.out.println("- float  : "+milesInAMarathon);
    System.out.println("- double : "+atomWidthInMeters);

    //
    //
    //
    // Character
    char regularU  = 'U';       // 16bits
    char accentedU = '\u00DA'; //  16bits

    System.out.println("\n\n# Character:");
    System.out.println("- char              : "+regularU);
    System.out.println("- Unicode character : "+accentedU);

    //
    //
    //
    // Boolean
    boolean todayIsSunny = true;

    System.out.println("\n\n# Boolean:");
    System.out.println("- boolean: "+todayIsSunny);

    //
    //
    //
    // Prefix / Postfix Operators
    System.out.println("\n\n# Prefix/Postfix:");
    System.out.println("Prefix: ");
    int myVal = 12;
    System.out.println(++myVal);
    System.out.println(myVal);

    System.out.println("\nPostfix: ");
    myVal = 12;
    System.out.println(myVal++);
    System.out.println(myVal);

    //
    //
    //
    // Compound Assignment Operator
    System.out.println("\n\n# Compound Assignment:");
    myVal = 50;
    myVal -= 5;
    System.out.println(myVal);

    //
    //
    //
    // Operator Precedence
    System.out.println("\n\n# Operator Precedence:");
    int valA = 21;
    int valB = 6;
    int valC = 3;
    int valD = 1;

    int result1 = valA - valB / valC;
    int result2 = (valA - valB) / valC;
    int result3 = valA / valC * valD + valB;
    int result4 = valA / valC * (valD + valB);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);

    //
    //
    //
    // Type Conversion
    float  floatVal  = 1.0f;
    double doubleVal = 4.0d;
    byte   byteVal   = 7;
    short  shortVal  = 7;
    long   longVal   = 5;

    // Implicit Widening Conversion
    short  result5 = byteVal;
    double result6 = longVal - doubleVal;
    double result7 = shortVal - longVal + floatVal + doubleVal;

    // Explicit Widening Conversion
    short  result8  = (short)longVal;
    short  result9  = (short) (byteVal - longVal);
    double result10 = (long)(shortVal - longVal + floatVal + doubleVal);

    System.out.println("\n\n# Type Conversions:");

    System.out.println("\n# Implicit Widening Conversion:");
    System.out.println(result5);
    System.out.println(result6);
    System.out.println(result7);

    System.out.println("\n# Explicit Widening and Narrowing Conversion:");
    System.out.println(result8);
    System.out.println(result9);
    System.out.println(result10);


  }

}
