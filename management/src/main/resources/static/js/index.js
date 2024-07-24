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

    let param = 'firstName='+firstName+'&lastName='+lastName+'&emailId='+emailId+'&rollNo='+rollNo;
    let url="http://localhost:8080/stud/home";
    loadDoc("GET", url, "", "")
  }


function loadDoc(method, url, id, params = null) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById(id).innerHTML = this.responseText;
        } else if (this.readyState == 4) {
            // Handle errors here
            console.error('Error: ' + this.status);
        }
    };
    xhttp.open(method, url, true);
    if (method === 'POST') {
        xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    }
    xhttp.send(params);
}
