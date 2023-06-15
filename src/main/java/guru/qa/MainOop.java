package guru.qa;

import java.util.List;
import java.util.Set;

public class MainOop {

    public static void main(String[] args) {
        int realAge = 34;

        Human dima = new Human("Dmitrii", realAge, true);
        Human vasya = new Human("Vasiliy", 25, true);
        Human petr = new Human("Petr", 45, true);
        Human valera = new Human("Valera", 45, true);
        Human valentin = new Human("Valemtin", 45, true);


        Set<Human> friendsAsList = Set.of(vasya, petr);
        Set<Human> extraFriends = Set.of(valera, valentin);



        dima.addFriend(friendsAsList);
        dima.addFriend(extraFriends);

        dima.printAllFriends();


        dima.printFriendByNameIfPresent("Ivan"); // not found
        dima.printFriendByNameIfPresent("Vasiliy");
        dima.printFriendByNameIfPresent("Valemtin");

//        int increased = dima.increaseAge();
//
//        System.out.println("Actual age: " + increased);
//
//        System.out.println(dima.toString());
    }
}
