class HomeWork1_12 {

	public static void main(String[] args) {
		/*(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
		 * Write a program that displays the average speed in kilometers per hour. 
		 * (Note that 1 mile is 1.6 kilometers)*/
		System.out.println("24 miles in 1 Hour 40 Minutes and 35 Seconds");

		//Stating the conversion of miles to kilometers
		System.out.println("Kilometers = 24 miles * 1.6");

		//The Conversion of miles to kilometers
		System.out.println(24*1.6 + " kilometers");

		//How long it took to go the distance in hours
		System.out.print(1 + ((40.0 + (35.0 / 60.0)) / 60.0));
		System.out.println(" Hours");

		//The division of kilometers by hours
		System.out.print((24*1.6)/(1 + ((40.0 + (35.0 / 60.0)) / 60.0)));
		System.out.println(" KPH");

		System.out.println("Same program, but using doubles VVV");

                //This is the same program, but I used doubles
                double miles = 24.0;
                double seconds = 35.0;
                double minutes = 40.0;
                double hours = 1.0;

		//The conversion of miles to kilometers
                double kilometers = miles * 1.6;

		//The conversion of seconds to minutes
                double secondsToMinutes = seconds/60.0;

		//The conversion of minutes to hours
                double minutesToHours = (minutes + secondsToMinutes)/60.0;

		//The total hours it took
                double totalHours = hours + minutesToHours;

                System.out.println(miles +" miles in " + hours + " Hour " + minutes + " Minutes and " + seconds +" Seconds");

                //Stating the conversion of miles to kilometers
                System.out.println("Kilometers = " + miles + " miles * 1.6");

                //Stating the kilometers
                System.out.println(kilometers + " kilometers");

                //How long it took to go the distance in hours
                System.out.println(totalHours + " Hours");

                //The division of kilometers by hours
                System.out.println(kilometers/totalHours + " KPH");
        }
}
