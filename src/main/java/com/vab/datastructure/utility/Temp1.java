package com.vab.datastructure.utility;

public class Temp1 {
	
	public static void main(String[] args) {      
          
        //Initialize array   
        String [] arr = new String [] { "E006", "E005", "E285", "E275", "E048", "E021", "E284", "E057", "E001", "E008", "E178", "E118", "E279", "E016", "E099", "E097", "E105", "E007", "E079", "E241", "E036", "E126", "E107", "E011", "E078", "E212", "E060", "E012", "E139", "E166", "E237", "E149", "E222", "E096", "E106", "E239", "E104", "E082", "E186", "E095", "E167", "E113", "E172", "E115", "E286", "E145", "E108", "E031", "E037", "E034", "E061", "E062", "E114", "E071", "E058", "E002", "E065", "E047", "E129", "E116", "E174", "E188", "E201", "E211", "E255", "E204", "E064", "E103", "E209", "E151", "E160", "E091", "E147", "E085", "E092", "E088", "E100", "E127", "E018", "E123", "E112", "E086", "E087", "E090", "E111", "E098", "E102", "E124", "E109", "E120", "E153", "E168", "E171", "E290", "E173", "E054", "E017", "E129", "E169", "E150", "E185", "E142", "E075", "E155", "E033", "E028", "E134", "E032", "E203", "E152", "E014", "E077", "E177", "E083", "E063", "E081", "E101", "E038", "E163", "E158", "E130", "E144", "E175", "E196", "E199", "E205", "E136", "E159", "E189", "E191", "E265", "E269", "E070", "E254", "E154", "E156", "E272", "E273", "E274", "E281", "E291", "E191", "E252" };   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}
