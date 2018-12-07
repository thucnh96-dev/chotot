package com.group4.Heper;

public class QueryHelper {
	public static String objectQuery(String text, String subcate, String cate, int city ) {
		
		String cityQuery = "";
//		if (subcate != null) {
//			objectQuery += "and sub_category.name = '"+subcate+"'";
//		}
//		if (cate != null) {
//			objectQuery += "and category.name = '"+cate+"'";
//		}
		if (city != 0) {
			cityQuery += "and city.id = "+city+"";
		}
		String objectQuery = "SELECT post.* FROM post, category, sub_category where post.address_id in (SELECT address.id FROM address, city,ward,  distric where city.id = distric.city_id and address.ward_id = ward.id and ward.city_id = city.id and ward.distric_id = distric.id "+cityQuery+" )  and post.sub_category_id = sub_category.id and sub_category.category_id = category.id and title like % "+text+"%";
		return objectQuery.replace("'", "");
		
	}

}
