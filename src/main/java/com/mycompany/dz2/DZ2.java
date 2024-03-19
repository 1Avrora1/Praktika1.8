/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DZ2 {

    public static void main(String[] args) {
        System.out.println("Практическое задание - 1.8, Студент - Стрыгин Никита Владиславович, Группа - РИБО-03-22, Вариант - 1");
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Honda Torneo","O461EA|77", 2000));
        carsList.add(new Car("Nissan X-Trail","X456AM|77", 2012));
        carsList.add(new Car("Chevrolet Aveo","K934AP|77", 2013));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: 1 - Добавить новый автомобиль в список, 2 - Удалить автомобиль из списка по Госномеру, 3 - Очистить список");
        int vybor = scanner.nextInt();
        scanner.nextLine();
        
        if (vybor == 1){
            System.out.println("Введите марку автомобиля: ");
            String Brand = scanner.nextLine();
            System.out.println("Введите год выпуска автомобиля: ");
            int Year = 0;
            String VvodGoda = scanner.nextLine();
            String proverka = "[0-9]+";
            if (VvodGoda.matches(proverka)==true){
                int ProverkaVvodGoda = Integer.parseInt(VvodGoda);
                if (ProverkaVvodGoda > 1769 && ProverkaVvodGoda < 2025){
                    Year = ProverkaVvodGoda;
                }
                else{
                System.out.println("Неверный год");
                }
            }
           
            else{
                System.out.println("Неверный формат года");
            } 
            System.out.println("Введите госномер автомобиля (в формате БЦЦЦББ|регион): ");
            String RegNumber = scanner.nextLine();
            boolean PovtorNomera = false;
            for (Car newCar : carsList){
                if(newCar.RegNumber.equals(RegNumber)){
                    PovtorNomera=true;
                    break; 
                }
            }
            if(PovtorNomera==true){
                System.out.println("Автомобиль с таким госномером уже есть в списке");
            }
            else{
                carsList.add(new Car(Brand, RegNumber, Year));
            }
        }
        if (vybor == 2){
            System.out.println("Введите госномер автомобиля, для удаления из списка (в формате БЦЦЦББ|регион): ");
            String removeNumber = scanner.nextLine();
            for (Car newCar : carsList){
                if(newCar.RegNumber.equals(removeNumber)){
                    Iterator<Car> carIterator = carsList.iterator();
                    while (carIterator.hasNext()){
                        Car nextCar = carIterator.next();
                        if (nextCar.RegNumber.equals(removeNumber)){
                            carIterator.remove();
                        }
                    }
                }
                else{
                    System.out.println("Автомобиля с таким госномером нет, его не удалить");
                }
            }
        }
        if (vybor == 3){
            carsList.clear();
        }
        System.out.println("Текущий список автомобилей: ");
        for (Car car : carsList) {
            System.out.println("Марка автомобиля: " + car.Brand + ", Год выпуска: " + car.Year + ", Госномер: " + car.RegNumber);
        }
    }
}
