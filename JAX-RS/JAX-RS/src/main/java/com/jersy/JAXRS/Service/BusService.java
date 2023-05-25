package com.jersy.JAXRS.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.jersy.JAXRS.Entity.BusPassengers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;

@Service
public class BusService {

	
	private static Map<Integer,BusPassengers> pDetails=new HashMap<>();
	
	static {
		BusPassengers Passeneger1=new BusPassengers(1,"ram",1200,"Bangalore");
		BusPassengers Passeneger2=new BusPassengers(2,"shyam",2200,"Hydearabad");
	BusPassengers Passeneger3=new BusPassengers(3,"ganesh",3200,"Chennai");
	pDetails.put(Passeneger1.getpId(), Passeneger1);
	pDetails.put(Passeneger2.getpId(), Passeneger2);
	pDetails.put(Passeneger3.getpId(), Passeneger3);
	
	}
    
	public Collection<BusPassengers> getAllPassengers() {
		return pDetails.values();
	}
	
	public Response createResource(BusPassengers bP) throws URISyntaxException {
		if(bP.getPassengerName() == null || bP.getPassengerDestination() == null) {
			return Response.status(404).entity("provide valid values please").build();
		}
		else {
			
			return Response.status(201).entity(bP).build();
		}
		
	}
	
	public Response updatePassengerValues(int id, BusPassengers bp) {
		Set<Integer> pSet=pDetails.keySet().stream().collect(Collectors.toSet());
		if(pSet.contains(id)) {
			bp.setPassengerDestination(bp.getPassengerDestination());
			bp.setPassengerName(bp.getPassengerName());
			bp.setpPrice(bp.getpPrice());
			return Response.status(200).entity(bp).build();
		}
		else {
			return Response.status(404).entity("pId not found").build();
			
		}
	}
	
		public Response DeleteUser(int id) {
			BusPassengers p=pDetails.get(id);
			if(p!=null) {
				pDetails.remove(id);
				return Response.status(200).entity("deleted successfully").build();
			}
			else {
				return Response.status(404).build();
			}
		}
	
}
