package ua.lviv.iot.decor.server;

import ua.lviv.iot.decor.decorations.Decoration;
import ua.lviv.iot.decor.persistence.dao.DecorationDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/decorations")
@SessionScoped
public class DecorationService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private DecorationDao decorationDao;

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Decoration getDecoration(@PathParam("id") Integer id) {
        return decorationDao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createDecoration(Decoration decoration) {
        //houseDeviceMap.put(id, houseDeviceObj);
        decorationDao.persist(decoration);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteDecoration(@PathParam("id") Integer id) {
        decorationDao.delete(id);
        return Response.ok().build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateDecoration(Decoration decoration) {
        //houseDeviceMap.put(id, getHouseDeviceObj2);
        decorationDao.update(decoration);
        return Response.ok().build();
    }
}
