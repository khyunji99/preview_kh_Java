package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		// 인스턴스 총 4개 //
		Student james = new Student("James", 5000); // 인스턴스 하나
		Student tomas = new Student("Tomas", 10000);  // 인스턴스 하나
		Student hyunji = new Student("hyunji", 30000); // 인스턴스 하나
	

		Bus bus100 = new Bus(100);  // 인스턴스 하나
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);  // 인스턴스 하나
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();	
		
		Taxi Yellowtaxi = new Taxi(2337);
		hyunji.takeTaxi(Yellowtaxi);
		hyunji.showInfo();
		Yellowtaxi.showInfo();
	}
}
