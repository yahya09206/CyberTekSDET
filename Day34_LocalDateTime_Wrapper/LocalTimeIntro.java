import java.time.LocalTime;

public class LocalTimeIntro {
	public static void main(String[] args){
		//time right now
		LocalTime now = LocalTime.now();
		System.out.println(now);

		//timer
		LocalTime breakTime = now.plusMinutes(15);
		System.out.println(breakTime);

		LocalTime quizDue = breakTime.plusMinutes(20);
		System.out.println(quizDue);



		
	}
}