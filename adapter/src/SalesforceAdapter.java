public class SalesforceAdapter extends JavaAPI {

    private SalesforceAPI salesforceAPI;

    public SalesforceAdapter(SalesforceAPI salesforceAPI) {
        this.salesforceAPI = salesforceAPI;
    }

    @Override
    public void registerUser(String username, String password) {
        salesforceAPI.saveUser(username);
        System.out.println("Saving password in authorization server: " + password);
    }

}
