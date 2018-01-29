$("#searchBtn").click(function(){
		
		var Search=$("#searchInput").val();
		var Type=$("#type").val();
		 
		$.ajax({
	            url : 'rechercher',
	            type : "POST",
	            data :"search="+Search+"&type="+Type,
	            success:function (data) {
	                str.value=data;
	            }
	    
		})

});
		