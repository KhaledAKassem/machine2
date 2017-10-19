
package list_then;


public class List_then {

   
    public static void main(String[] args) {
        
        //All possible data for each Attribute
        
//        String sky[]={"sunny","cloudly","rainy"};
//        String airTemp[]={"warm","cold"};
//        String humidity[]={"normal","high"};
//        String wind[]={"strong","weak"};
//        String water[]={"warm","cool"};
//        String forecast[]={"same","change"};
        

          // Starting With More Genderal until to Specific
          
    String g[]={"?","?","?","?","?","?"};    
        // All Data 
    String data [][]={{"sunny","warm","normal","strong","warm","same","yes"},
                      {"sunny","warm","high","strong","warm","same","yes"},
                      {"rainy","cold","high","strong","warm","change","no"}
                     ,{"sunny","warm","high","strong","cool","change","yes" }
        };
     
    for(int i=0;i<data.length;i++){
        for(int j=0;j<data[i].length;j++){
            if(data[i][6].equals("no")){
                if(j!=6){
                    if(j==0){
                            if(data[i][0].equals("rainy")){
                                g[0]="sunny";
                                for(int p=0;p<g.length;p++){
                                    System.out.print(g[p]+"\t");
                                }
                                System.out.println("");
                            }                     
                            else if(data[i][0].equals("sunny")){
                                g[0]="rainy";
                        }
                    }
                    else if(j==1){
                            if(data[i][1].equals("cold")){
                                g[1]="warm";    g[0]="?";
                                  for(int p=0;p<g.length;p++){
                                    System.out.print(g[p]+"\t");
                                }
                                  System.out.println("");
                            }

                        
                    }
                    else if(j==2){
                            if(data[i][2].equals("high")){
                                g[2]="normal";
                                g[0]="?";  g[1]="?";
                                  for(int p=0;p<g.length;p++){
                                  System.out.print(g[p]+"\t");
                                }
                                  System.out.println("");
                        }
                      
                        
                    }
                    else if(j==3){
                            if(data[i][3].equals("strong")){
                                g[3]="weak";
                                g[0]="?"; g[1]="?"; g[2]="?";
                                  for(int p=0;p<g.length;p++){
                                     System.out.print(g[p]+"\t");
                                }
                                  System.out.println("");
                        }
                    }
                    else if(j==4){
                        if(data[i][4].equals("warm")){
                            g[4]="cool";
                             g[0]="?"; g[1]="?"; g[2]="?"; g[3]="?";
                               for(int p=0;p<g.length;p++){
                              System.out.print(g[p]+"\t");
                            }
                               System.out.println("");
                }
            }
                      else if(j==5){
                        if(data[i][5].equals("change")){
                            g[5]="same";
                            g[0]="?"; g[1]="?"; g[2]="?"; g[3]="?"; g[4]="?";
                              
                              
                               for(int p=0;p<g.length;p++){
                                 System.out.print(g[p]+"\t");
                            }
                               System.out.println("");
        }    }          } } }}}}