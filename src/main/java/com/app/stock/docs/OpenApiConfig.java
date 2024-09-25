package com.app.stock.docs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * Class to configure the OpenAPI documentation.
 */
@Configuration
public class OpenApiConfig implements OpenApiCustomizer {

  @Override
  public void customise(OpenAPI openApi) {
    Info info = new Info()
        .title("API de estoque")
        .description("Este projeto apresenta uma API RESTful que gerencia os " +
            "produtos que existem no estoque do ecommerce oferecendo uma " +
            "visão de data de entrada data de validade quantidade que há " +
            "quantidade suportada e localização desses produtos na loja"
            + ", possibilitando às pessoas usuárias criar, visualizar, atualizar e excluir"
            + " estoque de produtos, de forma intuitiva e prática. A" +
            " API " +
            "oferece" +
            " endpoints específicos para"
            + " operações CRUD (Create, Read, Update, Delete) em listas de " +
            "estoque," +
            " visando"
            + " proporcionar uma experiência consistente e confiável.")
        .version("1.0.0");

    openApi.info(info);
  }
}