import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        Encrypt encry = new Encrypt();
        Decrypt decry = new Decrypt();
        String encryResult = encry.encrypt(message, 3);
        System.out.println(encryResult);
        String decrResult = decry.decrypt(message, 3);
        System.out.println(decrResult);
        sc.close();
    }

}

