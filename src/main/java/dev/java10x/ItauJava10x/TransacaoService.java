package dev.java10x.ItauJava10x;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class TransacaoService {

    public void validarTransacao(TransacaoRequest transacaoRequest) {

    //VALOR MAIOR OU IGUAL A 0
    if (transacaoRequest.getValor().compareTo(BigDecimal.ZERO) < 0){
        //TRANSACAO NAO É VALIDA, VALOR MENOR OU IGUAL A ZERO
        throw new IllegalArgumentException("Erro: Isso nao é uma transacao valida, transacoes devem ter valor maior do que zero!");
    }
    //DATA MENOR OU IGUAL A DATA DE HOJE
    if (transacaoRequest.getDataHora().isAfter(OffsetDateTime.now())){
        throw new IllegalArgumentException("Erro: Na data da transacao");
    }
    //DATA E HORA PRESENTES (BODY NAO PODE SER VAZIO)

    }

}
