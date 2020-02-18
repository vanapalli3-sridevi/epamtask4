package com.epam.task.cleancode;
import java.io.*;
import java.util.*;
public class Compoundinterest {
	 double principle=1000, rate=10.25, time=5;
    
	double CI;
    public double getinterest() {
    	CI= principle * (Math.pow((1 + rate / 100), time));
        return(CI);
    }
    
}
