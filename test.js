


 function selecData()
 {  
    if()
    document.getElementById("b1").onclick = function() 
	{   
	
	var data = document.getElementById("tpof1").value;
	
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	document.getElementById("b2").onclick = function()
	{   
	
	var data = document.getElementById("tpof2").value;
	
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	document.getElementById("b3").onclick = function()
	{   
	
	var data = document.getElementById("tpof3").value;
	
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	document.getElementById("b4").onclick = function()
	{   
	
	var data = document.getElementById("tpof4").value;
	
	document.getElementById("resp").innerHTML = data + " es un dato tipo : " + Mi_Funcion(data)
    }
	
	document.getElementById("b5").onclick = function()
	{   
	
	var data1;
	
	document.getElementById("resp").innerHTML = data1 + " es un dato tipo : " + Mi_Funcion(data1)
    }
	 
 }  

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

function validate(){
    var form = document.getElementById('formAct2');
    if (form.tpof1.value.indexOf("A") === 0) {
        alert("Test");
    } else {
        form.tpof1.focus();   
    }
}

function rst() {
  document.getElementById("formAct2").reset();
}
