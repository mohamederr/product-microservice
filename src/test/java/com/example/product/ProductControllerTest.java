
package com.example.product;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductController productController;

    @Test
    void getAllProductsShouldReturnProductList() {
        // Arrange: prepare test data
        Product product = new Product("Laptop", 8500);

        when(productRepository.findAll())
                .thenReturn(List.of(product));

        // Act: call the controller
        var result = productController.getAllProducts();

        // Assert: verify the result
        assertEquals(1, result.size());
        assertEquals("Laptop", result.get(0).getName());

        verify(productRepository, times(1)).findAll();
    }
}
