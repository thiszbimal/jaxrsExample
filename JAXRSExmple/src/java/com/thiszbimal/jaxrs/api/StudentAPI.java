package com.thiszbimal.jaxrs.api;
import com.thiszbimal.jaxrs.api.dao.StudentDAO;
import com.thiszbimal.jaxrs.api.dao.impl.StudentDAOImpl;
import com.thiszbimal.jaxrs.entity.Student;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/studentapi")
public class StudentAPI{
    private StudentDAO stdDAO = new StudentDAOImpl();
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String index(){
        return "<h1> Hello from JAX-RS</h1>";
    }
    @Path("list")
    
    @GET
    @Produces("application/json")
    public List<Student> list(){
        return stdDAO.getAll();
    }
    @Path(value="/{id}")
    @GET
    public Student byId(@PathParam("id") int id){
        return stdDAO.getById(id);
    }
    @POST
    @Path("save")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String save(@FormParam("fname") String firstName,@FormParam("lname") String lastName) {
        return "thank You "+firstName+ " "+lastName;
        
    }
    
}
