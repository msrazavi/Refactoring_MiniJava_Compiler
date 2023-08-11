package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public AddressTypeInterface addressType;
    public varType varType;

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
