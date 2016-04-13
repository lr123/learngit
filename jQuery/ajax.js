
	function createXMLHttpReq(){
		if(window.XMLHttpRequest){
			return new XMLHttpRequest;
		}else if(window.ActiveXObject){
			var aVersions = ["MSXML2.XMLHttp.6.0","MSXML2.XMLHttp.5.0","MSXML2.XMLHttp.4.0",
			"MSXML2.XMLHttp.3.0","MSXML2.XMLHttp","Microsoft.XMLHttp"];
			for(var i = 0; i < aVersions.length; i++){
				try{
					var xhr = new ActiveXObject(aVersions[i]);
					return xhr;
				}catch(oError){
					
				}
			}
		}
		throw new Error("不能创建XMLHttpRequest对象。");
	}