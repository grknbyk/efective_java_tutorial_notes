package _9_equals_and_hashcode;

import java.util.HashMap;
import java.util.Map;

/*
Bu örnekte, equals metodu iki Person nesnesinin eşit olup olmadığını kontrol etmek için 
name ve age özelliklerini kullanıyor. Eğer bu iki özellik de eşitse, Person nesneleri de eşit kabul edilir.

hashCode metodu ise nesnenin hash kodunu döndürmek için kullanılır. Eğer iki nesne eşitse, bu iki nesnenin 
hash kodları da eşit olmalıdır. Ancak tersi her zaman doğru değildir; yani iki nesnenin hash kodları eşitse, 
bu iki nesnenin de eşit olması zorunlu değildir.

NOT: == operatörü primitive tipler için değerleri karşılaştırırken, referans tipler için referansları karşılaştırır.
 */

public class Test {
    public static void main(String[] args) {

        // Part 1 //////////////////////////////////////////////////////////////////

        //integer type
        System.out.println(10 == 10); // true
        System.out.println(10 == 20); // false
        //char type
        System.out.println('a' == 'a'); // true
        System.out.println('a' == 'b'); // false
        System.out.println('a' == 97); // true, because 97 is the ASCII value of 'a'
        System.out.println('a' == 97.0); // true, because 97.0 is the ASCII value of 'a'
        //boolean type
        System.out.println(true == true); // true

        System.out.println((int) 'a'); // cast char to int. prints 97, which is the ASCII value of 'a'
        System.out.println('a' == 97); // char is automatically promoted to int. prints true
        System.out.println('a' + 1); // char is automatically promoted to int. prints 98
        System.out.println((char) ('a' + 1)); // cast int to char. prints 'b'

        // Part 2 //////////////////////////////////////////////////////////////////

        // Person1 has not overridden equals and hashCode methods
        // try to compare two Person1 objects 
        // default equals method compares only references
        // which means it will return true only if two references point to the same object
        // in the example below, person1 and person2 are two different referenced objects
        // Person1 person1 = new Person1("Ali", 25);
        // Person1 person2 = new Person1("Ali", 25);
        // System.out.println(person1 == person2); // false,
        // System.out.println(person1.equals(person2)); // false
        
        // // Part 3 //////////////////////////////////////////////////////////////////
        // // Person2 has overridden equals and hashCode methods, you can inspect the class
        // // try to compare two Person2 objects
        // // you should look at the overridden equals method in Person2 class
        // Person2 person3 = new Person2("Ali", 25);
        // Person2 person4 = new Person2("Ali", 25);
        // System.out.println(person3 == person4); // false, because they are two different referenced objects
        // System.out.println(person3.equals(person4)); // true, because they are equal according to the overridden equals method

        // Part 4 //////////////////////////////////////////////////////////////////
        // Map<Person1, String> map1 = new HashMap<>();
        // Person1 person5 = new Person1("Ali", 25);
        // String str1 = "first";
        // map1.put(person5, str1);

        // System.out.println(map1.get(person5)); // "first"
        // System.out.println(map1.get(new Person2("Ali", 25))); // null, because
        // the default hashCode method in Person1 class returns different hash codes
        // as a result, they are considered as different keys in the map
        // then, we cannot reach the value by using the key



        // Part 5 //////////////////////////////////////////////////////////////////
        // Map<Person2, String> map2 = new HashMap<>();
        // Person2 person6 = new Person2("Ali", 25);
        // String str2 = "first";
        // map2.put(person6, str2);

        // System.out.println(map2.get(person6)); // "first"
        // System.out.println(map2.get(new Person2("Ali", 25))); // "first", because
        // the overridden hashCode method in Person2 
        // class returns the same hash code for two Person2 objects,
        // so they are considered as the same key in the map
        // then, we can reach the value by using the key


        

    }

}
