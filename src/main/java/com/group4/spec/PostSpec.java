package com.group4.spec;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.group4.entity.Post;

public class PostSpec {


    public static Specification<Post> likeTitle(final String keyword) {
        return new Specification<Post>() {
            @Override
            public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("title"), keyword + "%");
            }
        };
    }
    public static Specification<Post> likeDate(final String date) {
        return new Specification<Post>() {
            @Override
            public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("createdAt"), date + "%");
            }
        };
    }
    public static Specification<Post> likeUser(final String user) {
        return new Specification<Post>() {
            @Override
            public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("user").get("username"), user + "%");
            }
        };
    }
    public static Specification<Post> likeDescription(final String keyword) {
        return new Specification<Post>() {
            @Override
            public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("description"), keyword + "%");
            }
        };
    }
    public static Specification<Post> equalCategory(final String idcate) {
        return new Specification<Post>() {
            @Override
            public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("subCategory").get("name"), idcate);
            }
        };
    }
    

    public static Specification<Post> defualtWhere() {
        return new Specification<Post>() {
            @Override
            public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.isNotNull(root.get("description"));
            }
        };
    }
}
