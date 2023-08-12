package parser;

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