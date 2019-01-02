function pageTools(curtpage, tpage) {
	var options = {
		bootstrapMajorVersion : 3, //版本  
		currentPage : curtpage, //当前页数  
		numberOfPages : 20, //设置显示的页码数  
		totalPages : tpage, //总页数  
		alignment : "center", // 居中显示
		itemTexts : function(type, page, current) {
			switch (type) {
			case "first":
				return "首页";
			case "prev":
				return "上一页";
			case "next":
				return "下一页";
			case "last":
				return "末页";
			case "page":
				return page;
			}
		},
		onPageClicked : function(event, originalEvent, type, page) {
			getList(page); //  在页面中的方法名称。
		}
	}
	$("#pagintor").bootstrapPaginator(options); // $("#pagintor") Bootstrap 是2.X 使用div元素，3.X使用ul元素
}

function addToDB(url, data) {
	$.ajax({
		url : url,
		type : "post",
		data : data,
		success : function(data) {
			if (data.statusCode == "200") {
				alert("添加成功！");
				//location.reload();
			} else {
				alert("add error!" + data.statusMsg);
			}
		},
		error : function(data) {
			alert(JSON.stringify(data));
		}
	})
}

//获取url中的参数
function getUrlParam(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
	var r = window.location.search.substr(1).match(reg); //匹配目标参数
	if (r != null) return unescape(r[2]);
	return null; //返回参数值
}



function getCookie(key) {
    try {
        let arr = document.cookie.match(new RegExp(`(^| )${key}=([^;]*)(;|$)`));
        if (arr != null) {
            return JSON.parse(decodeURIComponent(arr[2]));
        }
    } catch (error) {
        return null;
    }
}

function setCookie(key, value) {
    try {
        let exp = new Date(),
            days = 30;
        value = JSON.stringify(value);

        exp.setTime(exp.getTime() + days * 24 * 60 * 60 * 1000)
        document.cookie = key + '=' + encodeURIComponent(value) + ';expires=' + exp.toGMTString();
    } catch (error) {
        console.error(error);
    }
}

function deleteCookie(key) {
    try {
        let exp = new Date();
        exp.setTime(exp.getTime() - 1000);

        var value = getCookie(key);
        if (value != null) {
            document.cookie = key + '=' + value + ';expires=' + exp.toGMTString();
        }
    } catch (error) {
        console.error(error);
    }
}

