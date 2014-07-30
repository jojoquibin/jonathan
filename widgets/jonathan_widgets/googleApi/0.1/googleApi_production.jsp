<html>
<head>
<title></title>
</head>
<body>
<%
	WbdProductionHelper helper = null;
	JspHelper jh = null;
	String snippetVar_myProperty;
	String snippetVar_thisNavpoint;
%>
<!--START-->
<script
src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM&sensor=false">
</script>
<script>
var myCenter=new google.maps.LatLng(%%myLatitude%%,%%myLongtitude%%);

function initialize()
{
var mapProp = {
  center:myCenter,
  zoom:%%myZoom%%,
  mapTypeId:google.maps.MapTypeId.%%myTypeid%%
  };

var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker=new google.maps.Marker({
  position:myCenter,
  icon:'/ttsvr/jonathan/images/twist_logo.png'
  });

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script>

<div id="googleMap" style="width:%%myWidth%%;height:%%myHeight%%;"></div>
<!--END-->
</body>
</html>
