$(function()){
	$("#fname_error_message").hide();
	$("#lname_error_message").hide();
	$("#uname_error_message").hide();
	$("#email_error_message").hide();
	$("#address_error_message").hide();
	$("#address2_error_message").hide();

	var error_fname = false;
	var error_lname = false;
	var error_uname = false;
	var error_email = false;
	var error_address = false;
	var error_address2 = false;

	$('#fname').focusout(function(){
		check_fname();
	});
	$('#lname').focusout(function(){
		check_lname();
	});
	$('#uname').focusout(function(){
		check_uname();
	});
	$('#email').focusout(function(){
		check_email();
	});
	$('#address').focusout(function(){
		check_address();
	});
	$('#address2').focusout(function(){
		check_address2();
	});

	function check_fname() {
		var fname_length = $('#fname').val().length;

		if(fname_length == 0){
			$("#fname_error_message").text("This field is not required")
			$("#fname_error_message").show();
			error_fname = true;
		}
		else if(fname_length > 0 && (fname_length < 5 || fname_length > 20)){
			$("#fname_error_message").html("Should be between 5-20 characters");
			$("#fname_error_message").show();
			error_fname = true;
		}
		else{
			$("#fname_error_message").hide();
		}
	}

	
}