package ru.mirea.lab22;

public class Client {
    Chair chair;
    public void sit(){
        System.out.println("Сижу..." + chair);
    }
    public void setChair(Chair chair){
        this.chair = chair;
    }
}
