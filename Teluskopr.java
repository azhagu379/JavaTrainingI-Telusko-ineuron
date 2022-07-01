
public class Teluskopr {
    public static void main(String[] args) {
        
        int height =5;
        int width =5;
        int i,j;
        
        for(i=0;i<height;i++)
        {
            for(j=0;j<width;j++)
            {
                if((i==0))
                    System.out.printf("*");
                
                else if(j==2)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
            for(j=0;j<width;j++)
            {
                if((i==0 ||i==2 || i==4))
                    System.out.printf("*");
                
                else if(j==0)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
            for(j=0;j<width;j++)
            {
                if(( i==4))
                    System.out.printf("*");
                
                else if(j==0)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");
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

            for(j=0;j<width;j++)
            {
                if((i==0||i==height/2 ||i ==height-1))
                    System.out.printf("*");
                else if(i< height /2 && j==0)
                    System.out.printf("*");
                else if(i> height/2 && j==height-1)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");

            for(j=0;j<width;j++)
            {
                if(j==0)
                    System.out.printf("*");
                else if(i==2 && j==2)
                    System.out.printf("*");
                else if(i==1 && j==3)
                    System.out.printf("*");
                else if(i==0 && j==4)
                    System.out.printf("*");
                else if(i==3 && j==3)
                    System.out.printf("*");
                else if(i==4 && j==4)
                    System.out.printf("*");
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");

            

            for(j=0;j<width;j++)
            {
                if(j==0 ||j==4 ||i==0 || i==4)
                    System.out.printf("*");                
                else 
                    System.out.printf(" ");
            }
            System.out.printf(" ");

            System.out.printf("\n");
        }

    }
    
}
