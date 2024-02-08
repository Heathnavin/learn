package learn;

import java.util.List;

class FunctionalProgramming{
    public static void main(String[] args){
       // printNumbersWithStream(List.of(1,2,5,7,8,56,3434)); 
        //printNumbersWithOnlyEven(List.of(1,2,5,6,8,100,44,55,77,88)); 
       
   
    }
   private static void printNumbersWithStream(List<Integer> numbers){
        numbers.stream().forEach(System.out::println);
}
    private static void printNumbersWithOnlyEven(List<Integer> numbers){
        numbers.stream().filter(number -> number % 2 ==0 )
        .forEach(System.out::println);
    }
    
}