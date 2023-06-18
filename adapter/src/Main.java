public class Main {
    public static void main(String[] args) {

        // Singleton
        Config singletonConfig = Config.getInstance();

        System.out.println(singletonConfig.get("title"));
        System.out.println(singletonConfig.get("description"));

        singletonConfig.printAllConfigs();


        // Adapter
        SalesforceAdapter salesforceAdapter = new SalesforceAdapter(new SalesforceAPI());

        Frontend frontend = new Frontend(salesforceAdapter);
        frontend.signup("user1", "password1");

    }

}