/**
 *
 */
function onSaveData(event) {
	event.preventDefault();
	console.log("inside");

	let firstName = document.getElementById("firstName").value.trim();
	let lastName = document.getElementById("lastName").value.trim();
	let emailId = document.getElementById("emailId").value.trim();
	let rollNo = document.getElementById("rollNo").value.trim();

	if (firstName === "") {
		alert("first name cannot be empty");
		return false;
	} else if (lastName === "") {
		alert("first lastName cannot be empty");
		return false;
	} else if (emailId === "") {
		alert("first emailId cannot be empty");
		return false;
	} else if (rollNo === "") {
		alert("first rollNo cannot be empty");
		return false;
	}

	let param = 'firstName=' + firstName + '&lastName=' + lastName + '&emailId=' + emailId + '&rollNo=' + rollNo;
	// let url="http://localhost:8080/stud/home";

	loadDoc("POST", "/stud/saveStudent", "content", param);
}



function loadDoc(method, url, id, params) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4) {
            if (this.status == 200) {
                document.getElementById(id).innerHTML = this.responseText;
                console.log("Response received and content updated.");
            } else {
                console.error('Error: ' + this.status + ' - ' + this.statusText);
            }
        }
    };
    xhttp.open(method, url, true);
    if (method === 'POST') {
        xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    }
    xhttp.send(params);
}


function onEditData(id) {
	let rollNo = id;
	loadDoc("GET", "/stud/editStudent", "content", null);
	
	loadDoc("GET", "/stud/fetchStudentData?rollNo="+rollNo, "content", null);
}

function onClickBack() {
	console.log("back function call");
	loadDoc("GET", "/stud/getStudList", "content", null);
}

function onUpdateData() {

	let firstName = document.getElementById("firstName").value.trim();
	let lastName = document.getElementById("lastName").value.trim();
	let emailId = document.getElementById("emailId").value.trim();
	let rollNo = document.getElementById("rollNo").value.trim();

	if (firstName === "") {
		alert("first name cannot be empty");
		return false;
	} else if (lastName === "") {
		alert("first lastName cannot be empty");
		return false;
	} else if (emailId === "") {
		alert("first emailId cannot be empty");
		return false;
	} else if (rollNo === "") {
		alert("first rollNo cannot be empty");
		return false;
	}

	let param = 'firstName=' + firstName + '&lastName=' + lastName + '&emailId=' + emailId + '&rollNo=' + rollNo;
	
	loadDoc("POST", "/stud/updateStudent", "content", param);
	
	alert(document.getElementById('updateData').value);
	let msg =document.getElementById('updateData').value;
	if(msg!==''){
		alert(msg);
	}
}

