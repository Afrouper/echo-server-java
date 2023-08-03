package de.afrouper.server;

import jakarta.ws.rs.core.Cookie;
import jakarta.ws.rs.core.MultivaluedMap;

import java.util.Map;

public class EchoReply {

    private String method;
    private String path;
    private String requestUri;
    private MultivaluedMap<String, String> query;
    private MultivaluedMap<String, String> header;
    private Map<String, Cookie> cookies;

    public MultivaluedMap<String, String> getHeader() {
        return header;
    }

    public void setHeader(MultivaluedMap<String, String> header) {
        this.header = header;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public MultivaluedMap<String, String> getQuery() {
        return query;
    }

    public void setQuery(MultivaluedMap<String, String> query) {
        this.query = query;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public Map<String, Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(Map<String, Cookie> cookies) {
        this.cookies = cookies;
    }
}
