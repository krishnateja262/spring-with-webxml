/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dispatcher.controller;

import org.dispatcher.beans.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author krishna
 */
@Controller
public class SimpleController {
    
    @Autowired
    HelloBean helloBean;

    public void setHelloBean(HelloBean helloBean) {
        this.helloBean = helloBean;
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView simpleFunction(){
        helloBean.setFirstName("krishnaaaaaaa");
        System.out.println("*********"+helloBean.getFirstName());
        return new ModelAndView("hello");
    }
    
}
