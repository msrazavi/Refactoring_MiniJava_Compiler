package codeGenerator;

public class ImmediateAddressType implements AddressTypeInterface {
    @Override
    public String toString(int num) {
        return "#" + num;
    }
}
