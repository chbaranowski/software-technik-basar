window.onload = function() {
	var newCustomerButton = document.getElementById('newCustomerButton');
	newCustomerButton.addEventListener('click', function() {
		window.location.href = 'customer-edit.html';
	}, true);
	
	var xmlHttpReq = false;
	var self = this;
	// Mozilla/Safari
	if (window.XMLHttpRequest) {
		self.xmlHttpReq = new XMLHttpRequest();
	}
	// IE
	else if (window.ActiveXObject) {
		self.xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	}
	self.xmlHttpReq.open('GET', 'cashpoint/customers', true);
	self.xmlHttpReq.onreadystatechange = function() {
	    if (self.xmlHttpReq.readyState == 4) {
	    	renderSellers(self.xmlHttpReq.responseText);
	    }
	}
	self.xmlHttpReq.send();
	
	function renderSellers(sellers){
		var customersArray = [];
		var model = eval(sellers);
		for (var row = 0; row < model.length; row++) {
			 var customer = model[row];
			 customersArray.push([customer.basarNumber, customer.name, customer.firstname]);
		}
		var parentHtmlElement = document.getElementById('customerTable');

		var demoTable = new FlexTable(parentHtmlElement, [ 'Nr.', 'Last Name', 'First Name' ], customersArray);
		demoTable.onEditClick = function(rowIndex) {
			window.location.href = 'customer-edit.html?customerId=' + rowIndex;
		};
		demoTable.onRemoveClick = function(rowIndex, customer){
			deleteCustomer(customer[0]);
		};
		demoTable.setVisible(true);
	}
}

function deleteCustomer(basarNumber){
	var xmlHttpReq = false;
	var self = this;
	// Mozilla/Safari
	if (window.XMLHttpRequest) {
		self.xmlHttpReq = new XMLHttpRequest();
	}
	// IE
	else if (window.ActiveXObject) {
		self.xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	}
	self.xmlHttpReq.open('DELETE', 'cashpoint/deleteCustomer?basarNumber=' + basarNumber, true);
	self.xmlHttpReq.onreadystatechange = function() {
	    if (self.xmlHttpReq.readyState == 4) {
	    	renderSellers(self.xmlHttpReq.responseText);
	    }
	}
	self.xmlHttpReq.send();
}