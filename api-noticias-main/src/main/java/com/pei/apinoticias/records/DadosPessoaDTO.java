package com.pei.apinoticias.records;

import com.pei.apinoticias.enums.PreferenciaNoticia;

public record DadosPessoaDTO (String nome, String CPF, String email, PreferenciaNoticia preferencia) {
}
