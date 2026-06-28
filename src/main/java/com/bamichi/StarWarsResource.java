package com.bamichi;

import com.bamichi.http.StarWarsService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/starwars")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StarWarsResource {

    @RestClient
    StarWarsService starWarsService;

    @GET
    @Path("/startships")
    public String getStarShips() {
        return starWarsService.getStarShips();
    }
}
