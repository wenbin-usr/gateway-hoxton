package edu.whpu.client;

import edu.whpu.entity.Product;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

/**
 * @author bin_wen
 * @date 2025/2/7 23:22
 */
public interface ProductFeignClient {

    @RequestLine("GET /product/{id}")
    Product getById(@Param("id") Long id);

    @RequestLine("GET /product/list")
    List<Product> getList();

    @RequestLine("POST /product/save")
    @Headers("Content-Type: application/json")
    boolean saveProduct(Product product);

    @RequestLine("POST /product/saveProduct")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    boolean saveProduct(@Param("name") String name, @Param("price") Double price);

//    @RequestLine("GET /product/getByName")
//    Product getByName(Map<String, Object> params);

}
