package es.iesmz.ed.algoritmes;

import java.util.ArrayList;

/**
 * La clase CalculMental realiza cálculos mentales de sumas y restas
 * de números naturales proporcionados en una cadena de entrada.
 * @Author Alberto Nieto.
 * @Version: 09/06/2023
 */
public class CalculMental {
    //Campo de la clase CalculMental.
    private String input;
    /**
     *Constructor para CalculMental.
     *
     * @param input La cadena de entrada que contiene la secuencia de sumas y restas.
     */
    public CalculMental(String input) {
        this.input = input;
    }
    /**
     * Realiza los cálculos de sumas y restas y devuelve una lista de resultados parciales.
     * @return Una lista de resultados.
     */
    public ArrayList<Integer> calcula() {
        ArrayList<Integer> resultados = new ArrayList<>();
        String[] operaciones = input.split(" ");
        int resultadoParcial = Integer.parseInt(operaciones[0]);
        resultados.add(resultadoParcial);

        for (int i = 1; i < operaciones.length; i += 2) {
            String operador = operaciones[i];
            int operando = Integer.parseInt(operaciones[i + 1]);

            if (operador.equals("+")) {
                resultadoParcial += operando;
            } else if (operador.equals("-")) {
                resultadoParcial -= operando;
            }

            resultados.add(resultadoParcial);
        }

        return resultados;
    }
}





