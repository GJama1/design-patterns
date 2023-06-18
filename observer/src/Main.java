public class Main {
    public static void main(String[] args) {

        Subscriber bobby = new Bobby();
        Subscriber jane = new Jane();
        Subscriber timmy = new Timmy();

        ElectronicStore electronicStore = new ElectronicStore();

        electronicStore.addSubscriber(bobby);
        electronicStore.addSubscriber(jane);

        Product iphone11 = new Product("iPhone 11", 1000);
        Product samsungS20 = new Product("Samsung S20", 900);

        electronicStore.addProduct(iphone11);
        electronicStore.addProduct(samsungS20);

        electronicStore.addSubscriber(timmy);
        electronicStore.unsubscribe(bobby);

        Product iphone12 = new Product("iPhone 12", 1200);

        electronicStore.addProduct(iphone12);
    }

}