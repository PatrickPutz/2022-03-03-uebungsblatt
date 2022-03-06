package org.campus02.arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        int[] testArray = {8,5,1,9,0,4};

        System.out.println("<<< Initial Array >>>");
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("<<< Sorted Array >>>");
        arrangeOrder(testArray);
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
        System.out.println("");
        System.out.println("");

        Car vw1 = new Car("VW 1", 1998, 300000);
        Car vw2 = new Car("VW 2", 1997, 400000);
        Car bmw1 = new Car("BMW 1", 1996, 100000);
        Car bmw2 = new Car("BMW 2", 1995, 80000);

        Car[] carArray = {vw1, vw2, bmw1, bmw2};

        System.out.println("<<< Initial Array >>>");
        for(int i = 0; i < carArray.length; i++){
            System.out.println(carArray[i].toString());
        }
        System.out.println("");
        System.out.println("");

        System.out.println("<<< Sorted Array >>>");
        arrangeOrder(carArray);
        for(int i = 0; i < carArray.length; i++){
            System.out.println(carArray[i].toString());
        }
        System.out.println("");
        System.out.println("");
    }

    public static void arrangeOrder(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){
                int lower = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = lower;
                arrangeOrder(numbers);
            }
        }
    }

    public static void arrangeOrder(Car[] cars){
        for(int i = 0; i < cars.length - 1; i++){
            if(cars[i].getProductionYear() > cars[i + 1].getProductionYear()){
                Car younger = cars[i + 1];
                cars[i + 1] = cars[i];
                cars[i] = younger;
                arrangeOrder(cars);
            }
        }
    }
}
