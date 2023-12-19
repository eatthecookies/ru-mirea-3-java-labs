package ru.mirea.lab22;

public class MagicChair  implements Chair{
    public void doMagic(){
        System.out.println("Ууу магия!");
    }
    @Override
    public String toString() {
        return "Волшебный стул";
    }
}
