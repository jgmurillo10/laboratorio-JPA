/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;
import com.example.PersistenceManager;
import com.example.models.Competitor;
import com.example.models.CompetitorDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;
//import javax.ws.rs.NotAuthorizedException;

/**
 *
 * @author jg.murillo10
 */
@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LogInService {
    @PersistenceContext(unitName = "Laboratorio-JPA")
    EntityManager entityManager;    
    @PostConstruct
    public void init() {
        try {
            entityManager = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
//    @POST
//    @Path("")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response loginCompetitor(JSONObject json){// throws NotAuthorizedException{
//        
//        ArrayList<String> values=new ArrayList<String>();
//        Iterator ite= json.values().iterator();
//        while(ite.hasNext()){
//            values.add(ite.next().toString());
//        }
//        
//        String password= values.get(0);
//        String address=values.get(1);
//        String rta;
//        Competitor competitor2=entityManager.find(Competitor.class, id);
//               
//        if(competitor2.getAddress().equals(address)&
//            password.equals(competitor2.getPassword())){
//            rta="Esta haciendo el login";
//        }else{
//            rta="address or password invalid";
////            throw new NotAuthorizedException("address or password invalid");
//        }        
//        
//        
//        
//      System.out.println("before return");
// 
//            return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(rta).build();
//        
//    }
}
