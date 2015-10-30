<!DOCTYPE html>
<html>
	<head>
		<title>SeguriDog</title>
		<style type="text/css">
        			* {
        				margin:0px;
        				padding:0px;
        			}

        			#header {
        				padding: 0;
                        margin: 0;
                        position: absolute;
                        top: 8em;
                        left: 30em;
                        width: 19em
        				font-family:Arial, Helvetica, sans-serif;
        			}

        			ul, ol {
        				list-style:none;
        			}

        			.nav > li {
        				float:left;
        			}

        			.nav li a {
        				background-color:#000;
        				color:#fff;
        				text-decoration:none;
        				padding:10px 12px;
        				display:block;
        			}

        			.nav li a:hover {
        				background-color:#434343;
        			}

        			.nav li ul {
        				display:none;
        				position:absolute;
        				min-width:140px;
        			}

        			.nav li:hover > ul {
        				display:block;
        			}

        			.nav li ul li {
        				position:relative;
        			}

        			.nav li ul li ul {
        				right:-140px;
        				top:0px;
        			}

        </style>
	</head>
	 	<body>
	 		<p align="center"><asset:image src="logotypeSeguriDog.png" alt="SeguriDog"/></p>

            <div id="header">
            			<ul class="nav">
            				<li><a href="">Inicio</a></li>
            				<li><a href="">Servicios</a>
            					<ul>
            						<li><a href="">Registro</a></li>
            						<li><a href="login.gsp">Ingreso</a></li>
            						<li><a href="">Submenu3</a></li>
            						<li><a href="">Submenu4</a>
            							<ul>
            								<li><a href="">Submenu1</a></li>
            								<li><a href="">Submenu2</a></li>
            								<li><a href="">Submenu3</a></li>
            								<li><a href="">Submenu4</a></li>
            							</ul>
            						</li>
            					</ul>
            				</li>
            				<li><a href="">Acerca de</a>
            					<ul>
            						<li><a href="">Submenu1</a></li>
            						<li><a href="">Submenu2</a></li>
            					</ul>
            				</li>
            				<li><a href="">Contacto</a></li>
            			</ul>
            </div>

            <marquee scrolldelay="100" direction="right" crollamount="8" height="600px">
                     <br /><br /><br /><br />
                     <asset:image src="rex.png" alt="SeguriDog" border="4"/>
                     <asset:image src="mono.png" alt="SeguriDog" border="4"/>
		     <br />

            </marquee>

		</body>
</html>
