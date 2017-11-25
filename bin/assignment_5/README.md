PPA Assignment 5

This coursework is designed to test the content from Weeks 1, 2, 3, 4, and 5.

For this week's assessment, consider the following scenario, and then complete the tasks that follow it:

We would like to create a simple simulation of an aeroplane travelling to various destinations. An aeroplane may travel to a single destination, which will cover a certain distance. It may also travel to multiple destinations over the course of a single day. Moreover, it can repeat its daily journeys over a number of days. After the aeroplane travels a certain distance, it is a requirement for it to be inspected for repairs, as a safety precaution. This process takes 7 days, during which time the aeroplane cannot  y.

1. Model this scenario based on the following requirements:
	1. The location, of a destination or an aeroplane (at any point in time), is specified 	   via Coordinates. This has an x, which is the value along the x-axis (on a map) of the 	   location, and similarly a y, for the y-axis. These are both whole numbers. (1 mark)
	2. A Destination represents the town or city that an aeroplane can travel to. It has a 	   name and coordinates. (1 mark)
	3. An Aeroplane has:
	   A name.
	   A coordinates.
	   A speed, which specifies how far the aeroplane can move in one hour in both the x-		   axis and the y-axis.
	   The totalDistancethat it has travelled. For simplicity, we will assume that the 		   distance travelled by the aeroplane is the sum of the adjustments made to its x 		   coordinate plus the adjustments made to its y coordinate, across all of the journeys 	   it has undertaken. We will not consider the true geometric distance covered.
       A repairDistance, which is the distance that the aeroplane can travel before it must 	   be taken away for 7 days to undergo repairs.
	   (1 mark)
	4. An Aeroplane can take a singleFlight which will attempt to move the aeroplane towards 	   a supplied destination. This will also calculate and return the distance travelled in 	   this single journey. The aeroplane moves towards its destination as follows:
		1. The aeroplane keeps moving towards the destination, changing its position every 	       hour, until its x coordinate matches the x coordinate of the of the destination, 	       and its y coordinate matches the y coordinate of the destination.
		2. The x coordinate of the aeroplane is adjusted as follows. It will increase or 		       decrease, depending on whether it is lower or higher, respectively, than the x 	       coordinate of the destination. The aeroplane should never travel beyond the 		       destination. Therefore, when the distance left to travel is less than the 				   aeroplane's speed, the x coordinate is increased by only the distance left to 			   travel. Otherwise, the x coordinate is increased by the speed of the aeroplane.
		3. The y coordinate of the aeroplane is adjusted in the same way as the x 				   coordinate. Therefore, the aim is to adjust the aeroplane's y coordinate to match 	       the destination's y coordinate. Again, ensure that the aeroplane never travels 	       beyond the destination.
		4. The total distance that the aeroplane has travelled (across all of its journeys) 		   must be updated with the distance of this single journey. The single journey 			   distance must also be returned.
	A visualisation of an example journey made by the aeroplane can be found here. To 		maximise your marks for this question, you must calculate the distance travelled by the 	plane programmatically, rather than mathematically. (2 marks)

2. Create a class FlightSimulation, which can be compiled and run from the command line. Use this class to do the following (in order), using the classes and methods you have created for Question 1.
	1. Create a Destination and name the variable holding it destination1. Set its 			   attributes as follows:
	   the name as Buenos Aires 
	   the x coordinate as 110 
	   the y coordinate as 135
	   (1 mark)
	2. Create a Destination and name the variable holding it destination2. Set its 			   attributes as follows:
	   the name as Muscat 
	   the x coordinate as 5 
	   the y coordinate as 30
	   (1 mark)
	3. Create a Destination and name the variable holding it destination3. Set its 	 	   	   attributes as follows:
       the name as Zanzibar 
       the x coordinate as 105 
       the y coordinate as 25
	   (1 mark)
	4. Create an Aeroplane and name the variable holding it aeroplane. Set its attributes as 	   follows:
	   the name as Spirit
	   the x coordinate as 110
	   the y coordinate as 135
	   the speed as 12
	   the totalDistanceas 0
	   the repairDistanceas 2550
	   (1 mark)
	5. Make your aeroplane simulate its journeys in a single day, by doing the following:
		1. Print the name of your aeroplane and the journey start destination (which is 	 		   destination1) and the journey end destination, which is destination2. Make your 		   aeroplane take a single flight to destination2. Then, print this single journey's 		   distance and the total distance travelled by your aeroplane. Finally, print your 		   aeroplane's current location coordinates.
		2. Print the name of your aeroplane and the journey start destination (which is now 		   destination2) and the journey end destination, which is destination3. Make your 	       aeroplane take a single flight to destination3. Then, print this single journey's 	       distance and the total distance travelled by your aeroplane. Finally, print your 		   aeroplane's current location coordinates.
		3. Print the name of your aeroplane and the journey start destination (which is now 		   destination3) and the journey end destination, which is destination2. Make your 		   aeroplane take a single  ight to destination2. Then, print this single journey's 		   distance and the total distance travelled by your aeroplane. Finally, print your 		   aeroplane's current location coordinates.
		4. Print the name of your aeroplane and the journey start destination (which is now 		   destination2) and the journey end destination, which is destination1. Make your 		   aeroplane take a single flight to destination1. Then, print this single journey's 		   distance and the total distance travelled by your aeroplane. Finally, print your 		   aeroplane's current location coordinates.
	       (1 mark)
	6. Now, repeat the aeroplane's daily schedule of four single flights (as specified in 	   the previous question) over 120 days. Guidelines for this are as follows:
	   1. Print the current day's number. Then, print the total distance travelled by the 	      aeroplane up until the start of the day.
	   2. Now make your aeroplane complete it's daily schedule of four single flights. 			  However, the daily schedule should only begin if the aeroplane has not travelled 		  so far a total distance that it needs to be sent for repairs. When the aeroplane 		  does need to go for repairs, it must not take any flights for 7 days and its total 		  distance travelled is reset to 0.
	   3. Once the 120 days have been completed, print out the number of times that the 			  aeroplane had to undergo repairs.
	(2 marks)


Assignment brief by Dr. Asad Ali.

Mark received: 12.00/12.00