package de.afrouper.server;

import de.afrouper.server.dto.EchoReply;
import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Request;
import jakarta.ws.rs.core.UriInfo;

@Path("{var:.*}")
public class EchoResource {

    @Inject
    EchoHandler echoHandler;

    @GET
    public EchoReply get(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        Log.debug("echo called via HTTP GET");
        return echoHandler.handle(request, httpHeaders, uriInfo);
    }

    @POST
    public EchoReply post(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        Log.debug("echo called via HTTP POST");
        return echoHandler.handle(request, httpHeaders, uriInfo);
    }

    @DELETE
    public EchoReply delete(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        Log.debug("echo called via HTTP DELETE");
        return echoHandler.handle(request, httpHeaders, uriInfo);
    }

    @PUT
    public EchoReply put(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        Log.debug("echo called via HTTP PUT");
        return echoHandler.handle(request, httpHeaders, uriInfo);
    }

    @OPTIONS
    public EchoReply options(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        Log.debug("echo called via HTTP OPTIONS");
        return echoHandler.handle(request, httpHeaders, uriInfo);
    }

    @PATCH
    public EchoReply patch(Request request, HttpHeaders httpHeaders, UriInfo uriInfo) {
        Log.debug("echo called via HTTP PATCH");
        return echoHandler.handle(request, httpHeaders, uriInfo);
    }
}
