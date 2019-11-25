import java.util.Scanner;

public class Polling {
	
	public static void main (String[] args)
	
	{
		String[] topics = {"Food","Beach","Finances","Travel", "Skincare"}; 
		
		int [][] responses = new int [topics.length][10];
		
		Scanner scnr = new Scanner(System.in);
		
		

        int k;   int j;

        int num_persons;  int num_ratings;

      

        for( k=0; k<responses.length;k++)

        {

               responses[k] = new int[10];

               for( j=0; j<responses[k].length;j++)

               responses[k][j] = 0;

        }

       

        System.out.print("Enter the number of persons participating in the rating: ");

        num_persons = scnr.nextInt();

       
        for( k = 0; k < num_persons; k++)

        {

               System.out.println("Rate each topic below on a scale of 1-10 ");

               for(j =0; j < topics.length; j++)

               {

                      System.out.print("Enter rating for "+topics[j]+" : ");

                      num_ratings = scnr.nextInt();


                      while(num_ratings < 1 || num_ratings > 10)

                      {

                            System.out.println("Rating should be between [1,10]");

                            System.out.print("Enter your rating for "+topics[j]+" : ");

                            num_ratings = scnr.nextInt();

                      }

                     

                      responses[j][num_ratings-1]++;

               }

        }

       

        int avg_rating[] = new int[topics.length];

        String highest_PointIssue="" , lowest_PointIssue="" ;

        int highest_PointTotal = 0 , lowest_PointTotal= 0;

       


        for(k=0;k <responses.length;k++)

        {

               avg_rating[k] = 0;

               for(j=0;j<responses[k].length;j++)

               avg_rating[k] += (responses[k][j]*(j+1));

              

               if(k == 0) 

               {
            	      highest_PointIssue = topics[k];

                      lowest_PointIssue = topics[k];
                   
                      highest_PointTotal = avg_rating[k];

                      lowest_PointTotal= avg_rating[k];

                    

               }else

               {

                      if(avg_rating[k] > highest_PointTotal)

                      {

                            highest_PointIssue = topics[k];

                            highest_PointTotal = avg_rating[k];

                      }

                     

                      if(avg_rating[k] < lowest_PointTotal)

                      {

                            lowest_PointIssue = topics[k];

                            lowest_PointTotal= avg_rating[k];

                      }

               }

              

               avg_rating[k] = avg_rating[k]/num_persons;

        }

       

       

        System.out.printf("\n%-20s","");

        for(k=0;k<10;k++)
             
               System.out.printf("%-10d",(k+1));

        System.out.printf("%20s","Average Rating");

        System.out.println();
       
        
        System.out.println("TOPICS");
        for(k=0;k<responses.length;k++)

        {

               System.out.printf("\n%-20s",topics[k]);

               for(j=0;j<responses[k].length;j++)

                      System.out.printf("%-10d",responses[k][j]);

               System.out.printf("%20d",avg_rating[k]);

        }

       

        
        System.out.print("\n");
        System.out.println("\nHighest Point total : "+highest_PointTotal+" Issue : "+highest_PointIssue);

        System.out.println("Lowest Point total : "+lowest_PointTotal+" Issue : "+lowest_PointIssue);

       

        scnr.close();

       

  }


	
 
   }


          

          

         
