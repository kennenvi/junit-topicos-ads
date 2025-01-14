package com.example.project;

import java.util.LinkedList;

public class Turma {
    LinkedList<Double> notas = new LinkedList<>();
    
    public void addNota(double nota) {
        notas.add(nota);
    }

    public int getQuantidadeNotas() {
        return notas.size();
    }

    public double getSomaNotas() {
        double soma = 0.0;
        for (Double nota: this.notas) {
            soma += nota;
        }
        return soma;
    }

    public double getMediaDasNotas() {
        return getSomaNotas() / getQuantidadeNotas();
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        int notasAcimaMedia = 0;
        double media = getMediaDasNotas();
        for (Double nota: this.notas) {
            if (nota > media) {
                notasAcimaMedia++;
            }
        }
        return notasAcimaMedia;
    }
}
