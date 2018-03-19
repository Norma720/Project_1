package com.ftc.Project_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
      int answer = -1;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      Random r = new Random ();
      answer = r.nextInt()%98;
      answer = Math.abs(answer);
      
      //System.out.println(answer);
      while(true) {
    	  int Guess = pInt(in.readLine());
    	  
    	  if(answer > Guess ) { 
    		  System.out.println("Too Low");
    	  }
    	  else if(answer < Guess ) { 
    		  System.out.println("Too High");
    	  }
    	  else {
    		  System.out.println("Congrats!");
    		  break;
    	  }
    	  
    	  
    	  
    	  
      }
      
    }
    
    public static int pInt(String i){
    	try {
    		return Integer.parseInt(i);
    	}
    	catch (Exception e){
    		return 0;
    	}
    }
}
