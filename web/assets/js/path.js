/** 请求地址 */


var Path = {
	docList : new path("/api/sdo/doc/list"),
	docInfo : new path("/api/sdo/doc/info"),
	docSave : new path( "/api/sdo/doc/save", "POST"),
	vcode : new path( "/api/sdo/user/vcode"),
	doLogin : new path( "/api/sdo/user/login/email", "POST"),
}

function path(url, method){
	this.url = url;
	this.method = method ? method : "GET";
	return this;
}