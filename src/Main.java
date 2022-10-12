public class Main {
    public static void main(String[] args) {

        Address addressRestaurant = new Address("989985-553","Rua da esquina 1223");

        Address addressRestaurant2 = new Address("989844-500","Rua da esquina 1233");

        Restaurant restaurant = new Restaurant();
        restaurant.setId(2L);
        restaurant.setFantasyName("adsfsd");
        restaurant.setCnpj("123132113213213");
        restaurant.setAddress(addressRestaurant);
        System.out.println(restaurant);

        Restaurant restaurant2 = new Restaurant();
        restaurant2.setId(3L);
        restaurant2.setFantasyName("adsfsd34");
        restaurant2.setCnpj("123132113555222");
        restaurant2.setAddress(addressRestaurant2);
        System.out.println(restaurant2);



    }
}