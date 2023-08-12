package parser;

import codeGenerator.CodeGeneratorFacade;
import scanner.token.Token;

import java.util.ArrayList;
import java.util.Stack;

public class ShiftActionType implements ActType{
    @Override
    public String toString(int number) {
        return "s" + number;
    }

    @Override
    public String typeName() {
        return "SHIFT";
    }

}
