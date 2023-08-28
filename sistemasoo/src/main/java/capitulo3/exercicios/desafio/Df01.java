package capitulo3.exercicios.desafio;

public class Df01 {

    public static void main(String[] args) {
        System.out.println("Entre com uma data: ");
        int data = new java.util.Scanner(System.in).nextInt();
        int dd = data / 1000000;
        int mm = (data % 1000000) / 10000;
        int aaaa = (data % 1000000) % 10000;

        int ano = 1900;
        int mes = 01;
        int dia = 01;

        System.out.println("Dia: " + dd);
        System.out.println("Mês: " + mm);
        System.out.println("Ano: " + aaaa);

        int qtdDiasDecorridos = 0;

        while (ano < aaaa) {
            if (ano % 4 == 0) {
                if (ano % 100 == 0) {
                    if (ano % 400 == 0) {
                        qtdDiasDecorridos += 366;
                    } else {
                        qtdDiasDecorridos += 365;
                    }
                } else {
                    qtdDiasDecorridos += 366;
                }
            } else {
                qtdDiasDecorridos += 365;
            }
            ano++;
        }
        while (mes < mm) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                qtdDiasDecorridos += 31;
            } else {
                if (mes == 2) {
                    if (ano % 4 == 0) {
                        if (ano % 100 == 0) {
                            if (ano % 400 == 0) {
                                qtdDiasDecorridos += 29;
                            } else {
                                qtdDiasDecorridos += 28;
                            }
                        } else {
                            qtdDiasDecorridos += 29;
                        }
                    } else {
                        qtdDiasDecorridos += 28;

                    }
                } else {
                    qtdDiasDecorridos += 30;
                }
            }
            mes++;
        }

        qtdDiasDecorridos += (dd-1);
        
        int resto = qtdDiasDecorridos % 7;
        System.out.println(qtdDiasDecorridos);
        switch (resto) {
            case 0: {
                System.out.println("Segunda-feira ");
                break;
            }
            case 1: {
                System.out.println("Terça-feira ");
                break;
            }
            case 2: {
                System.out.println("Quarta-feira ");
                break;
            }
            case 3: {
                System.out.println("Quinta-feira ");
                break;
            }
            case 4: {
                System.out.println("Sexta-feira ");
                break;
            }
            case 5: {
                System.out.println("Sábado ");
                break;
            }
            case 6: {
                System.out.println("Domingo ");
                break;
            }

        }

    }
}
