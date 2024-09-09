package com.example.higher_lower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GameManager {
    static public int quizType;
    static public int currentQuiz;

     static public Info[] vehicles = new Info[]
    {
            new Info("Vehiculos", "Aston Martin", 1500, R.drawable.astonmartin),
            new Info("Vehiculos", "Audi", 1200,R.drawable.audi),
            new Info("Vehiculos", "BMW", 1300,R.drawable.bmw),
            new Info("Vehiculos", "Ferrari", 1400,R.drawable.ferrari),
            new Info("Vehiculos", "Chevrolet", 1100,R.drawable.chevrolet),
            new Info("Vehiculos", "Fiat", 1000,R.drawable.fiat),
            new Info("Vehiculos", "Ford", 1250,R.drawable.ford),
            new Info("Vehiculos", "Honda", 1240,R.drawable.honda),
            new Info("Vehiculos", "Hyundai", 1230,R.drawable.hyundai),
            new Info("Vehiculos", "Kia", 1220,R.drawable.kia),
            new Info("Vehiculos", "Mercedes", 1210,R.drawable.mercedes),
            new Info("Vehiculos", "Nissan", 1270,R.drawable.nissan),
            new Info("Vehiculos", "Toyota", 1290,R.drawable.toyota),
            new Info("Vehiculos", "Volkswagen", 1280,R.drawable.volkswagen),
            new Info("Vehiculos", "Porsche", 1350,R.drawable.porsche),
    };
    static public Info[] animals = new Info[]{
            new Info("Animales", "Perro", 2800,R.drawable.perro),
            new Info("Animales", "Gato", 2900,R.drawable.gato),
            new Info("Animales", "Leon", 2700,R.drawable.leon),
            new Info("Animales", "Elefante", 2100,R.drawable.elefante),
            new Info("Animales", "Oso", 2000,R.drawable.oso),
            new Info("Animales", "Ballena", 2200,R.drawable.ballena),
            new Info("Animales", "Cebra", 2300,R.drawable.cebra),
            new Info("Animales", "Delfin", 2400,R.drawable.delfin),
            new Info("Animales", "Girafa", 2500,R.drawable.girafa),
            new Info("Animales", "Halcon", 2600,R.drawable.halcon),
            new Info("Animales", "Mono", 2550,R.drawable.mono),
            new Info("Animales", "Panda", 2750,R.drawable.panda),
            new Info("Animales", "Serpiente", 2650,R.drawable.serpiente),
            new Info("Animales", "Tiburon", 2850,R.drawable.tiburon),
            new Info("Animales", "Tigre", 2875,R.drawable.tigre),
        };
    static public Info[] sports = new Info[]{
            new Info("Deportes", "Baloncesto", 3800,R.drawable.basquet),
            new Info("Deportes", "Futbol", 3900, R.drawable.futbol),
            new Info("Deportes", "Tenis", 3100, R.drawable.tenis),
            new Info("Deportes", "Natacion", 3200,R.drawable.natacion),
            new Info("Deportes", "Balonmano", 3700,R.drawable.balonmano),
            new Info("Deportes", "Atletismo", 3600,R.drawable.atletismo),
            new Info("Deportes", "Beisbol", 3500,R.drawable.beisbol),
            new Info("Deportes", "Boxeo", 3400,R.drawable.box),
            new Info("Deportes", "Ciclismo", 3300,R.drawable.ciclismo),
            new Info("Deportes", "Escalada", 3200,R.drawable.escalada),
            new Info("Deportes", "Golf", 3150,R.drawable.golf),
            new Info("Deportes", "Hockey", 3250,R.drawable.hokey),
            new Info("Deportes", "Rugby", 3350,R.drawable.rugby),
            new Info("Deportes", "Voleibol", 3550,R.drawable.volei),
            new Info("Deportes", "Surf", 3450,R.drawable.surf),
        };

    static public Info[] GetNewInfo(int id){
        currentQuiz=0;
        ArrayList<Info> newList;
        switch (id){
            case 0:
                newList = new ArrayList<>(Arrays.asList(vehicles));
                Collections.shuffle(newList);
                return newList.toArray(new Info[0]);
            case 1:
                newList = new ArrayList<>(Arrays.asList(animals));
                Collections.shuffle(newList);
                return newList.toArray(new Info[0]);
            case 2:
                newList = new ArrayList<>(Arrays.asList(sports));
                Collections.shuffle(newList);
                return newList.toArray(new Info[0]);
            case 3:
                int totalPerArray=3;
                ArrayList<Info> randomList=new ArrayList<>();
                for (int i = 0; i < totalPerArray; i++) {
                    Random random = new Random();
                    int randomValue= random.nextInt(vehicles.length);
                    while (randomList.contains(vehicles[randomValue])==true){
                        randomValue= random.nextInt(vehicles.length);
                    }
                    randomList.add(vehicles[randomValue]);
                }
                for (int i = 0; i < totalPerArray; i++) {
                    Random random = new Random();
                    int randomValue= random.nextInt(animals.length);
                    while (randomList.contains(animals[randomValue])==true){
                        randomValue= random.nextInt(animals.length);
                    }
                    randomList.add(animals[randomValue]);
                }
                for (int i = 0; i < totalPerArray; i++) {
                    Random random = new Random();
                    int randomValue= random.nextInt(sports.length);
                    while (randomList.contains(sports[randomValue])==true){
                        randomValue= random.nextInt(sports.length);
                    }
                    randomList.add(sports[randomValue]);
                }
                Collections.shuffle(randomList);
                return randomList.toArray(new Info[0]);
        }
        return null;
    }

}

