/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener('load', function () {
   document.getElementById('btniniciar').addEventListener('click', function (){
       var identificacion = document.getElementById('txtcc').value;
       var pass = document.getElementById('txtcontrasena').value;
       
       var bandera = false;
       
       if(identificacion.length > 0 && pass.length > 0){
           bandera = true;           
       }
       
       if(bandera){
           document.getElementById('forminicio').submit();
       }else{
           alert('Llene todos los campos');
       }    
    
   });
});
