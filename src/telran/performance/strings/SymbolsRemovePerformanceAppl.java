package telran.performance.strings;

import java.util.Random;

public class SymbolsRemovePerformanceAppl {
    private static final int N_SYMBOLS = 1000;
    private static final int N_RUNS = 10000;

    public static void main(String[] args) {
        String testString = generateRandomString(N_SYMBOLS);
        char symbolToRemove = (char) (new Random().nextInt(94) + 32); 

        SymbolsRemovePerformanceTest testStandard = new SymbolsRemovePerformanceTest("Test SymbolsRemoveStandard", N_RUNS, new SymbolsRemoveStandard(), testString, symbolToRemove);

        testStandard.runTest();
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        return random.ints(32, 127) 
                     .limit(length)
                     .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                     .toString();
    }
}
