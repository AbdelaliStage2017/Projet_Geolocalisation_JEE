<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Sign-Up/Login Form</title>
  <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <style><%@include file="/Add/Add/css/style.css"%></style>
      
	  <style>
	   #map {
        height: 400px;
		width: 100%;
		margin-bottom:30px;
      }
	  
	  #floating-panel {
        
        z-index: 5;
        background-color: #fff;
        padding: 5px;
        border: 1px solid #999;
        text-align: center;
        font-family: 'Roboto','sans-serif';
        line-height: 30px;
        padding-left: 10px;
      }
	  
	  #Hide {
			display: none;
	  }
	  
	  </style>

  
</head>

<body>

  <div class="form" >
      
      <ul class="tab-group">
        <li class="tab active" ><a href="#universite" style="width:100%">Departement</a></li>
		
      </ul>
      
      <div class="tab-contentt">
        <div id="universite">   
          <h1>Ajouter un departement</h1>
          
          <form action="${pageContext.request.contextPath}/ajoutDepartement" method="post">
          
          
            <div class="field-wrap">
              <label>
                Nom Departement<span class="req">*</span>
              </label>
              <input type="text" name="name" required autocomplete="off" />
            </div>

         

          <div class="field-wrap">
            <label>
              Description
            </label>
             <textarea rows="4" cols="50" name="description">
                     
             </textarea> 
          </div>
           <div class="field-wrap">
              <label>
                Date de Creation (mm/dd/yyyy)<span class="req"></span>
              </label>
			  <input type="text" pattern="\d{1,2}/\d{1,2}/\d{4}" class="datepicker" name="date" value="" />
            </div>
			
			<div class="field-wrap">
              <label>
                Specialisation<span class="req"></span>
              </label>
			  <input type="text"  name="specialisation" value="" />
            </div>
            	<div class="field-wrap">
			
             <select name="universite" id="universite" name="universite" required >
					<% ResultSet rs=(ResultSet) request.getAttribute("list");
					while(rs.next()) {
					%>
						<option value="<%=rs.getInt("id_universite")%>"><%=rs.getString("nom") %></option>
						<%} %>
			 </select>  
			 
			</div>
             
			 		  <div >
						<p> Aidez-nous à vous localisez </p>
		   
                 
            
		   <div id="map"></div>
		     </div>
				 <input type="hidden" name="longitude" id="lng" />
		  <input type="hidden" name="lantitude" id="lat" />
		 
		    <button type="submit" class="button button-block" id="sub">Ajouter </button>

          </form>
          
        </div>

      </div><!-- tab-content -->
      
</div> <!-- /form -->

      
		  




<script type="text/javascript"><%@include file="/Add/Add/js/jquery-1.11.0.min.js"%></script>

<script type="text/javascript"><%@include file="/Add/Add/js/index.js"%></script>
		      <script>
	  
      var map;
	  var marker= null;
      function initMap() {
	       
        map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: -34.397, lng: 150.644},
          zoom: 8
        });
		 

	
  
		google.maps.event.addListener(map, 'click', function(event) {
      
			placeMarker(event.latLng);
       });     

      }
	  
	
	  

function placeMarker(location) {
          if( marker) {
			    marker.setPosition(location);
		  }
		  else {
    marker = new google.maps.Marker({
        position: location, 
        map: map
    }); 
    $("#lng").val(marker.position.lng());
	$("#lat").val(marker.position.lat());}
			
	marker.addListener("dblclick", function() {
    marker.setMap(null);
    $("#lng").val("");
	$("#lat").val("");
});
}

$("form").submit(function(e){
	if($("#lat").val()=="") {
    e.preventDefault();
    alert("Precisez la localisation");
	}
    
});
    






		


      </script>
	  
	     
	<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAn4TQco11jEBtGI2eYNDWo42zbH01mi4U&callback=initMap"></script>  





</body>

</html>
