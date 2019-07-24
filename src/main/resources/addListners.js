 var disable=false;
 document.addEventListener("click", function() {
	 if(!disable){
		 disable=true;
		 getAllDataRequire(event.target,'click')
	 }
 })
 document.addEventListener("copy", function() {
	 if(!disable){
		 disable=true;
		 getAllDataRequire(event.target,'copy')
	 }
 }) 
  document.addEventListener("input", function() {
	 if(!disable){
		 disable=true;
		 getAllDataRequire(event.target,'input')
	 }
 }) 
 
  document.addEventListener("search", function() {
	 if(!disable){
		 disable=true;
		 getAllDataRequire(event.target,'search')
	 }
 }) 
 
 
 
 
 function getAllDataRequire(baseElement,action){
	 var requireData='"action":"'+action+'",'
	 requireData=requireData+'"tagName":"'+baseElement.tagName+'",'
	 requireData=requireData+'"id":"'+baseElement.id+'",'
	 requireData=requireData+'"classList":"'+baseElement.classList+'",'
	 requireData=requireData+'"innerHTML":"'+baseElement.inputHTML+'",'
	 requireData=requireData+'"clientHeight":"'+baseElement.clientHeight+'",'
	 requireData=requireData+'"clientWidth":"'+baseElement.clientWidth+'",'
	 requireData=requireData+'"innerText":"'+baseElement.innerText+'"'
	 //requireData=requireData+'"html":"'+document.body.innerHTML+'"'
	 requireData='{'+requireData+'}'
	 download("action.json",requireData)
	 //return '{"html":"'+baseElement.innerHTML+"}';
 }

 function download(filename,text) {
            var element = document.createElement('a');
            element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(text));
            element.setAttribute('download', filename);
            element.style.display = 'none';
            document.body.appendChild(element);
            element.click();
            document.body.removeChild(element);
 }
