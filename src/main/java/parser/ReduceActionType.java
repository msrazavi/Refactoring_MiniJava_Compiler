package parser;

import Log.Log;
import codeGenerator.CodeGeneratorFacade;
import scanner.token.Token;

import java.util.ArrayList;
import java.util.Stack;

public class ReduceActionType implements ActType{
    @Override
    public String toString(int number) {
        return "r" + number;
    }

    @Override
    public String typeName() {
        return "REDUCE";
    }

}
