package scanner;

import scanner.token.Token;

public class ScannerFacade {
    private final lexicalAnalyzer lexicalAnalyzer;

    public ScannerFacade(java.util.Scanner scanner) {
        this.lexicalAnalyzer = new lexicalAnalyzer(scanner);
    }

    public Token getNextToken() {
        return this.lexicalAnalyzer.getNextToken();
    }


}
