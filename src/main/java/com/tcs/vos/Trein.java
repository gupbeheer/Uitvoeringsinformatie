package com.tcs.vos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Trein {

    private Integer id;
    private Integer nummer;
    private LocalDate datum;
    private LocalTime vertrekTijd;
    private LocalTime aankomstTijd;
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Trein() {
    }

    public Trein(Integer id, Integer nummer, LocalDate datum, String vertrekTijd, String aankomstTijd) {
        this.id = id;
        this.nummer = nummer;
        this.datum = datum;
        setVertrekTijd(vertrekTijd);
        setAankomstTijd(aankomstTijd);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNummer() {
        return nummer;
    }

    public void setNummer(Integer nummer) {
        this.nummer = nummer;
    }

    public String getVertrekTijd() {
        return vertrekTijd.format(timeFormatter);
    }

    public void setVertrekTijd(String vertrekTijd) {
        this.vertrekTijd = LocalTime.parse(vertrekTijd, timeFormatter);
    }

    public String getAankomstTijd() {
        return aankomstTijd.format(timeFormatter);
    }

    public void setAankomstTijd(String aankomstTijd) {
        this.aankomstTijd = LocalTime.parse(aankomstTijd, timeFormatter);
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
