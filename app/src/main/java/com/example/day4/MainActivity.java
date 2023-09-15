package com.example.day4;

import static java.sql.DriverManager.println;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        println("this is my main function");

        int newAge ;
        String newName ;

        Person firstPerson = new Person() ;
        firstPerson.name = "Ahmed" ;
        firstPerson.age = 42 ;

        newAge = firstPerson.getAge(40) ;
        newName = firstPerson.getName("Mohamed");

        println("Let me introduce" + newName + "he is" +newAge +"years old");

        Person me = new Person();
        me.name = "Mayar";
        me.age = 30 ;
        println("I am" + me.name + "I am" + me.age + "years old");

      Course c1 = new Course();
      c1 .name = "OOP";
      c1.code = "CS012";
      c1.creditHours = 4;

      println(newName +" Took" + c1.name + "for about " + c1.creditHours + "/n he had a "+
                         c1.getGrade(80));

    }
}
