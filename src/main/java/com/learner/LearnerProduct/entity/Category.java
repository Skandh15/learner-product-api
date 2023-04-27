package com.learner.LearnerProduct.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "learner_products_category")
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "category_title")
    private String categoryTitle;

    @Column(name = "category_image_url")
    private String categoryImageUrl;

    @Column(name = "category_route")
    private String categoryRoute;

    public Category() {
    }

    public Category(long id, String categoryTitle, String categoryImageUrl, String categoryRoute) {
        this.id = id;
        this.categoryTitle = categoryTitle;
        this.categoryImageUrl = categoryImageUrl;
        this.categoryRoute = categoryRoute;
    }
}
