package org.neogiciel;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/")
public class HelloWorld {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello";
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "Test";
    }


    @GET
    @Path("get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String get(@PathParam("id") String id) {
        
        return "id = "+ id;

    }

    @GET
    @Path("/push")
    @Produces(MediaType.TEXT_PLAIN)
    public String push() {
        return "Push";
    }


}
