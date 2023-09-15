package com.example.day4;

public class Course
{
    String name,code;
    int creditHours;

    Course ()
    {}

    int getCreditHours(int x)
    {
        creditHours = x ;
        return creditHours;
    }

    String getGrade(double g)
    {
        if (100>=g || g<80)
            return"Excellent" ;
        else if (80>=g || g<70)
            return  "V.good";
        else if(70>=g || g<60)
            return "good";
        else if ( 60>=g || g<50)
            return "pass";
     else return "F" ;
    }

}
