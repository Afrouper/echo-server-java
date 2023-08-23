package de.afrouper.server.dto;

import jakarta.ws.rs.core.Cookie;
import jakarta.ws.rs.core.MultivaluedMap;

import java.util.Map;

public class Request {

    private MultivaluedMap<String, String> header;
    private MultivaluedMap<String, String> query;
    private Map<String, Cookie> cookies;

    public MultivaluedMap<String, String> getHeader() {
        return header;
    }

    public void setHeader(MultivaluedMap<String, String> header) {
        this.header = header;
    }

    public MultivaluedMap<String, String> getQuery() {
        return query;
    }

    public void setQuery(MultivaluedMap<String, String> query) {
        this.query = query;
    }

    public Map<String, Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(Map<String, Cookie> cookies) {
        this.cookies = cookies;
    }
}
