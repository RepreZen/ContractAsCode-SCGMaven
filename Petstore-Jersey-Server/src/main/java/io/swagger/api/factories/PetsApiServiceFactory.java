package io.swagger.api.factories;

import io.swagger.api.PetsApiService;
import io.swagger.api.impl.PetsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-13T02:52:56.802-04:00")
public class PetsApiServiceFactory {
    private final static PetsApiService service = new PetsApiServiceImpl();

    public static PetsApiService getPetsApi() {
        return service;
    }
}