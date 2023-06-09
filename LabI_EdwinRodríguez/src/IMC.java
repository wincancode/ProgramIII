import java.util.Scanner;
import javax.swing.*;

public class IMC {

    static class Paciente {
        String name;
        int age;
        char gender;
        float weigh;
        float height;
        float IMC;
        String NutritionalState;
        JFrame jFrame;

        public Paciente() {
            NutritionalState = "Not defined";
            IMC = -1;
        }

        public void setData() {

            name = JOptionPane.showInputDialog(jFrame, "Ingrese su nombre");
            age = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "Ingrese su edad"));
            gender = JOptionPane.showInputDialog(jFrame, "Ingrese su género, M: Másculino, F: Femenino").charAt(0);
            weigh = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "Ingrese su peso en kilogramos"));
            height = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "Ingrese su altura en metros"));
        }

        public void getIMC() {
            IMC = weigh / (height * height);
            NutritionalState = IMC < 18.50 ? "Bajo peso" : IMC < 24.99 ? "Normal" : "Sobrepeso";
        }

        public void showData() {
            JOptionPane.showMessageDialog(jFrame,
                    "Paciente: " + name + "\nEdad del paciente: " + age + "\nGénero: " + gender + "\nPeso" + weigh
                            + " kg\nAltura: " + height + " cms\nIMC: " + IMC + "\nEstado nutricional: "
                            + NutritionalState);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Paciente paciente1 = new Paciente();

        paciente1.setData();
        paciente1.getIMC();
        paciente1.showData();
        entrada.close();
    }
}
