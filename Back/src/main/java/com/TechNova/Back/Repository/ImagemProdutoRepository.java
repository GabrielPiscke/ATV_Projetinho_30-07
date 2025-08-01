package com.TechNova.Back.Repository;


import com.TechNova.Back.Entity.ImagemProduto;
import com.TechNova.Back.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemProdutoRepository extends JpaRepository<ImagemProduto, Integer> {
    void deleteByProduto(Produto produto);

}

