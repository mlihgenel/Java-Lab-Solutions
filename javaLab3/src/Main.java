import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the massage : ");
        String message = input.next();
        System.out.println("Please enter the key to shift alphabet : ");
        int key = input.nextInt();
        System.out.println();


        String encryptMessage = String.valueOf(cesarEncryption(key,message));
        cesarDecryption(key,encryptMessage);


    }

    public static StringBuilder cesarEncryption(int key, String message){
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L',
                'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] cyrptAlphabet = new char[alphabet.length];
        message = message.toUpperCase();

        for (int i = 0; i < cyrptAlphabet.length; i++) {
            cyrptAlphabet[i] = alphabet[(i + key) % 26];
        }
        StringBuilder encyrptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

           c = (char) ((char)(c - 'A' + key + 26) % 26 + 'A');
           // we found the index of the c with c - 'A',
           // then we add to key to shift
           // then add the 26 because we don't wanna negatif number
           // then we made % 26 to find new encyrpt index
           // then we add 'A' to find new encyrpt letter(it was ASCII code we convert to letter)

        encyrptedMessage.append(c);
        }
        System.out.println("Alphabet : " + Arrays.toString(alphabet));
        System.out.println("Encyrpted Alphabet : " + Arrays.toString(cyrptAlphabet));
        System.out.println();
        System.out.println("Your encyrpted massage : " + encyrptedMessage);

    return encyrptedMessage;
    }
    public static StringBuilder cesarDecryption(int key,String message){
        StringBuilder decryptMessage = new StringBuilder();
        message = message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            c = (char) ((char)(c - 'A' - key + 26) % 26 + 'A');
            decryptMessage.append(c);
        }
        System.out.println("Your decyrpted massage : " + decryptMessage);
       return decryptMessage;
    }
}