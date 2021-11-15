package Thiago.cdg;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    public void write(List<Funcionario> funcionarios) {

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("func_filtrado.csv", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Identificador,Filhos,Salario");
            bw.newLine();
            for(Funcionario funcionario: funcionarios) {
                bw.write(funcionario.getId() + "," + funcionario.getFilhos() + "," + funcionario.getSalario());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Funcionario> read() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String lista; // linha de cada arquivo
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        try {

            is = new FileInputStream("funcionarios.csv");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            br.readLine(); // pula a primeira linha


            for(lista = br.readLine(); lista != null; lista = br.readLine()) {

                Funcionario funcionario = new Funcionario();

                String[] dados = lista.split(",");

                funcionario.setId(Integer.parseInt(dados[0]));
                funcionario.setEstadoCivil(dados[1]);
                funcionario.setGrauInstrucao(dados[2]);
                funcionario.setFilhos(Integer.parseInt(dados[3]));
                funcionario.setSalario(Double.parseDouble(dados[4]));
                funcionarios.add(funcionario);

            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {

            try {
                br.close();
            }catch (Exception e) {
                System.out.println(e);
            }
        }

        return funcionarios;
    }
}
