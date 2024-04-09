import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(100) + 1;
        int trys = 0;
        int guess;

        while (trys < 5){
            guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem-Vindo ao Jogo do Número Secreto\n\nVocê tem 5 tentativas"));
            trys++;

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Parabéns! você acertou o número secreto com " + trys + " tentativa");
                break;
            } else if (guess < randomNumber){
                JOptionPane.showMessageDialog(null, "O número digitado é maior");
            } else {
                JOptionPane.showMessageDialog(null, "O número digitado é menor");
            }
            if (trys == 5 && guess != randomNumber) {
                JOptionPane.showMessageDialog(null, "Você Perdeu!!!\nO número secreto era " + randomNumber);
            }
        }
    }
}