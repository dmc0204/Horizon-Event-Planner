package eventplanner;
/**
 *
 * @author Donovan Cummins - (Team Horizon)
 */
public class tableBuilder {
    
    public tableBuilder(){
        
    }
    
    public static String rowBuilder(int i, String x){
        
        switch (i){
            case 1:
                if (x.length() >= 50){
                    x = x.substring(0, 45) + "... "; //string is to big, cutting it down. -DC
                }else{
                    int s = 50 - x.length(); //String is not big enough, adding spaces. -DC
                    int j = 0;
                    String spc = " ";
                    for(j = 0; j <= s; j++){
                        spc = spc + " ";
                    }
                    x = x + spc;
                }
            case 2:
                if (x.length() >= 50){
                    x = x.substring(0, 45) + "... "; //string is to big, cutting it down. -DC
                }else{
                    int s = 50 - x.length(); //String is not big enough, adding spaces. -DC
                    int j = 0;
                    String spc = " ";
                    for(j = 0; j <= s; j++){
                        spc = spc + " ";
                    }
                    x = x + spc;
                }
            case 3:
                if (x.length() >= 50){
                    x = x.substring(0, 45) + "... "; //string is to big, cutting it down. -DC
                }else{
                    int s = 50 - x.length(); //String is not big enough, adding spaces. -DC
                    int j = 0;
                    String spc = " ";
                    for(j = 0; j <= s; j++){
                        spc = spc + " ";
                    }
                    x = x + spc;
                }
            case 4:
                if (x.length() >= 30){
                    x = x.substring(0, 25) + "... "; //string is to big, cutting it down. -DC
                }else{
                    int s = 30 - x.length(); //String is not big enough, adding spaces. -DC
                    int j = 0;
                    String spc = " ";
                    for(j = 0; j <= s; j++){
                        spc = spc + " ";
                    }
                    x = x + spc;
                }
            case 5:
                if (x.length() > 20){
                    x = x.substring(0, 15) + "... "; //string is to big, cutting it down. -DC
                }else{
                    int s = 20 - x.length(); //String is not big enough, adding spaces. -DC
                    int j = 0;
                    String spc = " ";
                    for(j = 0; j <= s; j++){
                        spc = spc + " ";
                    }
                    x = x + spc;
                }
        }
        
        return x;
    }
    
}
