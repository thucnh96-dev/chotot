function request(url, method, data, callback) {
	$.ajax({
		url : url, // Endpoint to call
		data : JSON.stringify(data),
		dataType : 'json',
		error : function(error) { // Handle error from server
			callback(error);
		},
		success : function(data) {
			console.log(data)
			callback(null, data);
		},
		type : method
	// Method
	});
};

function activePost(id, btn) {
	var table = document.getElementById("postactive");
	var row = btn.parentNode.parentNode.parentNode.parentNode;
	request(` http://localhost:8080/admin/ative/${id}`, "GET", null, function(err, data) {
			row.parentNode.removeChild(row);
	});

}
