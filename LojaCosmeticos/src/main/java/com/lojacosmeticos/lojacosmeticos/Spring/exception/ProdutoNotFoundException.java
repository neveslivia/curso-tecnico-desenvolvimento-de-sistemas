package com.lojacosmeticos.lojacosmeticos.Spring.exception;

public class ProdutoNotFoundException extends RuntimeException{
    public ProdutoNotFoundException(String message) {
        super(message);
    }
}
