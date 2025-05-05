package cadastro;

import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Cliente> lista = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        lista.add(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void listarClientes() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente c : lista) {
                System.out.println(c);
            }
        }
    }

    public void buscarPorCPF(String cpf) {
        for (Cliente c : lista) {
            if (c.getCpf().equals(cpf)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void removerPorCPF(String cpf) {
        Cliente removido = null;
        for (Cliente c : lista) {
            if (c.getCpf().equals(cpf)) {
                removido = c;
                break;
            }
        }
        if (removido != null) {
            lista.remove(removido);
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
