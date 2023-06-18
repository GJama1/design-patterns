public class Frontend {

    private JavaAPI javaAPI;

    public Frontend(JavaAPI javaAPI) {
        this.javaAPI = javaAPI;
    }

    public void signup(String username, String password) {
        System.out.println("Sending user info to the api");
        javaAPI.registerUser(username, password);
    }

}
