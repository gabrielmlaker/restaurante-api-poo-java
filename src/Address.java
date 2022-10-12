public class Address {

    String cep;
    String complement;

    public Address(String cep, String complement) {
        this.cep = cep;
        this.complement = complement;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "cep='" + cep + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }
}
