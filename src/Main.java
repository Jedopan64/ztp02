import java.lang.reflect.Method;
import java.util.Date;

public class Main {

    public static void main(String args[]) {

        try {
            //Tworzenie obiektu generycznego przy pomocy refleksji
            Class<?> cl = Class.forName("Pair");
            Method m = cl.getMethod("testMethod");
            m.invoke(cl.newInstance());

        } catch (Throwable e) {
            System.err.println(e);
        }
        //Tworzenie tablicy przy pomocy refleksji
        GenericArray<Integer> intArray = new GenericArray<>(Integer.class, 4);
        intArray.add(1);
        intArray.add(2);
        System.out.println(intArray);

        GenericArray<String> stringArray = new GenericArray<>(String.class, 3);
        stringArray.add("fff");
        stringArray.add("aa");
        System.out.println(stringArray);


        //Metoda clone
        Pair<Integer> pair1 = new Pair<>(1, 2);
        Pair<Double> pairDouble1 = new Pair<>(2.5, 3.7);
        try {
            Pair<Integer> pair2 = (Pair<Integer>) pair1.clone();
            System.out.println("\n");
            System.out.println("Orginal: "+pair1.toString());
            System.out.println("Klon: "+pair2.toString());

            pair1.setT1(100);
            System.out.println("\npair1.setT1(100)");
            System.out.println("Orginal: "+pair1.toString());
            System.out.println("Klon: "+pair2.toString());

            pair2.setT2(200);
            System.out.println("\npair2.setT2(200)");
            System.out.println("Orginal: "+pair1.toString());
            System.out.println("Klon: "+pair2.toString());

            Pair<Double> pairDouble2 = (Pair<Double>) pairDouble1.clone();
            System.out.println("\n");
            System.out.println("Orginal: "+pairDouble1.toString());
            System.out.println("Klon: "+pairDouble2.toString());

            pairDouble1.setT1(100.212);
            System.out.println("\n");
            System.out.println("Orginal: "+pairDouble1.toString());
            System.out.println("Klon: "+pairDouble2.toString());

            pairDouble2.setT2(330.21);
            System.out.println("\n");
            System.out.println("Orginal: "+pairDouble1.toString());
            System.out.println("Klon: "+pairDouble2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
