<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>${pageContext.request.contextPath}</title>
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
          
          <form action="${pageContext.request.contextPath}/Add" method="post">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
                Nom<span class="req">*</span>
              </label>
              <input type="text" required autocomplete="off" />
            </div>
        
            <div class="field-wrap">
              <label>
                Prenom<span class="req">*</span>
              </label>
              <input type="text"required autocomplete="off"/>
            </div>
          </div>

          <div class="field-wrap">
            <label>
              Email Adresse<span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            <label>
              mot de passe<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off" id="pass"/>
          </div>
		  

          
		  <div class="field-wrap">
            <label>
              +212-XXX-XXXXXX<span class="req">*</span>
            </label>
            <input id="telNo" name="tel" type="tel" pattern="[\+]\d{2,3}[\-]\d{3}[\-]\d{6}" required />   
			</div>
			
			
			<div class="field-wrap">
			
             <select name="universite" id="universite" required >
						<option value="um5s">Université UM5S</option>
						<option value="uh2">Université HASSAN II</option>
						<option value="uca">Université CADI AYAD</option>
						<option value="uit">Université Ibn Tofil</option>
			 </select>  
			 
			</div>
			<p class="forgot"><a href="#">Ajouter une université ?</a></p>
			<div class="field-wrap">
             <select name="departement" required>
						<option value="um5s">Departement Informatique</option>
						<option value="uh2">Departement Physique</option>
						<option value="uca">Departement Biologie</option>
						<option value="uit">Departement Science humaines</option>
						<option value="other">Departement Histoire</option>
			 </select>  
			 
			</div>
						 <p class="forgot"><a href="#">Ajouter un Departement ?</a></p>

			<div class="field-wrap">
             <select name="labo" required>
						<option value="um5s">Laboratoire Informatique</option>
						<option value="uh2">Laboratoire Physique</option>
						<option value="uca">Laboratoire Biologie</option>
						<option value="uit">Laboratoire Science humaines</option>
				
			 </select>  
			 
			</div>
			 <p class="forgot"><a href="#">Ajouter un Laboratoire ?</a></p>

			
			
			
			
		  
		 

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
          
          <p class="forgot"><a href="#">mot de passe oublié?</a></p>
          
          <button class="button button-block"/>se connecter</button>
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->

      
		  






  			<script type="text/javascript"><%@include file="/Add/Add/js/jquery-1.11.0.min.js"%></script>

			  			<script type="text/javascript"><%@include file="/Add/Add/js/index.js"%></script>
			
	    
	  
	       <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAn4TQco11jEBtGI2eYNDWo42zbH01mi4U&callback=initMap"></script>





</body>

</html>
