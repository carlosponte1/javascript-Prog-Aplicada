var data 
//funcion para capturar datos -- Mala practica repetir la funcion
 function selecData() 
 {  
    
    document.getElementById("b1").onclick = function() 
	{   
	
	 data = document.getElementById("tpof1").value;
	
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	document.getElementById("b2").onclick = function()
	{   
	
	 data = document.getElementById("tpof2").value;
	
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	document.getElementById("b3").onclick = function()
	{   
	
	 data = document.getElementById("tpof3").value;
	
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	document.getElementById("b4").onclick = function()
	{   
	
	 data = document.getElementById("tpof4").value;
	 
	 
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	
	document.getElementById("b5").onclick = function()
	{   
	
	var data1;
	
	document.getElementById("resp").innerHTML = data1 + " es un dato tipo : " + Mi_Funcion(data1)
    }
	//especifico para Object Array
	document.getElementById("b6").onclick = function()
	{   
	
	  var dataArray = document.getElementById("tpof6").value;
	  var res = dataArray.split(" ");
	  
	 dataArray = document.getElementById("resp").innerHTML =  "[" + res +"]"+ Mi_Funcion(res)
	
	
	
    }
	// especifico para tipo funcion
	document.getElementById("b7").onclick = function()
	{   
	
	    var dataF = document.getElementById("tpof7").value;
	    var dataFun = dataF.toLowerCase;
	  


	  
	 dataArray = document.getElementById("resp").innerHTML =  "[" + dataF +"]"+ Mi_Funcion(dataFun)
	
	
	
    }

	 
	
 }  

// Funcion para validar el tipo de dato que se guarda
function Mi_Funcion(value) { 
    if(value === "")
        return " ";
    else if(value === "true"  || value === "false")
        return "boolean";
    else if(!Number.isNaN(Number(value)))
        return "number";
	else if(value === "Null")
        return "Null";
    else
        return typeof value;  
}

function justArray(){
	
}
//Funcion para limpiar inputs
function rst() {
  document.getElementById("formAct2").reset();
  
}
