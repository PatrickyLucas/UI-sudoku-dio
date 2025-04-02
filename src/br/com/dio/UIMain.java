package br.com.dio;

import br.com.dio.service.GameService;
import br.com.dio.ui.custom.screen.MainScreen;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UIMain {

    public static void main(String[] args) {
        final Map<String, String> gameConfig;

        if (args.length == 0) {
            System.out.println("Nenhuma configuração foi fornecida. Carregando tabuleiro padrão...");
            gameConfig = getDefaultBoardConfig();
        } else {
            try {
                gameConfig = Stream.of(args)
                        .collect(toMap(
                                k -> k.split(";")[0],
                                v -> v.split(";")[1]
                        ));
            } catch (Exception e) {
                System.err.println("Erro ao processar as configurações do tabuleiro. Verifique o formato dos argumentos.");
                return;
            }
        }

        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainSreen();
    }

    private static Map<String, String> getDefaultBoardConfig() {
        Map<String, String> boardConfig = new HashMap<>();
        boardConfig.put("0,0", "5,true"); boardConfig.put("0,1", "3,true"); boardConfig.put("0,4", "7,true");
        boardConfig.put("1,0", "6,true"); boardConfig.put("1,3", "1,true"); boardConfig.put("1,4", "9,true"); boardConfig.put("1,5", "5,true");
        boardConfig.put("2,1", "9,true"); boardConfig.put("2,2", "8,true"); boardConfig.put("2,7", "6,true");
        boardConfig.put("3,0", "8,true"); boardConfig.put("3,4", "6,true"); boardConfig.put("3,8", "3,true");
        boardConfig.put("4,0", "4,true"); boardConfig.put("4,3", "8,true"); boardConfig.put("4,5", "3,true"); boardConfig.put("4,8", "1,true");
        boardConfig.put("5,0", "7,true"); boardConfig.put("5,4", "2,true"); boardConfig.put("5,8", "6,true");
        boardConfig.put("6,1", "6,true"); boardConfig.put("6,6", "2,true"); boardConfig.put("6,7", "8,true");
        boardConfig.put("7,3", "4,true"); boardConfig.put("7,4", "1,true"); boardConfig.put("7,5", "9,true"); boardConfig.put("7,8", "5,true");
        boardConfig.put("8,4", "8,true"); boardConfig.put("8,7", "7,true"); boardConfig.put("8,8", "9,true");
        return boardConfig;
    }
}
