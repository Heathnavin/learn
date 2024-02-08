package learn;

import java.util.List;
import java.util.random.RandomGenerator;

class StructuralProgramming{
    public static void main(String[] args) {
        //printNumbersWithSimpleForLoop(List.of(1,2,5,7,8,56,3434)); 
        printOnlyEvenNumbers(List.of(2,22,22,100,42,3,2,77,88,99)) ;
        }

   private static void printNumbersWithSimpleForLoop(List<Integer> numbers){
        for(int number:numbers){
            System.out.println(number);
        }
    }
    private static void printOnlyEvenNumbers(List<Integer> numbers){
        for(int number:numbers){
            if(number % 2 ==0 || number==2){
                System.out.println(number);
                
            }
        }

    }
    
}