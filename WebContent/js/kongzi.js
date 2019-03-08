function aa(){
		
		 /*var a =document.getElementById("ll").innerHTML;
		 if(a==""||a==null){
		 	 a = 0;
		 }else{
		  	$("#kk").attr("disabled","true");
		 }*/
		 
		 var b =$("#pp").val();
		 if(b==""||b==null){
			 $("#kk").attr("disabled","true");
			// document.getElementById("kk").disabled=true;
		 }
	}
	function laa(){
		 var a =document.getElementById("ll").innerHTML;
		var b =$("#pp").val();
		 if(b==""||b==null||a==1){
			 $("#kk").attr("disabled","true");
			// document.getElementById("kk").disabled=true;
		 }else{
			 $("#kk").removeAttr("disabled");
		 }
		//	$("#kk").removeAttr("disabled");
	} 
	