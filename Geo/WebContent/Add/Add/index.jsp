<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="java.sql.ResultSet"%>
    
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Inscription - Geolocalisation </title>
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
        <li class="tab active"><a href="#signup">Inscription</a></li>
        <li class="tab"><a href="#login">Connexion</a></li>
      </ul>
      
      <div class="tab-content">
        <div id="signup">   
          <h1>Rejoindre le réseau des doctorants</h1>
          
          <form action="${pageContext.request.contextPath}/ajout" method="post">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
                Nom<span class="req">*</span>
              </label>
              <input type="text"  name="name" required autocomplete="off" />
            </div>
        
            <div class="field-wrap">
              <label>
                Prenom<span class="req">*</span>
              </label>
              <input type="text" name="prenom" required autocomplete="off"/>
            </div>
          </div>

          <div class="field-wrap">
            <label>
              Email Adresse<span class="req">*</span>
            </label>
            <input type="email" name="email" required autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            <label>
              mot de passe<span class="req">*</span>
            </label>
            <input type="password" name="password" required autocomplete="off" id="pass"/>
          </div>
		  

          
		  <div class="field-wrap">
            <label>
              +212-XXX-XXXXXX<span class="req">*</span>
            </label>
            <input id="telNo" name="tel" type="tel" pattern="[\+]\d{2,3}[\-]\d{3}[\-]\d{6}" required />   
			</div>
			
			
			<div class="field-wrap">
			
             <select name="universite" id="universitee" required >
							<% ResultSet rs=(ResultSet) request.getAttribute("list");
					while(rs.next()) {
					%>
						<option value="<%=rs.getInt("id_universite")%>"><%=rs.getString("nom") %></option>
						<%} %>
			 </select>  
			 
			</div>
			<p class="forgot"><a href="ajoutUniversite">Ajouter une université ?</a></p>
			<div class="field-wrap">
             <select name="departement" id="departement" required>
					
			 </select>  
			 
			</div>
						 <p class="forgot"><a href="ajoutDepartement">Ajouter un Departement ?</a></p>

			<div class="field-wrap">
             <select name="labo" id="labo" required>
						
				
			 </select>  
			 
			</div>
			 <p class="forgot"><a href="ajoutLaboratoire">Ajouter un Laboratoire ?</a></p>

			
			
			
			
		  
		 

		    <button type="submit" class="button button-block" id="sub"/>Inscrivez-vous </button>

          </form>
          
        </div>
        
        <div id="login">   
          <h1>Bienvenue !</h1>
          
          <form action="/" method="post">
          
            <div class="field-wrap">
            <label>
              Email Adresse<span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off"  />
          </div>
          
          <div class="field-wrap">
            <label>
              mot de passe<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off" />
          </div>
          
          <p class="forgot"><a href="#">mot de passe oublié ?</a></p>
          
          <button class="button button-block"/>se connecter</button>
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->

      
		  






  			<script type="text/javascript"><%@include file="/Add/Add/js/jquery-1.11.0.min.js"%></script>

			  			<script type="text/javascript"><%@include file="/Add/Add/js/index.js"%></script>
			
			
	    
	  
	       <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAn4TQco11jEBtGI2eYNDWo42zbH01mi4U&callback=initMap"></script>

		<script>
		$("#universitee").change(function(){
			
			var id_universite= $("#universitee").val();
			$.ajax({
				type: 'POST',
				data : {id_universite: id_universite},
				url : 'AjaxInsert',
				success : function(result){
					$('#departement').html("");
					$('#labo').html("");
					$('#departement').append(result);
					$('#departement').change();
				}
				
			});
		});
			
			$("#departement").change(function(){
				
				var id_departement= $("#departement").val();
				if(id_departement != null) {
				$.ajax({
					type: 'POST',
					data : {id_departement: id_departement},
					url : 'AjaxInsert2',
					success : function(result){
						$('#labo').html("");
						$('#labo').append(result);
					}
					
				});
				}
			
			
			 
		});
		
		$( document ).ready(function() {
			
			var id =$("#universitee").val();
			$.ajax({
				type: 'POST',
				data : {id_universite: id},
				url : 'AjaxInsert',
				success : function(result){
					$('#departement').append(result);
				}
				
			});
			
			id =1;
			$.ajax({
				type: 'POST',
				data : {id_departement: id},
				url : 'AjaxInsert2',
				success : function(result){
					$('#labo').html("");
					$('#labo').append(result);
				}
				
			});
			
		});

		
		
		</script>




</body>

</html>
