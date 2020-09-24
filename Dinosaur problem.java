
import java.util.*;

 class DinosaurQuiz {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        String str[]=new String[10];
	        int a[][]=new int[100][100];
	        int b[]=new int [100];
	       // String name = s.nextLine();                 // Reading input from STDIN
	       // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	       int n=s.nextInt();
	       int m=s.nextInt();
	       int max=s.nextInt();
	       int q=s.nextInt();
	       int j,i,flag=0;
	       for(i=0;i<n;i++)
	       {
	           str[i]=s.next();
	           for( j=0;j<m;j++)
	           {
	               a[i][j]=s.nextInt();

	           }

	       }
	       for(int k=0;k<q;k++)
	       {
	          for( i=0;i<m;i++)
	          {
	              b[i]=s.nextInt();
	          }
	          for( i=0;i<n;i++)
	          {
	              for(j=0;j<m;j++)
	              {
	                  if(a[i][j]!=b[j])
	                  {
	                      break;
	                  }
	              }
	              if(j==m)
	              {
	            	  flag=1;
	              
	              System.out.println(str[i]);
	              }
	          }
	          if(flag==0)
	          {
	        	  System.out.println("You cant fool me :P");
	          }
	          flag=0;
	        	  
	       }
	        

	        

	    
	}
	}
