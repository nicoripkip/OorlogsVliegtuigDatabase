package com.nicoripkip.plane;


import java.util.Date;


/**
 * Dit is de model klasse van de database table plane
 * @author Nico van Ommen
 * 
 * @version 1.0
 * @since 06-12-2021
 */
public class Plane {
    /**
     * 
     */
    private Long id;


    /**
     * 
     */
    private String name;


    /**
     * 
     */
    private String description;


    /**
     * 
     */
    private Double length;


    /**
     * 
     */
    private Double spanwidth;


    /**
     * 
     */
    private Double empty_weight;


    /**
     * 
     */
    private Double gross_weight;

    /**
     * 
     */
    private Integer topspeed;


    /**
     * 
     */
    private Integer range;


    /**
     * 
     */
    private Integer altitude;


    /**
     * 
     */
    private String version;


    /**
     * 
     */
    private Long category_id;


    /**
     * 
     */
    private Long era_id;


    /**
     * 
     */
    private Date first_flight;


    /**
     * 
     */
    private Boolean retired;


    /**
     * 
     */
    private Date retirement_date;


    /**
     * 
     */
    private String image;


    /**
     * Constructor
     */
    public Plane()
    {
        //
    }


    /**
     * Constructor
     * 
     * @param id
     * @param name
     * @param description
     * @param length
     * @param spanwidth
     * @param empty_weight
     * @param gross_weight
     * @param topspeed
     * @param range
     * @param altitude
     * @param version
     * @param category_id
     * @param era_id
     * @param first_flight
     * @param retired
     * @param retirement_date
     * @param image
     */
    public Plane(Long id, String name, String description, Double length, Double spanwidth, Double empty_weight, Double gross_weight, Integer topspeed, Integer range, Integer altitude, String version, Long category_id, Long era_id, Date first_flight, Boolean retired, Date retirement_date, String image)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.length = length;
        this.spanwidth = spanwidth;
        this.empty_weight = empty_weight;
        this.gross_weight = gross_weight;
        this.topspeed = topspeed;
        this.range = range;
        this.altitude = altitude;
        this.version = version;
        this.category_id = category_id;
        this.era_id = era_id;
        this.first_flight = first_flight;
        this.retired = retired;
        this.retirement_date = retirement_date;
        this.image = image;
    }


    public void setId(Long id) 
    {
        this.id = id;
    }


    public Long getId()
    {
        return this.id;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return this.name;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public String getDescription()
    {
        return this.description;
    }


    public void setLength(Double length)
    {
        this.length = length;
    }


    public Double getLength()
    {
        return this.length;
    }


    public void setSpanWidth(Double spanwidth)
    {
        this.spanwidth = spanwidth;
    }


    public Double getSpanWidth()
    {
        return this.spanwidth;
    }


    public void setEmptyWeight(Double empty_weight)
    {
        this.empty_weight = empty_weight;
    }


    public Double getEmptyWeight()
    {
        return this.empty_weight;
    }


    public void setGrossWeight(Double gross_weight)
    {
        this.gross_weight = gross_weight;
    }


    public Double getGrossWeight()
    {
        return this.gross_weight;
    }


    public void setTopSpeed(Integer topspeed)
    {
        this.topspeed = topspeed;
    }


    public Integer getTopSpeed()
    {
        return this.topspeed;
    }


    public void setRange(Integer range)
    {
        this.range = range;
    }


    public Integer getRange()
    {
        return this.range;
    }


    public void setAltitude(Integer altitude)
    {
        this.altitude = altitude;
    }


    public Integer getAltitude()
    {
        return this.altitude;
    }


    public void setVersion(String version)
    {
        this.version = version;
    }


    public String getVersion()
    {
        return this.version;
    }


    public void setCategoryId(Long id)
    {
        this.category_id = id;
    }


    public Long getCategoryId()
    {
        return this.category_id;
    }


    public void setEraId(Long id)
    {
        this.era_id = id;
    }


    public Long getEraId()
    {
        return this.era_id;
    }


    public void setFirstFlight(Date first_flight)
    {
        this.first_flight = first_flight;
    }


    public Date getFirstFlight()
    {
        return this.first_flight;  
    }


    public void setRetired(Boolean retired)
    {
        this.retired = retired;
    }


    public Boolean getRetired()
    {
        return this.retired;
    }


    public void setRetirementDate(Date retirement_date)
    {
        this.retirement_date = retirement_date;
    }


    public Date getRetirementDate()
    {
        return this.retirement_date;
    }


    public void setImage(String image)
    {
        this.image = image;
    }


    public String getImage()
    {
        return this.image;
    }
}
