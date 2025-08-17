package edu.whpu.controller;

import edu.whpu.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author bin_wen
 * @date 2025/2/7 00:18
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/list")
    public List<Product> getList() {
        return Arrays.asList(new Product(10010L, "苹果手机13pro", 8999.99D));
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") Long id) {
        System.out.println("ProductController.getById");
        return new Product(id, "苹果手机13pro", 8999.99D);
    }

    @PostMapping("/save")
    public Boolean saveProduct(@RequestBody Product product) {
        System.out.println(product.getName());
        return true;
    }

    @PostMapping("/saveProduct")
    public Boolean saveProduct(@RequestParam String name, @RequestParam Double price) {
        System.out.println(name);
        return true;
    }

    @GetMapping("/getByName")
    public Product getByName(@RequestParam String name) {
        System.out.println("name: " + name);
        return new Product(10001L, name, 9991D);
    }
}
