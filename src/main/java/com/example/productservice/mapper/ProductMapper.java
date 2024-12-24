package com.example.productservice.mapper;

import com.example.productservice.dto.ProductDTO;
import com.example.productservice.entity.Product;

public class ProductMapper {

	public static ProductDTO mapToDTO(Product product) {
		return new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(),
				product.getQuantity());
	}

	public static Product mapToEntity(ProductDTO productDTO) {
		Product product = new Product();
		product.setId(productDTO.getId());
		product.setName(productDTO.getName());
		product.setDescription(productDTO.getDescription());
		product.setPrice(productDTO.getPrice());
		product.setQuantity(productDTO.getQuantity());
		return product;
	}
}