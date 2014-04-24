package com.impequeibel.facturados.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: Diego Anazonian
 * Date: 4/24/14
 * Time: 9:49 AM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class FacturadosController {

    @RequestMapping(value = "/facturados/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("facturados/facturados-home");

        return mav;
    }


}
