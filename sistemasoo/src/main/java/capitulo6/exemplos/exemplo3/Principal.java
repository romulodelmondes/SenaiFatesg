package capitulo6.exemplos.exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setNome("Vídeogame");
        p1.setPreco(3000);
        Produto p2 = new Produto();
        p2.setCodigo(2);
        p2.setNome("Televisão");
        p2.setPreco(5500);
        Item it1 = new Item();
        it1.setProduto(p1);
        it1.setQuantidade(2);
        Item it2 = new Item();
        it2.setProduto(p2);
        it2.setQuantidade(3);
        PessoaFisica c1 = new PessoaFisica ();
        c1.setNome("Joshua");
        c1.setCpf("111.111.111-11");
        Pedido ped1 = new Pedido();
        ped1.setCliente(c1);
        ped1.adicionarItem(it1);
        ped1.adicionarItem(it2);
        System.out.println(ped1);
    }
}
