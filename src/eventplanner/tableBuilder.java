package eventplanner;
/**
 *
 * @author Donovan Cummins - (Team Horizon)
 */
public class tableBuilder {
    
    public tableBuilder(){
        
    }
    
    public static String rowBuilder(int i, String x){
        
        int len = x.length();
        
       if(i == 1){
            
            if (len > 10){                    
                    x = x.substring(0,7) + "..." + "    "; //string is to big, cutting it down. -DC
                }else{                
                   len = 10 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            
        }
        
        if(i == 2){
            
            if (len > 10){                    
                    x = x.substring(0,7) + "..." + "    "; //string is to big, cutting it down. -DC
                }else{                
                   len = 10 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            
        }
        
        if(i == 3){
            
            if (len > 10){                    
                    x = x.substring(0,7) + "..." + "    "; //string is to big, cutting it down. -DC
                }else{                
                   len = 10 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            
        }
        
        if(i == 4){
            
            if (len > 10){                    
                    x = x.substring(0,7) + "..." + "    "; //string is to big, cutting it down. -DC
                }else{                
                   len = 10 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            
        }
        
        if(i == 5){
            
            if (len > 10){                    
                    x = x.substring(0,7) + "..." + "    "; //string is to big, cutting it down. -DC
                }else{                
                   len = 10 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            
        }
        
        /*
        switch (i){
           
            case 1:
                
                if (len > 5){                    
                    x = x.substring(0,5) + "111"; //string is to big, cutting it down. -DC
                }else{                
                   len = 50 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len + 2; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            case 2:
                
                if (len > 5){                    
                    x = x.substring(0,5) + "222"; //string is to big, cutting it down. -DC
                }else{                
                   len = 50 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len + 2; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            case 3:
                
                if (len > 5){                    
                    x = x.substring(0,5) + "333"; //string is to big, cutting it down. -DC
                }else{                
                   len = 50 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len + 2; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }              
                
            case 4:
                
                if (len > 5){                    
                    x = x.substring(0,5) + "444"; //string is to big, cutting it down. -DC
                }else{                
                   len = 50 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len + 2; j++){
                      spc = spc + "_";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
            case 5:
                
                if (len > 15){                    
                    x = x.substring(0,5) + "..."; //string is to big, cutting it down. -DC
                }else{                
                   len = 15 - len; //String is not big enough, adding spaces. -DC
                   int j = 0;
                   String spc = " ";
                   for(j = 0; j <= len + 2; j++){
                      spc = spc + " ";
                    }
                   x = x + spc;            
                //x = String.format("%-5s", x);  
                }
        }
        */
        
        return x;
    }
    
}
