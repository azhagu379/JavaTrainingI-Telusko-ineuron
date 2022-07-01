public class INeuron {
    public static void main(String[] args) {
        
         int height =5;
        int width =5;
        int i,j;
        
        for(i=0;i<height;i++)
        {   // i pattern print
            for(j=0;j<width;j++)
            {
                if(i==0 || i==4)
                    System.out.printf("*");
                
                else if(j==2)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
            // N pattern print
            for(j=0;j<width;j++)
            {
                if(j==4 || j==0)
                    System.out.printf("*");
                
                else if((j==1 && i==1) ||(j==2 && i==2) ||(j==3 && i==3)  )
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
            // E pattern print
            for(j=0;j<width;j++)
            {
                if(( i==4 || i==0 || i==2))
                    System.out.printf("*");
                
                else if(j==0)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
            // U pattern print
            for(j=0;j<width;j++)
            {
                if(j==0 || j==4)
                    System.out.printf("*");
                else if(i==4)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
            
            // R pattern print
            for(j=0;j<width;j++)
            {
                if(j==0 || i==0 ||i==2)
                    System.out.printf("*");
                else if((j==4 && i==1))
                    System.out.printf("*");
                else if((j==2 && i==3) || (j==4 && i==4))
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
            
            // o pattern print
            for(j=0;j<width;j++)
            {
                if(j==0 ||j==4 ||i==0 || i==4)
                    System.out.printf("*");                
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");

            // N pattern print
            for(j=0;j<width;j++)
            {
                if(j==4 || j==0)
                    System.out.printf("*");
                
                else if((j==1 && i==1) ||(j==2 && i==2) ||(j==3 && i==3)  )
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");

            System.out.printf("\n");
        }

    }
    
}
