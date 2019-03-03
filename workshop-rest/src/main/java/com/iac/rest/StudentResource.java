package com.iac.rest;

import java.util.Map;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentResource {
	
	@GET
    public Response get() {
        JsonArrayBuilder jab = Json.createArrayBuilder();
        for (Map.Entry<Integer, Student> entry : StudentService.getStudenten().entrySet()) {
            int id = entry.getKey();
            Student student = entry.getValue();
            JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("id", student.getId());
            job.add("voornaam", student.getVoornaam());
            job.add("achternaam",  student.getAchternaam());
            job.add("leeftijd", student.getLeeftijd());
            job.add("opleiding", student.getOpleiding());
            jab.add(job);
        }
        return Response.status(200).entity(jab.build().toString()).build();
    }
}