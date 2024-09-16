/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex1.entities;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 16/09/2024
 * @brief Class Aluno
 */
public class Aluno {
    private Double n1, n2, n3, n4;
    
    private Double mediaAluno;
    
    public static Integer numero_de_alunos = 0;
    public static Double soma_de_medias = 0.00;

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    public Double getN4() {
        return n4;
    }

    public void setN4(Double n4) {
        this.n4 = n4;
    }

    public Aluno() {
        numero_de_alunos++;
    }

    public Aluno(Double n1, Double n2, Double n3, Double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        numero_de_alunos++;
    }
    
    public void media() {
        this.mediaAluno = (((n1) + (n2 * 2.00) + (n3 * 3.00) + (n4 * 4.00)) / 10.00);
        soma_de_medias += this.getMediaAluno();
    }

    public int compararMedia(Aluno a) {
        int retorno;

        if (this.mediaAluno < a.mediaAluno) {
            retorno = -1;
        } else if (this.mediaAluno == a.mediaAluno) {
            retorno = 0;
        } else {
            retorno = 1;
        }
        return retorno;
    }

    public Double getMediaAluno() {
        return mediaAluno;
    }


    public static Double media_total() {
        double mediaTotalCalculada = (soma_de_medias / numero_de_alunos);
        return mediaTotalCalculada;
    }
}
