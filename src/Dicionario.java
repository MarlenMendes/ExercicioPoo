import java.util.*;

class ResolveMain {
    public static void main(String[] args) {

        Map<String, List<String>> dicionario = new HashMap<>();


        dicionario.put("bola", Arrays.asList("azul"));
        dicionario.put("boneca", Arrays.asList("amarela"));
        dicionario.put("dado", Arrays.asList("rosa"));

        for (String chave : dicionario.keySet()) {
            List<String> valores = dicionario.get(chave);
            System.out.println(chave + " -> " + valores);
        }

    }
}