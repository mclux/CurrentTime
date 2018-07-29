/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.time.time;

import java.time.LocalTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author McLux
 */
@RestController
public class CurrentTimeController {
    
    @RequestMapping("/GetTime")
    public LocalTime GetTime()
    {
        CurrentTime ct =new CurrentTime();
        ct.setCurrentDate(LocalTime.now());
        return ct.getCurrentDate();
    }
    
}
