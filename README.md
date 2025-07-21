# create-multiple-files

Explicação do código:

    import statements: Importa as classes necessárias para manipulação de arquivos (File, FileWriter, BufferedWriter, IOException).
    diretorioBase and numeroDeArquivos: Define o diretório onde os arquivos serão criados e o número de arquivos a serem gerados.
    Criação do diretório: Verifica se o diretório base existe e o cria se não existir.
    Loop para criação dos arquivos: Um loop for itera para criar cada arquivo.
    Nome do arquivo: Utiliza String.format para criar um nome de arquivo com um padrão sequencial (ex: arquivo_01.txt, arquivo_02.txt...).
    Criação do arquivo: O método arquivo.createNewFile() cria o arquivo, retornando true se o arquivo foi criado com sucesso ou false se o arquivo já existia.
    Escrita no arquivo (opcional): Utiliza um BufferedWriter para escrever conteúdo no arquivo, utilizando o FileWriter para criar o stream de escrita. O bloco try-with-resources garante que o writer seja fechado após o uso.
    Tratamento de exceções: Bloco try-catch para capturar e tratar possíveis exceções de E/S, como a impossibilidade de criar um arquivo ou escrever nele. 

Como usar:

    Salve o código acima como um arquivo .java (ex: CriaMultiplosArquivos.java).
    Compile o código: javac CriaMultiplosArquivos.java
    Execute o código: java CriaMultiplosArquivos 

O código irá criar um diretório chamado "arquivos_gerados" (se ele não existir) e dentro dele, 10 arquivos de texto com o formato "arquivo\_XX.txt" (onde XX é um número sequencial de 01 a 10). Cada arquivo terá o conteúdo especificado na função de escrita.
