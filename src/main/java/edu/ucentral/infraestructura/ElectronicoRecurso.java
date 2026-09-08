package edu.ucentral.infraestructura;

import edu.ucentral.aplicacion.ElectronicoServicio;
import edu.ucentral.dominio.Electronico;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

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
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response consultar(){

        List<Electronico> listado =  electronicoServicio.consultarTodos();
        return Response.status(Response.Status.OK).entity(listado).build();
    }
}
