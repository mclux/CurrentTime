/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.time.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



/**
 *
 * @author McLux
 */
public class CurrentTime {
    private LocalTime CurrentDate;

    public LocalTime getCurrentDate() {
        return CurrentDate;
    }

    public void setCurrentDate(LocalTime CurrentDate) 
    {        
        this.CurrentDate = CurrentDate;
    }
}
