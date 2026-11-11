public class Ex04 {

    public static void main(String[] args) {

        Produto p1 = new Produto("Makita", "Furadeira 500w", 289.50, 12);
        Produto p2 = new Produto("Bosch", "Parafusadeira V1500", 329.90, 8);
        Produto p3 = new Produto("Wischer", "Cimento", 56.80, 50);
        Produto p4 = new Produto("Netzsch", "Bomba CV5000", 1489.90, 10);
        Produto p5 = new Produto("Ecomil", "Tijolo Bege", 3.60, 5000);

        p1.adicionarEstoque(5);
        p2.adicionarEstoque(5);
        p3.adicionarEstoque(5);
        p4.adicionarEstoque(5);
        p5.adicionarEstoque(5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


        Loja l1 = new Loja();
        l1.adicionarProduto(p1);
        l1.adicionarProduto(p2);
        l1.adicionarProduto(p3);
        l1.adicionarProduto(p4);
        l1.adicionarProduto(p5);

    }
}
