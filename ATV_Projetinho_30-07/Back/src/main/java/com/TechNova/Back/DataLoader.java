package com.TechNova.Back;
import com.TechNova.Back.Entity.ImagemProduto;
import com.TechNova.Back.Entity.Produto;
import com.TechNova.Back.Repository.ImagemProdutoRepository;
import com.TechNova.Back.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ImagemProdutoRepository imagemProdutoRepository;

    public DataLoader(ProdutoRepository produtoRepository, ImagemProdutoRepository imagemProdutoRepository) {
        this.produtoRepository = produtoRepository;
        this.imagemProdutoRepository = imagemProdutoRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Produtos
        Produto nikeAirMax97 = new Produto();
        nikeAirMax97.setNome("Nike Air Max 97");
        nikeAirMax97.setTextoDescritivo("Tênis Nike Air Max 97 para corrida e estilo.");
        nikeAirMax97.setCor("Prata");
        nikeAirMax97.setFabricante("Nike");
        nikeAirMax97.setPreco(new BigDecimal("599.99")); // Usando BigDecimal
        nikeAirMax97.setQuantidade(15);

        Produto adidasUltraboost22 = new Produto();
        adidasUltraboost22.setNome("Adidas Ultraboost 22");
        adidasUltraboost22.setTextoDescritivo("Tênis Adidas Ultraboost 22 para conforto em treinos.");
        adidasUltraboost22.setCor("Preto");
        adidasUltraboost22.setFabricante("Adidas");
        adidasUltraboost22.setPreco(new BigDecimal("799.99")); // Usando BigDecimal
        adidasUltraboost22.setQuantidade(10);

        Produto pumaRSX = new Produto();
        pumaRSX.setNome("Puma RS-X");
        pumaRSX.setTextoDescritivo("Tênis Puma RS-X para performance e estilo urbano.");
        pumaRSX.setCor("Azul");
        pumaRSX.setFabricante("Puma");
        pumaRSX.setPreco(new BigDecimal("499.99")); // Usando BigDecimal
        pumaRSX.setQuantidade(20);

        Produto asicsGelKayano28 = new Produto();
        asicsGelKayano28.setNome("Asics Gel-Kayano 28");
        asicsGelKayano28.setTextoDescritivo("Tênis Asics Gel-Kayano 28 com suporte para corrida.");
        asicsGelKayano28.setCor("Cinza");
        asicsGelKayano28.setFabricante("Asics");
        asicsGelKayano28.setPreco(new BigDecimal("899.99")); // Usando BigDecimal
        asicsGelKayano28.setQuantidade(8);

        Produto newBalance990v5 = new Produto();
        newBalance990v5.setNome("New Balance 990v5");
        newBalance990v5.setTextoDescritivo("Tênis New Balance 990v5 para conforto e estabilidade.");
        newBalance990v5.setCor("Bege");
        newBalance990v5.setFabricante("New Balance");
        newBalance990v5.setPreco(new BigDecimal("899.99")); // Usando BigDecimal
        newBalance990v5.setQuantidade(12);

        Produto reebokNanoX1 = new Produto();
        reebokNanoX1.setNome("Reebok Nano X1");
        reebokNanoX1.setTextoDescritivo("Tênis Reebok Nano X1 ideal para treinos intensos.");
        reebokNanoX1.setCor("Preto");
        reebokNanoX1.setFabricante("Reebok");
        reebokNanoX1.setPreco(new BigDecimal("499.99")); // Usando BigDecimal
        reebokNanoX1.setQuantidade(25);

        Produto underArmourHOVRPhantom = new Produto();
        underArmourHOVRPhantom.setNome("Under Armour HOVR Phantom");
        underArmourHOVRPhantom.setTextoDescritivo("Tênis Under Armour HOVR Phantom com tecnologia de amortecimento.");
        underArmourHOVRPhantom.setCor("Branco");
        underArmourHOVRPhantom.setFabricante("Under Armour");
        underArmourHOVRPhantom.setPreco(new BigDecimal("649.99")); // Usando BigDecimal
        underArmourHOVRPhantom.setQuantidade(18);

        Produto converseChuckTaylor = new Produto();
        converseChuckTaylor.setNome("Converse Chuck Taylor All Star");
        converseChuckTaylor.setTextoDescritivo("Tênis Converse Chuck Taylor All Star clássico e descolado.");
        converseChuckTaylor.setCor("Branco");
        converseChuckTaylor.setFabricante("Converse");
        converseChuckTaylor.setPreco(new BigDecimal("199.99")); // Usando BigDecimal
        converseChuckTaylor.setQuantidade(22);

        Produto vansOldSkool = new Produto();
        vansOldSkool.setNome("Vans Old Skool");
        vansOldSkool.setTextoDescritivo("Tênis Vans Old Skool para estilo e conforto.");
        vansOldSkool.setCor("Preto");
        vansOldSkool.setFabricante("Vans");
        vansOldSkool.setPreco(new BigDecimal("299.99")); // Usando BigDecimal
        vansOldSkool.setQuantidade(30);

        Produto filaDisruptor2 = new Produto();
        filaDisruptor2.setNome("Fila Disruptor 2");
        filaDisruptor2.setTextoDescritivo("Tênis Fila Disruptor 2 com visual robusto e ousado.");
        filaDisruptor2.setCor("Branco");
        filaDisruptor2.setFabricante("Fila");
        filaDisruptor2.setPreco(new BigDecimal("399.99")); // Usando BigDecimal
        filaDisruptor2.setQuantidade(10);

        Produto nikeZoomXVaporflyNext = new Produto();
        nikeZoomXVaporflyNext.setNome("Nike ZoomX Vaporfly Next%");
        nikeZoomXVaporflyNext.setTextoDescritivo("Tênis Nike ZoomX Vaporfly Next% para corrida de alta performance.");
        nikeZoomXVaporflyNext.setCor("Laranja");
        nikeZoomXVaporflyNext.setFabricante("Nike");
        nikeZoomXVaporflyNext.setPreco(new BigDecimal("1799.00")); // Usando BigDecimal
        nikeZoomXVaporflyNext.setQuantidade(5);

        Produto jordan1Retro = new Produto();
        jordan1Retro.setNome("Jordan 1 Retro");
        jordan1Retro.setTextoDescritivo("Tênis Jordan 1 Retro, clássico do basquete e estilo.");
        jordan1Retro.setCor("Vermelho");
        jordan1Retro.setFabricante("Nike");
        jordan1Retro.setPreco(new BigDecimal("1099.00")); // Usando BigDecimal
        jordan1Retro.setQuantidade(7);

        // Salvar todos os produtos
        produtoRepository.saveAll(Arrays.asList(
                nikeAirMax97, adidasUltraboost22, pumaRSX, asicsGelKayano28, newBalance990v5,
                reebokNanoX1, underArmourHOVRPhantom, converseChuckTaylor, vansOldSkool, filaDisruptor2,
                nikeZoomXVaporflyNext, jordan1Retro
        ));

        // Imagens para cada produto (3 por produto)
        salvarImagens(nikeAirMax97, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/02214780.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02214780.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02214780.jpg"
        ));

        salvarImagens(adidasUltraboost22, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/022147IV.jpg",
                "https://imgnike-a.akamaihd.net/360x360/022147IV.jpg",
                "https://imgnike-a.akamaihd.net/360x360/022147IV.jpg"
        ));

        salvarImagens(pumaRSX, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/09430215.jpg",
                "https://imgnike-a.akamaihd.net/360x360/09430215.jpg",
                "https://imgnike-a.akamaihd.net/360x360/09430215.jpg"
        ));

        salvarImagens(asicsGelKayano28, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/02281853.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02281853.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02281853.jpg"
        ));

        salvarImagens(newBalance990v5, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/02779715.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02779715.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02779715.jpg"
        ));

        salvarImagens(reebokNanoX1, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/022147NY.jpg",
                "https://imgnike-a.akamaihd.net/360x360/022147NY.jpg",
                "https://imgnike-a.akamaihd.net/360x360/022147NY.jpg"
        ));

        salvarImagens(underArmourHOVRPhantom, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/060926ID.jpg",
                "https://imgnike-a.akamaihd.net/360x360/060926ID.jpg",
                "https://imgnike-a.akamaihd.net/360x360/060926ID.jpg"
        ));

        salvarImagens(converseChuckTaylor, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/09397952.jpg",
                "https://imgnike-a.akamaihd.net/360x360/09397952.jpg",
                "https://imgnike-a.akamaihd.net/360x360/09397952.jpg"
        ));

        salvarImagens(vansOldSkool, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/02874715.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02874715.jpg",
                "https://imgnike-a.akamaihd.net/360x360/02874715.jpg"
        ));

        salvarImagens(filaDisruptor2, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/024995A1.jpg",
                "https://imgnike-a.akamaihd.net/360x360/024995A1.jpg",
                "https://imgnike-a.akamaihd.net/360x360/024995A1.jpg"
        ));

        salvarImagens(nikeZoomXVaporflyNext, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/027876IM.jpg",
                "https://imgnike-a.akamaihd.net/360x360/027876IM.jpg",
                "https://imgnike-a.akamaihd.net/360x360/027876IM.jpg"
        ));

        salvarImagens(jordan1Retro, Arrays.asList(
                "https://imgnike-a.akamaihd.net/360x360/022147IK.jpg",
                "https://imgnike-a.akamaihd.net/360x360/022147IK.jpg",
                "https://imgnike-a.akamaihd.net/360x360/022147IK.jpg"
        ));
    }

    private void salvarImagens(Produto produto, java.util.List<String> urls) {
        urls.forEach(url -> {
            ImagemProduto imagemProduto = new ImagemProduto(); // Criando uma nova instância de ImagemProduto
            imagemProduto.setUrlImagem(url);
            imagemProduto.setProduto(produto); // Associando o produto à imagem
            imagemProdutoRepository.save(imagemProduto); // Salvando a imagem no repositório
        });
    }
}
