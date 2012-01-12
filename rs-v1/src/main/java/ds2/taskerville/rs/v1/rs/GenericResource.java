/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.rs.v1.rs;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;

/**
 * REST Web Service
 *
 * @author kaeto23
 */
@Path("generic")
@RequestScoped
public class GenericResource {

  @Context
  private UriInfo context;

  /**
   * Creates a new instance of GenericResource
   */
  public GenericResource() {
  }

  /**
   * Retrieves representation of an instance of
   * ds2.taskerville.rs.v1.rs.GenericResource
   *
   * @return an instance of java.lang.String
   */
  @GET
  @Produces("application/xml")
  public String getXml() {
    //TODO return proper representation object
    throw new UnsupportedOperationException();
  }

  /**
   * PUT method for updating or creating an instance of GenericResource
   *
   * @param content representation for the resource
   * @return an HTTP response with content of the updated or created resource.
   */
  @PUT
  @Consumes("application/xml")
  public void putXml(String content) {
  }
}
