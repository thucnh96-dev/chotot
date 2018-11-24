function request(url, method, data, callback) {
	$.ajax({
			url: url, // Endpoint to call
			data: JSON.stringify(data),
			dataType: 'json',
			error: function(error) { // Handle error from server
				callback(error);
			},
			success: function(data) {
				console.log(data)
				callback(null,data);	
			},
			type: method // Method
		});	
};
function fetchAddress(){
	request('https://thongtindoanhnghiep.co/api/city','GET',null, function(err,data)(){
		if (err) {
			
		}
		console.log(data)
		
	});
}
	




