<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <title>R�seau doctorants</title>
    	<meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 
Flex Template 
http://www.templatemo.com/tm-406-flex
-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
           
           
           	 <link href='${pageContext.request.contextPath}/Index/css/bootstrap.min.css' rel='stylesheet' type='text/css'>
           	  <link href='${pageContext.request.contextPath}/Index/css/font-awesome.css' rel='stylesheet' type='text/css'>
             <link href='${pageContext.request.contextPath}/Index/css/animate.css' rel='stylesheet' type='text/css'>
             <link href='${pageContext.request.contextPath}/Index/css/templatemo_misc.css' rel='stylesheet' type='text/css'>
             <link href='${pageContext.request.contextPath}/Index/css/templatemo_style.css' rel='stylesheet' type='text/css'>
             
           	 
              
                      <script src='Index/js/vendor/modernizr-2.6.1-respond-1.1.0.min.js'></script>
              
       

    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->


        <div class="site-main" id="sTop">
            <div class="site-header">
               
                <div class="main-header">
                    <div class="container">
                        <div id="menu-wrapper">
                            <div class="row">
                                <div class="logo-wrapper col-md-2 col-sm-2"> 
                                    <h1>
                                        <a href="#">Doctorants</a>
                                    </h1>
                                </div> <!-- /.logo-wrapper -->
                                <div class="col-md-10 col-sm-10 main-menu text-right">
                                    <div class="toggle-menu visible-sm visible-xs"><i class="fa fa-bars"></i></div>
                                    <ul class="menu-first">
                                        <li class="active"><a href="#">Accueil</a></li>
                                        
                                        <li><a href="#connexion">Espace doctorant</a></li>
                                        <li><a href="ajout">Inscription</a></li>                                 
                                    </ul>                                    
                                </div> <!-- /.main-menu -->
                            </div> <!-- /.row -->
                        </div> <!-- /#menu-wrapper -->                        
                    </div> <!-- /.container -->
                </div> <!-- /.main-header -->
            </div> <!-- /.site-header -->
            <div class="site-slider">
                <div class="slider">
                    <div class="flexslider">
                        <ul class="slides">
                            <li>
                                <div class="overlay"></div>
                                <img src="${pageContext.request.contextPath}/Index/images/slide1.jpg" alt="">
                                <div class="slider-caption visible-md visible-lg">
                                    <h2>Publier votre th�se</h2>
                                    <p>rendre votre recherche visible</p>
                                    <a href="#" class="slider-btn">Cliquer ici</a>
                                </div>
                            </li>
                            <li>
                                <div class="overlay"></div>
                                <img src="${pageContext.request.contextPath}/Index/images/slide2.jpg" alt="">
                                <div class="slider-caption visible-md visible-lg">
                                    <h2>Rejoindre le r�seau des doctorants</h2>
                                    <p></p>
                                    <a href="#" class="slider-btn">Cliquer ici</a>
                                </div>
                            </li>
                            <li>
                                <div class="overlay"></div>
                                <img src="${pageContext.request.contextPath}/Index/images/slide3.jpg" alt="">
                                <div class="slider-caption visible-md visible-lg">
                                    <h2>Geolocalisation</h2>
                                    <p>Effectuer des recherches sur les théses, les doctorants, ou les thémes</p>
                                    <a href="#search" class="slider-btn">Cliquer ici</a>
                                </div>
                            </li>
                        </ul>
                    </div> <!-- /.flexslider -->
                </div> <!-- /.slider -->
            </div> <!-- /.site-slider -->
        </div> <!-- /.site-main -->


  

        <div class="content-section" id="contact">
            <div class="container">
                <div class="row">
                    <div class="heading-section col-md-12 text-center">
                        <h2 id="search">Geolocalisation</h2>
                        <p>localiser les doctorants, les th�ses ou les th�mes</p>
                    </div> <!-- /.heading-section -->
                </div> <!-- /.row -->
				<div class="row">
 
  <div class="col-lg-6">
    <div class="input-group" id="fr">
      <input type="text" class="form-control"  id="searchInput" placeholder="th�me,doctorant,th�se...">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button" id="searchBtn">Rechercher</button>
      </span>
	  
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
</div><!-- /.row -->
<br><br>
				
                <div class="row">
                    <div class="col-md-12">
                       <div class="googlemap-wrapper">
                            <div id="map_canvas" class="map-canvas"></div>
                        </div> <!-- /.googlemap-wrapper -->
                    </div> <!-- /.col-md-12 -->
                </div> <!-- /.row -->
               
            </div> <!-- /.container -->
        </div> <!-- /#contact -->
            
        <div id="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-xs-12 text-left">
                        <span>Template Flex 406 &copy - Projet JEE ENSIAS </span>
                  </div> <!-- /.text-center -->
                    <div class="col-md-4 hidden-xs text-right">
                        <a href="#top" id="go-top">Back to top</a>
                    </div> <!-- /.text-center -->
                </div> <!-- /.row -->
            </div> <!-- /.container -->
        </div> <!-- /#footer -->
        
        <script src="Index/js/vendor/jquery-1.11.0.min.js"></script>
        <script src="Index/js/bootstrap.js"></script>
        <script src="Index/js/plugins.js"></script>
        <script src="Index/js/main.js"></script>

        <!-- Google Map -->
        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        <script src="Index/js/vendor/jquery.gmap3.min.js"></script>
        
        <!-- Google Map Init-->
        <script type="text/javascript">
            jQuery(function($){
                $('#map_canvas').gmap3({
                    marker:{
                        address: '37.769725, -122.462154' 
                    },
                        map:{
                        options:{
                        zoom: 15,
                        scrollwheel: false,
                        streetViewControl : true
                        }
                    }
                });

                /* Simulate hover on iPad
                 * http://stackoverflow.com/questions/2851663/how-do-i-simulate-a-hover-with-a-touch-in-touch-enabled-browsers
                 --------------------------------------------------------------------------------------------------------------*/ 
                $('body').bind('touchstart', function() {});
            });
			$( "#searchBtn" ).click(function() {
				alert();
				var Search= $("#searchInput").val();
				
				
			});
        </script>
        <!-- templatemo 406 flex -->
    </body>
</html>