import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private Long id;
    private String fantasyName;
    private String cnpj;
    private List<Product> catalogue = new ArrayList<>();
    private Address address;

    public void setId(Long id) {
        this.id = id;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", fantasyName='" + fantasyName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", catalogue=" + catalogue +
                ", address=" + address +
                '}';
    }
}
