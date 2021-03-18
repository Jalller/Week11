import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	Dog myDog = new Dog("Fido",true);
	myDog.feedDog();
	myDog.setOwner("Bo");
	String[] myDogsOffsprings = new String[myDog.getNumberOfOffsprings()];
		myDogsOffsprings[0] = "Plet";
		myDogsOffsprings[1] = "Vuffi";
	myDog.setOffspring(myDogsOffsprings);


	String[] myOff = myDog.getOffspring();
	for (String str : myOff) {
        System.out.println(str);
    }
        System.out.println(Arrays.toString(myOff));
        System.out.println("My dog is owned by: " + myDog.getOwner());
        String resString = myDog.feedDog();
        System.out.println(resString);
		System.out.println("My dog is: " + myDog.getName() + " it is owned by: " + myDog.getOwner() + " my dogs offsprings are: " +  Arrays.toString(myOff));
    }
}
