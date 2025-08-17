package edu.whpu.controller;

import edu.whpu.client.ProductFeignClient;
import edu.whpu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bin_wen
 * @date 2025/2/8 23:44
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private ProductFeignClient productFeignClient;

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productFeignClient.getById(id);
    }
}
