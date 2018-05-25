

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar car= new RaceCar("Bugati",5 );
		// 3. Get the RaceCar to print its position in the race.
System.out.println(car.getPositionInRace());
		// 4. Crash the RaceCar
		car.crash();
		// 5. If the car is damaged. Bring it in for a pit stop.
if (car.damaged) {
	car.pit();
}

		// 6. Help the car move into first place.
int start = car.getPositionInRace(); 
for (int i = 1; i < start; i++) {
	car.overtake();
}

	}
}
