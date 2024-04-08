package com.Programacion.Tema5.proyectoPeliculas.clases;

public class Pelicula {

    /**
     * id de la pelicula
     */
    private String id;
    private String rank;
    private String title;
    private String fullTitle;
    private String year;
    private String image;
    private String crew;
    private String imDbRating;
    private String imdBRatingCount;

    public Pelicula(){}

    public Pelicula(String id, String title, String year, String dir, String act1, String act2, String imDbRating) {

        setId(id);
        setTitle(title);
        setYear(year);
        setFullTitle();
        setCrew(dir, act1, act2);
        setImDbRating(imDbRating);


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {

        try {
            if(Integer.parseInt(rank) > 0) {
                this.rank = rank;
            } else {
                this.rank = "-1";
            }

        } catch (ClassCastException e) {
            e.printStackTrace();
            this.rank = "-1";
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    private void setFullTitle() {

        // Set fullTitle se compone de title + (year)
        this.fullTitle = this.title + " ("+this.year+")";

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        // El anio no puede ser negativo y debe ser un numero

        try {
            if(Integer.parseInt(year) > 0) {
                this.year = year;
            } else {
                this.year = "1900";
            }

        } catch (ClassCastException e) {
            e.printStackTrace();
            this.year = "1900";
        }


    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String dir, String act1, String act2) {
        this.crew = dir+" (dir.), "+act1+", "+act2;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(String imDbRating) {
        try {
            if(Double.parseDouble(imDbRating) > 0) {
                this.imDbRating = imDbRating;
            } else {
                this.imDbRating = "0.0";
            }

        } catch (ClassCastException e) {
            e.printStackTrace();
            this.imDbRating = "0.0";
        }
    }

    public String getImdBRatingCount() {
        return imdBRatingCount;
    }

    public void setImdBRatingCount(String imdBRatingCount) {

        try {
            if(Integer.parseInt(imdBRatingCount) > 0) {
                this.imdBRatingCount = imdBRatingCount;
            } else {
                this.imdBRatingCount = "0";
            }

        } catch (ClassCastException e) {
            e.printStackTrace();
            this.imdBRatingCount = "0";
        }
    }
}