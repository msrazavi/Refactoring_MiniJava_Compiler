package codeGenerator;

public class IndirectAddressType implements AddressTypeInterface {
    @Override
    public String toString(int num) {
        return "@" + num;
    }
}
