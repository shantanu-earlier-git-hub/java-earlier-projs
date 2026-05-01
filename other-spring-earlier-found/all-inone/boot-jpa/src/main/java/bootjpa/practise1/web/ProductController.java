package bootjpa.practise1.web;

import bootjpa.practise1.entities.onetoone.Product;
import bootjpa.practise1.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/new")
    public Product newProduct(@RequestBody Product product) {
        var newProduct = productRepository.save(product);
        return newProduct;
    }

}
