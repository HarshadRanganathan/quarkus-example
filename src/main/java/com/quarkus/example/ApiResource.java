package com.quarkus.example;

import com.quarkus.example.coffeeshop.domain.FavFoodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api")
public class ApiResource {

    final Logger logger = LoggerFactory.getLogger(ApiResource.class);

    @POST
    @Path("/favfood")
    public Response acceptFavFoodOrder(final FavFoodOrder favFoodOrder) {
        logger.debug("received {}", favFoodOrder);
        return Response.accepted(favFoodOrder).build();
    }
}
