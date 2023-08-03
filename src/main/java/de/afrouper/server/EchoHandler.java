package de.afrouper.server;

import jakarta.inject.Singleton;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Request;
import jakarta.ws.rs.core.UriInfo;


@Singleton
public class EchoHandler {

    public EchoReply handle(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        EchoReply echoReply = new EchoReply();
        echoReply.setHeader(httpHeaders.getRequestHeaders());
        echoReply.setCookies(httpHeaders.getCookies());
        echoReply.setMethod(request.getMethod());
        echoReply.setQuery(uriInfo.getQueryParameters());
        echoReply.setPath(uriInfo.getPath());
        echoReply.setRequestUri(uriInfo.getRequestUri().toString());
        return echoReply;
    }

}
