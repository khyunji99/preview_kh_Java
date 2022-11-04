package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person = new Person();
		
		/* Class 클래스 이름 불러오기 */
		Class pClass = person.getClass(); // getClass 는 Object의 메서드 : Class 클래스를 반환해준다.
		System.out.println(pClass.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// forName 메서드 : ( ) 안에 있는 이름을 가진 클래스가 있으면 걔를 가져와서 출력해준다.
		// ( ) 안에 있는 이름을 가진 클래스가 없으면 이 메서드는 죽은 메서드가 된다.
		// 이것을 동적로딩 이라고 한다.
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		System.out.println("=========================");
		
		Person p = new Person();
		
		Class pClass4 = Class.forName("classex.Person");
		
		/* newInstance 는 디폴트 constructor 를 부른다. */
		Person p2 = (Person)pClass4.newInstance();
		System.out.println(p);
		System.out.println(p2);
		
	}

}
