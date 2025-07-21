import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class CriaMultiplosArquivos {

    public static void main(String[] args) {
        String diretorioBase = "arquivos_gerados"; // Diretório onde os arquivos serão criados
        int numeroDeArquivos = 10; // Número de arquivos a serem criados

        // Cria o diretório se ele não existir
        File diretorio = new File(diretorioBase);
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        for (int i = 1; i <= numeroDeArquivos; i++) {
            String nomeArquivo = String.format("%s/arquivo_%02d.txt", diretorioBase, i); // Formato do nome do arquivo (ex: arquivo_01.txt, arquivo_02.txt...)
            File arquivo = new File(nomeArquivo);

            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado: " + nomeArquivo);

                    // Escreve conteúdo no arquivo (opcional)
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
                        writer.write("Este é o conteúdo do arquivo " + nomeArquivo);
                        writer.newLine();
                        writer.write("Mais uma linha aqui.");
                    } catch (IOException e) {
                        System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
                    }
                } else {
                    System.out.println("Arquivo já existe: " + nomeArquivo);
                }
            } catch (IOException e) {
                System.err.println("Erro ao criar o arquivo: " + e.getMessage());
            }
        }
    }
}
