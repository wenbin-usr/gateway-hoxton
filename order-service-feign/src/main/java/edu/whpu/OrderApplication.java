package edu.whpu;

import edu.whpu.client.ProductFeignClient;
import edu.whpu.entity.Product;
import feign.Feign;
import feign.form.FormEncoder;
import feign.gson.GsonDecoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class OrderApplication {
    public static void main( String[] args ) {
        ProductFeignClient productClient = Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new FormEncoder(new JacksonEncoder()))
//                .encoder(new JacksonEncoder())
//                .client(new OkHttpClient())
                .target(ProductFeignClient.class, "http://localhost:9090");
        productClient.saveProduct("苹果手机16pro", 8959.99D);
//        System.out.println(productClient.getById(10009L));
//        Product product = new Product(10010L, "苹果手机13pro", 8999.99D);
//        productClient.saveProduct(product);
//        List<Product> productList = productClient.getList();
//        productList.forEach(System.out::println);
    }
}
