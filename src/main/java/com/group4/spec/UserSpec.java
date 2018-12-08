package com.group4.spec;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;


import com.group4.entity.User;

public class UserSpec {
	   public static Specification<User> likeTitle(String text ) {
	        return new Specification<User>() {
	            @Override
	            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
	            	List<Predicate> predicates = new ArrayList<>();
	            	
					if (" ".equals(text)) {
					predicates.add(criteriaBuilder.notEqual(root.get("name"), "thth"));
					}
					
					if (!" ".equals(text)) {
						predicates.add(criteriaBuilder.or(criteriaBuilder.like(root.get("email"), "%"+text+"%"),
								                           criteriaBuilder.like(root.get("phone"), "%"+text+"%"),
								                           criteriaBuilder.like(root.get("username"), "%"+text+"%")	,						                           
								                           criteriaBuilder.like(root.get("name"), "%"+text+"%")							                           
	                ));
						
					}	
					return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	            }
	        };
	    }
}
