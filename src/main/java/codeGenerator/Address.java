package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    private int num;
    private AddressTypeInterface addressType;
    private varType varType;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public AddressTypeInterface getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressTypeInterface addressType) {
        this.addressType = addressType;
    }

    public codeGenerator.varType getVarType() {
        return varType;
    }

    public void setVarType(codeGenerator.varType varType) {
        this.varType = varType;
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
