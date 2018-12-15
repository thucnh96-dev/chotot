package com.group4.spec;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.group4.entity.Post;

public class PostSpec {


    public static Specification<Post> likeTitle(String text,String username, String subcate ) {
        return new Specification<Post>() {
            @Override
            public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
            	List<Predicate> predicates = new ArrayList<>();
            	
				if (" ".equals(text) &" ".equals(subcate)&" ".equals(username)) {
				predicates.add(criteriaBuilder.notEqual(root.get("title"), "bdf"));
				}
				
				if (!" ".equals(text)) {
					predicates.add(criteriaBuilder.or(criteriaBuilder.like(root.get("title"), "%"+text+"%"),
							                           criteriaBuilder.like(root.get("description"), "%"+text+"%"),
							                           criteriaBuilder.like(root.get("info"), "%"+text+"%")							                           
                ));
					
				}if (!" ".equals(username)) {
					predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("user").get("name"), username)));
				}
				if (!" ".equals(subcate)) {
					predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("subCategory").get("name"), subcate)));
				}		
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
 
}
