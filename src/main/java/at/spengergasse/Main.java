package at.spengergasse;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Pirat volker = new Pirat("Volker", 70, true);
       volker.print();

       volker.trinken('w');
       volker.getGesundheit();
       volker.print();
    }
}