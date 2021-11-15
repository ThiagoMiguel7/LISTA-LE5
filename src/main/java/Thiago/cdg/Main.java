package Thiago.cdg;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();

        List<Funcionario> funcionarios = arquivo.read();

        List<Funcionario> funcionariosComFilhos = new ArrayList<>();

        for (Funcionario funcionario: funcionarios) {
            if(funcionario.getFilhos() > 0){
                funcionariosComFilhos.add(funcionario);
            }
        }

        arquivo.write(funcionariosComFilhos);
    }
}
