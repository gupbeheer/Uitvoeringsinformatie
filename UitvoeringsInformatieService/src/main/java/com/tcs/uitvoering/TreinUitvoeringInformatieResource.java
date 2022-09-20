package com.tcs.uitvoering;

import com.tcs.uitvoering.dto.TreinUitvoeringsInformatieDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;

@Path("/tui")
public class TreinUitvoeringInformatieResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TreinUitvoeringsInformatieDTO getTreinUitvoeringsInformatie() {
        return new TreinUitvoeringsInformatieDTO(20020, "Cas", "Utr", LocalDateTime.now());
    }
}
