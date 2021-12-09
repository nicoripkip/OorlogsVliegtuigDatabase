package com.nicoripkip.plane;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 * Deze klasse is de controller van de vliegtuigen. Via deze klasse kunnen
 * Er allemaal verschillende acties en manipulaties worden uitgevoerd op de
 * tabel: Plane
 * @author Niko van Ommen
 * 
 * @version 1.0
 * @since 06-12-2021
 */
@RestController
@RequestMapping(path = "/plane")
public class PlaneController {
    /**
     * Methode voor het ophalen van de read pagina
     * 
     * @return String
     */
    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public String getPlanes()
    {
        

        return "Dit is een test!";
    }


    @RequestMapping(path = "/post", method = RequestMethod.POST)
    public String postPlanes()
    {
        return "";
    }


    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public String updatePlanes()
    {
        return "";
    }


    @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
    public String deletePlanes()
    {
        return "";
    }
}