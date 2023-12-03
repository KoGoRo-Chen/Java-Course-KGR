<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/WEB-INF/view/Header.jsp" %>
<div class="mx-5 mt-5">
<form method = "post" action="./page1" onsubmit="return check();">
<h4 class="fw-bold text-center">假單申請</h4>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email address</label>
  <input type="email" class="form-control" id="email" name="email"  placeholder="name@example.com">
<!-- id給前端看 name給後端看  -->
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
</div>
<div class="d-flex justify-content-center">
<button type="submit" class="btn btn-primary mx-2"  value="Submit">提交</button>
<button type="reset" class="btn btn-success mx-2"  value="Reset">清除</button>
</div>
</form>
</div>



<<script>
function check() {
	let email = $("#email").val();
	
	if(email == ''){
		alert("email沒有填寫");
	}
	console.log("執行Check()" + email);
	return false;
	
}
</script>
    
    <%@ include file="/WEB-INF/view/Footer.jsp" %>