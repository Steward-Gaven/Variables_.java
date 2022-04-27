class Main {

    public static void main(String[] args) {
	int intOperandA = 6;
    int intOperandB = 5;
    int intSum = intOperandA + intOperandB;
    int intProduct = intOperandA * intOperandB;
    int intDifference = intOperandA - intOperandB;
    int intQuotient = intOperandA / intOperandB;
    int intModulo = intOperandA % intOperandB;

    int myFavNum = 23;
    double doubleNum = myFavNum * 2;

    double doubleOperandA = 99;
    double doubleOperandB = 54;
    double doubleSum = intOperandA + intOperandB;
    double doubleProduct = doubleOperandA * doubleOperandB;
    double doubleDifference = doubleOperandA - doubleOperandB;
    double doubleQuotient = doubleOperandA / doubleOperandB;
    double doubleModulo = doubleOperandA % doubleOperandB;


        System.out.println(intOperandA);
        System.out.println(intOperandB);
        System.out.println(intSum);
        System.out.println(intProduct);
        System.out.println(intDifference);
        System.out.println(intQuotient);
        System.out.println(intModulo);

        System.out.println(doubleOperandA);
        System.out.println(doubleOperandB);
        System.out.println(doubleSum);
        System.out.println(doubleProduct);
        System.out.println(doubleDifference);
        System.out.println(doubleQuotient);
        System.out.println(doubleModulo);

        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The difference using int of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The number " + myFavNum + "doubled is: " + doubleNum);
    }
}
