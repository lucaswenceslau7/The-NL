package com.pei.apinoticias.service;

import com.pei.apinoticias.models.Pessoa;

import java.util.List;

public interface IEmailService {

    void disparar (List<Pessoa> pessoaList)
            throws Exception;

}
