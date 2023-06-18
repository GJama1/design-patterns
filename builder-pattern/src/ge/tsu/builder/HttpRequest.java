package ge.tsu.builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest<T> {

    private String url;

    private HttpMethod method;

    private Map<String, String> headers = new HashMap<>();

    private T content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void setHeader(String header, String value) {
        headers.put(header, value);
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method=" + method +
                ", headers=" + headers +
                ", content=" + content +
                '}';
    }
}
