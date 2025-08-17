package edu.whpu.client;

import edu.whpu.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author bin_wen
 * @date 2025/2/8 23:40
 */
@FeignClient(value = "product-service", path = "/product")
public interface ProductFeignClient {

    @GetMapping("/list")
    List<Product> getList();

    @GetMapping("/{id}")
    Product getById(@PathVariable("id") Long id);

    @PostMapping("/save")
    Boolean saveProduct(@RequestBody Product product);
}
