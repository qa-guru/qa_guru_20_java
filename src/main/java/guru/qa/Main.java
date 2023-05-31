package guru.qa;

import java.time.Clock;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Примитивные типы данных
    // Целочисенные типы данных
    byte varByte = 1;  // -128  +127     (-) 2^8(-1)
    short varShort = 1; // -32768  +32767 (-) 2^16(-1)
    int varInt = 10; //  (-) 2^32(-1)
    long varLong = 10; // (-) 2^64(-1)
    // Числа с плавающей точкой
    float varFloat = 1.09F; //32b
    double varDouble = 1.09; //64b
    // Символьный
    char varChar = '0';
    // Логический
    boolean varBoolean = false;

    Clock varClock = new Clock();
    String word = "dima";

    // Операторы
    // Присвоение =
    // Арифметические + - * / %, ++ , --
//    System.out.println(6 / 3);
//    System.out.println(6 % 3);
    // Операторы сравнения  ==,  !=, >, <, >=, <=

    System.out.println(--varInt);
    // Логические операторы &, |, &&, ||, !

    if (word != null && !(word.equals("dima"))) {
      System.out.println("PROFIT!!!!");
    }
    System.out.println((10 > 9) || (word.equals("Hello world!")));

    // Оператор instanceof
    if (varClock instanceof Clock) {

    }
    // Тернарный оператор
    // если word.equals("dima") то присвоить PROFIT иначе присвоить SAD(

    String result = word.equals("dima")
        ? "PROFIT"
        : "SAD";

    if (word.equals("dima")) {
      result = "PROFIT";
    } else if (word.equals("valera")) {
      result = "PROFIT!!!!!!";
    } else {
      result = "sad";
    }

    switch (word) {
      case "dima": {
        result = "PROFIT";
        break;
      }
      case "valera": {
        result = "PROFIT!!!!!!";
        break;
      }
      default: {
        result = "sad";
      }
    }

    varInt = varInt + 3;

  }

  public int sum(int a, int b) {
    return a + b;
  }

  static class Clock {
    int hours = 23;
    int min = 42;
    int sec = 45;

    public void printTime() {
      System.out.println("Current time is: "
          + hours + " "
          + min + " "
          + sec);
    }
  }
}