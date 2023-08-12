package parser;

import codeGenerator.CodeGeneratorFacade;
import scanner.token.Token;

import java.util.ArrayList;
import java.util.Stack;

public class AcceptActionType implements ActType {
    @Override
    public String toString(int number) {
        return "acc";
    }

    @Override
    public String typeName() {
        return "ACCEPT";
    }


}