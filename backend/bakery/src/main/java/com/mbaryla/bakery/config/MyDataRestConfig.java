package com.mbaryla.bakery.config;
import com.mbaryla.bakery.entity.Category;
import com.mbaryla.bakery.entity.Product;
import com.mbaryla.bakery.entity.Subcategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private String theAllowedOrigins = "http://localhost:5173";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] theUnsupportedActions = {HttpMethod.POST, HttpMethod.PATCH, HttpMethod.DELETE, HttpMethod.PUT};

        config.exposeIdsFor(Product.class);
        config.exposeIdsFor(Category.class);
        config.exposeIdsFor(Subcategory.class);
        disableHttpMethods(Product.class, config, theUnsupportedActions);
        disableHttpMethods(Category.class, config, theUnsupportedActions);
        disableHttpMethods(Subcategory.class, config, theUnsupportedActions);

        /* Configure CORS Mapping */
        cors.addMapping(config.getBasePath() + "/**")
                .allowedOrigins(theAllowedOrigins);
    }

    private void disableHttpMethods(Class theClass, RepositoryRestConfiguration config, HttpMethod[] unsupoortedActions) {
        config.getExposureConfiguration()
                .forDomainType(theClass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupoortedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupoortedActions));
    }





}
