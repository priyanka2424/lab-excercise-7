/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


import java.util.*;
class arraylist1 {
    public static void main(String args[]){
        
        //Creating the ArrayList
        ArrayList<String> al=new ArrayList<String>();
        ArrayList<String> al1=new ArrayList<String>();
       
        
        
        //Adding objects in ArrayList
        al.add("job");
        al.add("requirement");
        al.add("thing");
        
        al1.add("job");
        al1.add("requirement");
        al1.add("thing");
        
        
        //Printing the ArrayList
        System.out.println(al);
        
        
        //Printing the all the word
        for(String al2: al){
            System.out.println(al2);
        }
       
        //Printing them with all plurals and captialized
        for(int i=0;i<al.size();i++){
            String name=al.get(i);
            String[] names=name.split("\\s+");
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<names.length;j++){
                if(j!=0){
                    sb.append(' ');
                }
                sb.append(Character.toUpperCase(names[j].charAt(0)));
                sb.append(names[j].substring(1).toLowerCase());
                sb.append("s");   //for plural form
            }
            al.set(i, sb.toString());
            
        }
       System.out.println(al);
        
      //Printing in Reverse order
      Collections.reverse(al);
      System.out.println(al);
      Collections.reverse(al);
      
      //Printing all words without plurals
      for(int i=0;i<al1.size();i++){
            String name=al1.get(i);
            String[] names=name.split("\\s+");
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<names.length;j++){
                if(j!=0){
                    sb.append(' ');
                }
                sb.append(Character.toUpperCase(names[j].charAt(0)));
                sb.append(names[j].substring(1).toLowerCase());
                
            }
            al1.set(i, sb.toString());
            
        }
       System.out.println(al1);
      
    }

  
    
    
}
