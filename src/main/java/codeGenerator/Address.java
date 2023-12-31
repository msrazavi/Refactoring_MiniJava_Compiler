package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    private final int num;
    private final AddressTypeInterface addressType;
    private final varType varType;

    public int getNum() {
        return num;
    }

    public codeGenerator.varType getVarType() {
        return varType;
    }

    public Address(int num, varType varType, AddressTypeInterface addressType) {
        this.num = num;
        this.addressType = addressType;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.addressType = new DirectAddressType();
        this.varType = varType;
    }

    public String toString() {
        return addressType.toString(num);
    }
}
