/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dispatcher.controller;

import org.dispatcher.beans.HelloBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author krishna
 */
@RestController
public class SimpleRestController {
    
    @RequestMapping("/greeting")
    public HelloBean greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new HelloBean();
    }
}
