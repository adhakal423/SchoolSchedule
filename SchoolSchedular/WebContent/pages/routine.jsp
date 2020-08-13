<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/scheduleUrl" method="POST" >

Course: <input type="text" name="courseName"><br>

Course Time: Sun <input type="checkbox" name="day" value="Sun">
Mon <input type="checkbox" name="day" value="Mon">
Tue <input type="checkbox" name="day" value="Tue">
Wed <input type="checkbox" name="day" value="Wed">
Thu <input type="checkbox" name="day" value="Thu">
Fri <input type="checkbox" name="day" value="Fri">
Sat <input type="checkbox" name="day" value="Sat">

<Select name="startTime">

<option value="8">8:00 am</option>
<option value="9">9:00 am </option>
<option value="10">10 am</option>
<option value="11">11 am</option>
<option value="12">12 pm</option>
<option value="13">13 pm</option>
<option value="14">14 pm</option>
<option value="15">15 pm</option>
<option value="16">16 pm</option>
<option value="17">17 pm</option>
<option value="18">18 pm</option>
<option value="19">19 pm</option>
<option value="20">20 pm</option>



</Select>

to 

<Select name="stopTime">

<option value="8">8:00 am</option>
<option value="9">9:00 am </option>
<option value="10">10 am</option>
<option value="11">11 am</option>
<option value="12">12 pm</option>
<option value="13">13 pm</option>
<option value="14">14 pm</option>
<option value="15">15 pm</option>
<option value="16">16 pm</option>
<option value="17">17 pm</option>
<option value="18">18 pm</option>
<option value="19">19 pm</option>
<option value="20">20 pm</option>

</Select>

<br>
<br>

<input type="submit" name="submit" value="Add" >
</form>


<TABLE border="1" cellspacing="0">
<TBODY>
<TR>
<TH align="center" valign="middle" width="80"></TH>
<TH align="center" valign="middle" width="100">Sunday</TH>
<TH align="center" valign="middle">Monday</TH>
<TH align="center" valign="middle">Tuesday</TH>
<TH align="center" valign="middle">Wednesday</TH>
<TH align="center" valign="middle">Thursday</TH>
<TH align="center" valign="middle">Friday</TH>
<TH align="center" valign="middle">Saturday</TH>
</TR>


<c:forEach begin="8" end="20" step="1" var="time" >
<TR>
<TD>

<c:if test="${time==12}">
<c:out value="${time}"></c:out>:00 pm
</c:if>

<c:if test="${time>12}">
<c:out value="${time-12}"></c:out>:00 pm
</c:if>

<c:if test="${time<12 && time>=8}">
<c:out value="${time}"></c:out>:00 am

</c:if>

</TD>


<c:forEach begin="0" end="6" step="1" var="day">

<TD  align="center" valign="middle" width="100">

<c:forEach items="${classlist}" var="clazz" >



<c:if test="${clazz.startTime<=time && clazz.stopTime>time && clazz.day==day}">


<c:out value="${clazz.courseName}"></c:out>

</c:if>
</c:forEach>



</TD>

</c:forEach>

</TR>


</c:forEach>


</TBODY>
</TABLE>

</body>
</html>