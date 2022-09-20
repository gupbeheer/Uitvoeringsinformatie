package com.tcs.uitvoering.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TreinUitvoeringsInformatieDTO {
    private final int treinserie;
    private final String van;
    private final String naar;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private final LocalDateTime vertrekTijd;
}
