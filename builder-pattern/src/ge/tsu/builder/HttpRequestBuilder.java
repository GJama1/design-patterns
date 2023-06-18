package ge.tsu.builder;

import java.util.Map;

public class HttpRequestBuilder<T> {

    private HttpRequest<T> httpRequest = new HttpRequest<>();

    public HttpRequestBuilder<T> url(String url) {
        httpRequest.setUrl(url);
        return this;
    }

    public HttpRequestBuilder<T> method(HttpMethod method) {
        httpRequest.setMethod(method);
        return this;
    }

    public HttpRequestBuilder<T> headers(Map<String, String> headers) {
        httpRequest.setHeaders(headers);
        return this;
    }

    public HttpRequestBuilder<T> header(String header, String value) {
        httpRequest.setHeader(header, value);
        return this;
    }

    public HttpRequestBuilder<T> content(T content) {
        httpRequest.setContent(content);
        return this;
    }

    public HttpRequest<T> build() {
        return httpRequest;
    }

}
