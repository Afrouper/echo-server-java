package de.afrouper.server;

import de.afrouper.server.dto.EchoReply;
import de.afrouper.server.dto.Http;
import jakarta.inject.Singleton;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Request;
import jakarta.ws.rs.core.UriInfo;


@Singleton
public class EchoHandler {

    public EchoReply handle(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        EchoReply echoReply = new EchoReply();

        handleHttp(echoReply, request, uriInfo);
        handleRequest(echoReply, httpHeaders, uriInfo);

        return echoReply;
    }

    private void handleHttp(EchoReply echoReply, Request request, UriInfo uriInfo) {
        Http http = new Http();

        http.setMethod(request.getMethod());
        http.setPath(uriInfo.getPath());
        http.setRequestUri(uriInfo.getRequestUri().toString());

        echoReply.setHttp(http);
    }

    private void handleRequest(EchoReply echoReply, HttpHeaders httpHeaders, UriInfo uriInfo) {
        de.afrouper.server.dto.Request rq = new de.afrouper.server.dto.Request();

        rq.setHeader(httpHeaders.getRequestHeaders());
        rq.setCookies(httpHeaders.getCookies());
        rq.setQuery(uriInfo.getQueryParameters());

        echoReply.setRequest(rq);
    }
}
