//$('.carousel-3d-basic').mdbCarousel3d();
var n;
var h;

function myFunctionx() 
{
  var d = new Date();
  var weekday = new Array(7);
  weekday[0] = "Domingo";
  weekday[1] = "Lunes";
  weekday[2] = "Martes";
  weekday[3] = "Miercoles";
  weekday[4] = "Jueves";
  weekday[5] = "Viernes";
  weekday[6] = "Sabado";
  var meses = new Array(12);
  meses[0] = "Enero";
  meses[1] = "Febrero";
  meses[2] = "Marzo";
  meses[3] = "Abril";
  meses[4] = "Mayo";
  meses[5] = "Junio";
  meses[6] = "Julio";
  meses[7] = "Agosto";
  meses[8] = "Septiembre";
  meses[9] = "Octubre";
  meses[10] = "Noviembre";
  meses[11] = "Diciembre";
 
  var dia = weekday[d.getDay()];
  var m = meses[d.getMonth()];
  
  if (d.getMinutes() < 10) {h = "0" + d.getMinutes() }
  else{
	  h= d.getMinutes()
  };
  var n =d.getHours()+":"+ h +" - "+ dia +" "+d.getDate()+" "+"de  "+ m +" - "+d.getFullYear();
  document.getElementById("demo").innerHTML = n; 
  
  }
  setInterval(myFunctionx, 500);
  
  function tableC()
  {
	  var name = document.getElementById("name").value;
	  var email = document.getElementById("email").value;
	  var subject = document.getElementById("subject").value;
	  var message = document.getElementById("message").value;
	  document.getElementById("n").innerHTML=name;
	  document.getElementById("e").innerHTML=email;
	  document.getElementById("s").innerHTML=subject;
	  document.getElementById("m").innerHTML=message;
	 
  }