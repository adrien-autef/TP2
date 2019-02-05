package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        String result;
        if(i %3== 0 && i %5== 0){
            System.out.println("FizzBuzz");
            result="FizzBuzz";
        }
        else if(i %3 == 0) {
            System.out.println("Fizz);");
            result ="Fizz";
        }
        else if(i %5 == 0){
            System.out.println("Buzz");
            result="Buzz";
        }
        else{
            System.out.println(i);
            result=String.valueOf(i);
        }
        return result;
    }

    public String[] computeList(int i) {
        String[] result = new String[i];
        int c;
        for (c=0;c<i;c++){
            result[c]= getValue(c+1);
        }
        return result;
    }

}