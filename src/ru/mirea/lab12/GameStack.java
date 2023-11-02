package ru.mirea.lab12;

import java.util.Stack;

public class GameStack {
    Stack<Integer> firstPlayer;
    Stack <Integer> secondPlayer;

    public GameStack(String firstPlayerStr, String secondPlayerString) {
        this.firstPlayer = new Stack<>();
        this.secondPlayer = new Stack<>();
        for (int i = 0; i < 5; i++){
            this.firstPlayer.push(Integer.parseInt(firstPlayerStr.substring(i, i+1)));
            this.secondPlayer.push(Integer.parseInt(secondPlayerString.substring(i, i+1)));
        }
    }
    private void pushBack(Stack<Integer> resultStack, Integer lastCard) {
        Stack<Integer> tempStack = new Stack<>();

        Integer prelastCard = resultStack.pop();

        while (!resultStack.empty())
            tempStack.push(resultStack.pop());

        resultStack.push(lastCard);
        resultStack.push(prelastCard);

        while (!tempStack.empty())
            resultStack.push(tempStack.pop());

    }
    public String play(){
        String result;
        int count = 0;

        while (!firstPlayer.empty() && !secondPlayer.empty() && (count <= 106) ){
            if (firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0){
                pushBack(firstPlayer, secondPlayer.pop()); // первый игрок забирает карты
            } else{
                pushBack(secondPlayer, firstPlayer.pop()); // второй игрок забирает карты
            }
            count++;
        }

        if (firstPlayer.empty())
        {
            result = "second " + count;
            return result;
        }
        else if (secondPlayer.empty()) {
            result = "first " + count;
            return result;
        }
        else
            return "botva";
    }
}
