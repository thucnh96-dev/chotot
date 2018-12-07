var city = 0;
var ward = 0;
var district = 0;
var cate = null;
var subCate = null;
function request(url, method, data, callback) {
	$.ajax({
		url : url, // Endpoint to call
		data : data,
		dataType : 'json',
		error : function(error) { // Handle error from server
			callback(error);
		},
		success : function(data) {
			callback(null, data);
		},
		type : method
	// Method
	});
};
function addressShow(id, name) {
	console.log(document.getElementsByName("exampleModalLongTitle")[1])
	document.getElementsByName("exampleModalLongTitle")[0].innerHTML = name;
	document.getElementsByName("exampleModalLongTitle")[1].innerHTML = name;
	document.getElementsByName("exampleModalLongTitle")[2].innerHTML = name;
	request(
			'http://localhost:8080/api/city/' + id + '/districts',
			'get',
			null,
			function(err, data) {
				if (err) {
					console.log(err);
				}
				city = id;
				var ul = $("#address");
				ul.html("");
				var html = "";
				for (var i = 0; i < data.length; i++) {
					html += "<a href='#' style='text-decoration: none;' onclick='showdistricts("
							+ data[i].id
							+ ")'><li class='list-group-item '>"
							+ data[i].name
							+ " <i class='fa fa-angle-right fa-5 pull-right'></i></li> </a>";

				}
				ul.append(html)
			});
}

function showdistricts(id) {
	district = id;
//	showNameAddress
	request(
			'http://localhost:8080/api/district/' + id + '/wards',
			'get',
			null,
			function(err, data) {
				if (err) {
					console.log(err);
				}

				var ul = $("#address");
				ul.html("");
				var html = "";
				for (var i = 0; i < data.length; i++) {
					html += "<a href='#' style='text-decoration: none;' onclick='showward("
							+ data[i].id
							+ ")'><li class='list-group-item '>"
							+ data[i].name
							+ " <i class='fa fa-angle-right fa-5 pull-right'></i></li> </a>";

				}
				ul.append(html)
			});
}

function showward(id) {
	$(".modal").removeClass("in");
	$(".modal-backdrop").remove();
	$('body').removeClass('modal-open');
	$('body').css('padding-right', '');
	$(".modal").hide();
	ward = id;
}
function search() {
	var keywork = document.getElementById("search-input").value;
	var objectUrl = `http://localhost:8080/search/by?keywork=${keywork}`;
	if (city != 0) {
		objectUrl += `&city=${city}`;
	}
	if (ward != 0) {
		objectUrl += `&ward=${ward}`;
	}
	if (district != 0) {
		objectUrl += `&district=${district}`;
	}
	if (cate != null) {
		objectUrl += `&cateId=${cate}`;
	}
	if (subCate != null) {
		objectUrl += `&subcateId=${subCate}`;
	}
	window.open(objectUrl);

}

function activePost(id, btn) {
	var table = document.getElementById("postactive");
	var row = btn.parentNode.parentNode.parentNode.parentNode;
	request(` http://localhost:8080/admin/ative/${id}`, "GET", null, function(
			err, data) {
		row.parentNode.removeChild(row);
	});

}

function btnCate(id, name) {//btn_name_Cate
	console.log(name)
	document.getElementById("btn_name_Cate").innerHTML = name;
	cate = id;
}
function btnSubcate(id, name) {
	subCate = id;
	document.getElementById("btn_name_Cate").innerHTML = name;

}
