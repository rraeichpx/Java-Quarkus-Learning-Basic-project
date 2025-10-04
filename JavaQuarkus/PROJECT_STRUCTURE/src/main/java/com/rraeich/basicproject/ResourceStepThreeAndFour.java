package com.rraeich.basicproject;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello-form")
public class ResourceStepThreeAndFour {

    @Inject
    @Location("hello-form/hello-form.html")
    Template hello_form;

    @Inject
    @Location("hello-form/greeting.html")
    Template greeting;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return hello_form.data("name", null)
                            .data("email", null)
                            .data("age", null)
                            .data("kvkk", false);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance postForm(@FormParam("name") String name,
                                        @FormParam("email") String email,
                                        @FormParam("kvkk") String kvkk,
                                        @FormParam("age") String age) {

        boolean kvkkApproved = "on".equals(kvkk);

        return greeting.data("name", name)
                        .data("email", email)
                        .data("age", age)
                        .data("kvkk", kvkkApproved);
    }
}

