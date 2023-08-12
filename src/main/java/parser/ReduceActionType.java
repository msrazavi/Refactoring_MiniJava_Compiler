package parser;


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
