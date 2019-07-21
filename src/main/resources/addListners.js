 var disable=false;
 document.addEventListener("click", function() {
	 if(!disable){
		 disable=true;
		 download("action.json",event.target.tagName)
	 }
 })
 document.addEventListener("copy", function() {
	 if(!disable){
		 disable=true;
		 download("action.json",event.target.tagName)
	 }
 }) 

 function download(filename,text) {
            var element = document.createElement('a');
            element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(text));
            element.setAttribute('download', filename);
            element.style.display = 'none';
            document.body.appendChild(element);
            element.click();
            document.body.removeChild(element);
 }
