import java.util.HashMap;
import java.util.Map;

public class SistemaLogin {
    private Map<String, String> usuarios;

    public SistemaLogin() {
        usuarios = new HashMap<>();
        // Usuários pré-definidos (apenas para exemplo)
        usuarios.put("usuario1", "senha1");
        usuarios.put("usuario2", "senha2");
    }

    public void login(String usuario, String senha) throws AtividadeException {
        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
            Logger.log("Login bem-sucedido para o usuário: " + usuario);
        } else {
            throw new AtividadeException("Falha no login para o usuário: " + usuario);
        }
    }

    public static void main(String[] args) {
        SistemaLogin sistema = new SistemaLogin();
        try {
            sistema.login("usuario1", "senha1"); // Login bem-sucedido
            sistema.login("usuario2", "senhaErrada"); // Falha no login
        } catch (AtividadeException e) {
            Logger.log(e.getMessage());
        }
    }
}
