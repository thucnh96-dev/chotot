var city = null;
var ward = null;
var district = null;
function request(url, method, data, callback) {
	$.ajax({
			url: url, // Endpoint to call
			data: data,
			dataType: 'json',
			error: function(error) { // Handle error from server
				callback(error);
			},
			success: function(data) {
				callback(null,data);	
			},
			type: method // Method
		});	
};
function addressShow(id){
request('http://localhost:8080/api/city/'+id+'/districts', 'get', null, function(err, data) {
	if(err) {
		console.log(err);
	}
	city = id;
	var ul = $("#address");
	ul.html("");
	 var html = "";
	for (var i = 0; i < data.length; i++) {
		 html += "<a href='#' style='text-decoration: none;' onclick='showdistricts("+ data[i].id +")'><li class='list-group-item '>"+ data[i].name +" <i class='fa fa-angle-right fa-5 pull-right'></i></li> </a>" ;
	
	}
	ul.append(html)
});
}

function showdistricts(id) {
	district = id;
	request('http://localhost:8080/api/district/'+id+'/wards', 'get', null, function(err, data) {
		if(err) {
			console.log(err);
		}
		
		var ul = $("#address");
		ul.html("");
		 var html = "";
		for (var i = 0; i < data.length; i++) {
			 html += "<a href='#' style='text-decoration: none;' onclick='showward("+ data[i].id +")'><li class='list-group-item '>"+ data[i].name +" <i class='fa fa-angle-right fa-5 pull-right'></i></li> </a>" ;
		
		}
		ul.append(html)
	});
}

function showward(id = null) {
	 $(".modal").removeClass("in");
	  $(".modal-backdrop").remove();
	  $('body').removeClass('modal-open');
	  $('body').css('padding-right', '');
	  $(".modal").hide();
	  ward = id;
}
function search() {
	var keywork = document.getElementById("search-input");
	var json = {
			keywork: keywork	}
	request('http://localhost:8080/api/search', 'post', json, function(err, data) {
		if(err) {
			console.log(err);
		}
		console.log(data)
		
	});
	
}

