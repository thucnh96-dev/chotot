package com.group4.spec;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.group4.entity.Post;

public class SearchPost {
	public static Specification<Post> search(String text, String adress, String city, String cate, double startprice,
			double endprice) {

		startprice = 0;
		endprice = 0;
		
		return new Specification<Post>() {

			@Override
			public Predicate toPredicate(Root<Post> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = new ArrayList<>();
				if ("".equals(text) & "".equals(adress) & "".equals(city) & "".equals(cate)) {

				}
				return null;
			}

		};
	}
}
