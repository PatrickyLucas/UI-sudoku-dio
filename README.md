# Sudoku com Interface Gráfica - Java

## 📜 Descrição
Este projeto implementa um jogo de Sudoku desenvolvido em Java. O jogo permite que os jogadores preencham o tabuleiro seguindo as regras do Sudoku e oferece funcionalidades para inserção e remoção de valores, verificação de erros e status do jogo, além de uma interface gráfica intuitiva.

## 🚀 Tecnologias Utilizadas
- **Java**: Linguagem principal para implementação.
- **Swing (Javax.swing)**: Biblioteca utilizada para a interface gráfica.
- **Programação Orientada a Objetos (POO)**: Arquitetura modular e organizada.
- **Java Collections e Streams**: Para manipulação eficiente de listas e objetos.

## 📂 Estrutura do Projeto
O projeto está organizado em pacotes para facilitar a manutenção e escalabilidade:

### `br.com.dio`
- **`UIMain`**: Classe principal que inicializa o jogo.

### `br.com.dio.model`
- **`Board`**: Representa o tabuleiro do jogo e gerencia a lógica de validação.
- **`Space`**: Representa cada espaço do tabuleiro, incluindo valor e estado (fixo ou editável).
- **`GameStatusEnum`**: Enumeração dos possíveis estados do jogo (**não iniciado**, **incompleto**, **completo**).

### `br.com.dio.service`
- **`BoardService`**: Controla a lógica do jogo e gerencia os espaços do tabuleiro.
- **`NotifierService`**: Implementa o padrão de eventos para atualização de componentes da interface gráfica.
- **`EventEnum` & `EventListener`**: Define eventos que ocorrem no jogo (como limpeza de espaços) e seus ouvintes.

### `br.com.dio.ui`
- **`custom.button`**: Componentes de botões personalizados (Verificar Jogo, Reiniciar, Concluir).
- **`custom.input`**: Campo de entrada numérica personalizada para o tabuleiro.
- **`custom.panel`**: Painéis que organizam os setores do tabuleiro.
- **`custom.frame`**: Janela principal do jogo.
- **`custom.screen`**: Interface gráfica principal do jogo.

## 🎮 Funcionalidades
- **Interface gráfica amigável**: O jogo é exibido com um layout organizado e interativo.
- **Inserção de números**: Permite adicionar valores em células editáveis.
- **Verificação de status**: Confirma se o tabuleiro contém erros ou está completo.
- **Reiniciar jogo**: Reseta os valores preenchidos pelo usuário.
- **Finalizar jogo**: Valida se o Sudoku foi resolvido corretamente.

## 🔧 Como Executar
1. Certifique-se de ter o [Java JDK](https://www.java.com/pt-BR/) instalado.
2. Clone este repositório:
   ```bash
   git clone https://github.com/PatrickyLucas/UI-sudoku-dio.git
   ```
3. Navegue até a pasta do projeto:
   ```bash
   cd UI-sudoku-dio
   ```
4. Compile e execute o programa:
   ```bash
   javac -d bin $(find . -name "*.java")
   java -cp bin br.com.dio.UIMain
   ```

## 📌 Considerações Finais
Este projeto foi desenvolvido como parte de um desafio da DIO - BRADESCO CLOUD NATIVE, com o objetivo de aprimorar habilidades em Java, POO e desenvolvimento de interfaces gráficas.

Sinta-se à vontade para contribuir e sugerir melhorias! 🚀

