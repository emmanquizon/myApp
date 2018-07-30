function addPrice(id) {
	var price = $('#'id).val();
	$.ajax({
		url : '/app/price',
		data : JSON.stringify({
			"price" : price
		}),
		method : "POST",
		contentType : 'application/json',
		success : function(data) {
			console.log(data)
		},
		error : function(data) {
			alert("error loading image");
		}

	})

}
