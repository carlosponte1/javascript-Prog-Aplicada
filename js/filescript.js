var reader = new FileReader();
var fileInput;
//var fileDisplayArea;
var file;
var txt;
var upper= [];
var cel= [];
var xArr;
window.onload = function() {
   fileInput = document.getElementById('fileInput');
   fileDisplayArea = document.getElementById('fileDisplayArea');
   
   fileInput.addEventListener('change', function(e) {
     file = fileInput.files[0];    
       reader.onload = function(e) {
          //fileDisplayArea.innerText = reader.result;       
            txt=reader.result;        
      }
         reader.readAsText(file);
        });        
}

function separaR(value){
  
   xArr = value.split(/[=;]/)   
  for (var z = 0; z < xArr.length; z += 2) {
    upper.push(xArr[z]);
      xArr[z+1] && cel.push(xArr[z + 1]);
  }  
}
  
function  CargarClientes(){
  
   separaR(txt);   
    // Obtener la referencia del elemento render
    var body = document.getElementsByTagName("render")[0];
    // Crea un elemento <table> y un elemento <tbody>
    var tabla   = document.createElement("table");
    var tblBody = document.createElement("tbody");
    // Crea las celdas
      // Crea las hileras de la tabla
      var hilera = document.createElement("tr");
      var hilera1 = document.createElement("tr");
      
      for (var j = 0; j < upper.length; j++) { 
        //Crea un elemento <td> y un nodo de texto, haz que el nodo de
        //texto sea el contenido de <td>, ubica el elemento <td> al final
        // de la hilera de la tabla
       
        var celda = document.createElement("th");
        var textoCelda = document.createTextNode(upper[j]);
       var celda1 = document.createElement("td");
       var tdataCelda = document.createTextNode(cel[j]);
        celda.appendChild(textoCelda);
        hilera.appendChild(celda);
        celda1.appendChild(tdataCelda);
        hilera1.appendChild(celda1);    
      }

      // agrega la hilera al final de la tabla 
        tblBody.appendChild(hilera);
        tblBody.appendChild(hilera1);
        upper= [];
		cel= [];
     
    // posiciona el <tbody> debajo del elemento <table>
    tabla.appendChild(tblBody);
    // appends <table> into <body>
    body.appendChild(tabla);
    // modifica el atributo  de la tabla 
    tabla.setAttribute("class", "table");
	celda.setAttribute("scope","col"); 
	
  }
  
  $('.carousel-3d-basic').mdbCarousel3d();
  
   

