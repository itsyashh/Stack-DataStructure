package LearnStack;
public class LearnOops {

    public static class Person {
        int age;
        String name;
        void SayHi(){
            System.out.println(name+" (age:"+ age + ") Say hi !");
        }
    }
    public static void main(String [] args ){
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";

        Person p2 = new Person();
        p2.age = 20;
        p2.name ="B";


        p1.SayHi();
        p2.SayHi();

        Swap1(p1,p2);

        p1.SayHi();
        p2.SayHi();

    }

    public static void Swap1(Person prsn1, Person prsn2){

        prsn1 = new Person();

        int age = prsn1.age;
        prsn1.age = prsn2.age;
        prsn2.age = age;

        prsn2 =new Person();

        String name =prsn1.name;
        prsn1.name = prsn2.name;
        prsn2.name = name;
    }

}
