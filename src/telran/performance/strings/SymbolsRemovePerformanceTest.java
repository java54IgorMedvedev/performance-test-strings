package telran.performance.strings;

import telran.performance.PerformanceTest;

public class SymbolsRemovePerformanceTest extends PerformanceTest {
    private SymbolsRemove symbolsRemove;
    private String testString;
    private char symbolToRemove;

    public SymbolsRemovePerformanceTest(String displayName, int nRuns, SymbolsRemove symbolsRemove, String testString, char symbolToRemove) {
        super(displayName, nRuns);
        this.symbolsRemove = symbolsRemove;
        this.testString = testString;
        this.symbolToRemove = symbolToRemove;
    }

    @Override
    protected void runTest() {
        symbolsRemove.removeSymbol(testString, symbolToRemove);
    }
}
