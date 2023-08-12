package parser;

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
