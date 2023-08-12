package parser;

import codeGenerator.CodeGeneratorFacade;
import scanner.ScannerFacade;
import scanner.token.Token;

import java.util.ArrayList;
import java.util.Stack;

public interface ActType {
    String toString(int number);

    String typeName();
}

