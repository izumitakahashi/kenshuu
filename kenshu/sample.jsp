<%@ page contentType="text/html; charset=windows-31j" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
int count = 10;
Date startDate = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy�NMM��dd�� HH��mm��ss�b");
%>

<html>
	<head>
		<title>
			JSP�T���v���y�[�W
		</title>
	</head>
	
	<body>
		<% System.out.println("Hello World!"); %>
		
		<% for (int i = 0 ; i < count; i++){ %>
			<p><%= String.valueOf(i) %>���[�v�ڂł��B<p/>
		<% } %>
		����JSP��<%= sdf.format(startDate) %>�ɋN������܂����B
		<br>
		<br>
		
		<%-- �R�����g�P --%>
		<!-- �R�����g�Q --!>
		<%
			// �R�����g�R
			System.out.println("�R�����g�̊m�F�ł��B");
		%>
			
			
	</body>
</html>