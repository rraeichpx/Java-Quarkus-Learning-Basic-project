package com.rraeich.basicproject;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello-view")
public class ResourceStepTwo {

    @Inject
    @Location("hello-trying/hello.html")
    Template hello;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name") String name,
                                @QueryParam("yearsold") int yearsold,
                                @QueryParam("hometown") String hometown) {
        return hello.data("name", name)
                    .data("yearsold", yearsold)
                    .data("hometown", hometown);
    }
}
