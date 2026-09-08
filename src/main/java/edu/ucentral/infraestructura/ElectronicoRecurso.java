package edu.ucentral.infraestructura;

import edu.ucentral.aplicacion.ElectronicoServicio;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/electronico")
public class ElectronicoRecurso {
    @Inject
    ElectronicoServicio electronicoServicio;

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crear(ElectronicoDto electronicoDto){

        electronicoServicio.guardar(electronicoDto);
        return Response.status(Response.Status.CREATED).entity(electronicoDto).build();
    }
}
