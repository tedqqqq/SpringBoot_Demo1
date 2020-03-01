<!-- <%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <marquee><p style="font-size: 100px">Hello JSP!!</p>
      <img src="${pageContext.servletContext.contextPath}/doge.gif">
  </marquee>

</body>
</html> -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
#div1{
position: absolute;left: 40%
}
</style>
<br>
<br>
<body>
<div id="div1">
请输入姓名：<input id="name" type="text"> <br><br>
请输入id号：<input id="id" type="number"><br><br>
请选择创建房间的类型：<select id="ty">
    <option value="conference">会议房间</option>
    <option value="presentation">演示房间</option>
    <option value="interview">面试房间</option>
</select><br><br>
请输入房间的最大人数：<input type="number" id="maxNum"> <br><br>
<button onclick="createRoom()" >老师创建自定义房间</button>
<br>
<br>
<!-- 请选择要进入的房间号：<input id="num" type="number">
<br>
<br>
<button οnclick="addToRoom()" >老师加入公共房间</button>-->
请选择要进入的房间号：<input id="num" type="number">
<button onclick="addToRoom()" >学生加入房间</button>
</div> 





</body>
<script
 src="http://code.jquery.com/jquery-latest.js"></script>

<script type="text/javascript">
    function addToRoom(){

        var dto = {
                id:$("#id").val(),
                fname:$("#name").val(),
                roomId:$("#num").val()
        }
        $.post("/op/testHashCode",dto,function(data){     
            window.location.href="http://192.168.0.25:5080/openmeetings/hash?secure="+data.message;
            console.log("http://192.168.0.25:5080/openmeetings/hash?secure="+data.message);
        },"json")


    }

      



function createRoom(){

        var dto = {
                id:$("#id").val(),
                fname:$("#name").val(),
                ty:$("#ty").val(),
                num:$("#maxNum").val()
        }
  
        $.post("/op/customizeRoom",dto,function(data){   
            
           window.location.href="http://192.168.0.25:5080/openmeetings/hash?secure="+data.message;
           alert("跳转页面  "+"http://192.168.0.25:5080/openmeetings/hash?secure="+data.message)
          
        },"json")
//            $.ajax({
//         type:"POST",
//         url:"/op/customizeRoom",
//         data:dto, 
//         dataType: "json",
//         contentType: "application/json; charset=utf-8",
//         success:function(data) {
//             var recordlist=data;
//             console.log(data.message)
//             /* $("#edit_customerName").val(data.cust_name); */    
//         },
//         error: function(){
//              console.log('error');

//         }
//         
//     });


    }

</script>
</html>
