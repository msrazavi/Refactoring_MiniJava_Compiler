package parser;

public class Action {
    public ActType action;
    //if action = shift : number is state
    //if action = reduce : number is number of rule
    public int number;

    public Action(ActType action, int number) {
        this.action = action;
        this.number = number;
    }

    public String toString() {
        return action.toString(number);
    }
}

