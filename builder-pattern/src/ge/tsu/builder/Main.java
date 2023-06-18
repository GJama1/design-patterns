package ge.tsu.builder;

public class Main {
    public static void main(String[] args) {

        HttpRequest<Void> request1 = new HttpRequestBuilder<Void>()
                .url("localhost:8080/users")
                .method(HttpMethod.GET)
                .header("Authorization", "Bearer token")
                .build();

        System.out.println(request1);

        HttpRequest<LoginParam> request2 = new HttpRequestBuilder<LoginParam>()
                .url("localhost:8080/login")
                .method(HttpMethod.POST)
                .content(new LoginParam("Username", "Aa12345."))
                .build();

        System.out.println(request2);

    }

}