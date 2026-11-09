Bug Log

Bug	Line	Type	    What was wrong	                                 How I fixed it
1	  35	  Runtime	  The program did not read a new zone inside 
                    the while loop.	                                 Added zone = input.nextInt();
2	  51	  Logic	    Missing break after case 1.	                     Added break;
3	  63	  Logic	    Integer division caused 3 / 4 to equal 0.	       Changed to 3.0 / 4.0.
4	  64	  Syntax	  Missing semicolon after the return statement.	   Added ;
5	  70	  Logic	    Exactly $50 did not qualify for free shipping.	 Changed > to >=.
