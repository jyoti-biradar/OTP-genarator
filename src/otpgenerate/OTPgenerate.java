/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otpgenerate;

import java.util.Random;

/**
 *
 * @author Felix-ITs
 */
public class OTPgenerate {

   public static char[] sendOTP(int len){
       System.out.println("your otp is:");
       String num="0123456789";
       Random r=new Random();
       char[] otp=new char[len];
       for(int i=0;i<len;i++){
           otp[i]=num.charAt(r.nextInt(num.length()));
           
       }
       return otp;
   }   
   

    public static void main(String[] args) {
        System.out.println("generate otp:");
        System.out.println(sendOTP(4));
    }
    
}
