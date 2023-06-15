package guru.qa;

import java.lang.String;
import java.util.*;

public class Human {

    private String name;
    private int age;
    private boolean isCute;
    private Map<String, Human> friends = new HashMap<>();

    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    public void addFriend(Set<Human> friends) {
        for (Human friend : friends) {
            this.friends.put(friend.name, friend);
        }
    }

    public int increaseAge() {
        this.age++;
        return age;
    }

    public void printAllFriends() {
        for (Human friend : friends.values()) {
            System.out.println(friend);
        }
    }

    public void printFriendByNameIfPresent(String name) {
        Human human = friends.get(name);
        if (human != null) {
            System.out.println(human);
            return;
        }


//        for (Human friend : friends) {
//            if (friend.name.equals(name)) {
//                System.out.println(friend);
//                return;
//            }
//        }

//        int index = 0;
//        while (index < friends.size()) {
//            Human friend = friends.get(index);
//            if (friend.name.equals(name)) {
//                System.out.println(friend);
//                return;
//            }
//            index++;
//        }
//
//
//        for (int i = 0; i < friends.size(); i++) {
//            Human friend = friends.get(i);
//            if (friend.name.equals(name)) {
//                System.out.println(friend);
//                return;
//            }
//        }

        System.out.println("not found!");
    }

    @Override
    public String toString() {
        return name + ", age: " + age + ", is cute: " + isCute + ", and friend: " + friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && isCute == human.isCute && Objects.equals(name, human.name) && Objects.equals(friends, human.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isCute, friends);
    }
}
