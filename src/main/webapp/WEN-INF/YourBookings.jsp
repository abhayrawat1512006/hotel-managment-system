<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bookings</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <div class="logo">Hotel Paradise</div>
    </header>
    <main>
        <h2>Your Bookings</h2>
        <c:choose>
            <c:when test="${not empty bookings}">
                <table border="1">
                    <tr>
                        <th>Booking ID</th>
                        <th>Room</th>
                        <th>Check-In</th>
                        <th>Check-Out</th>
                        <th>Status</th>
                    </tr>
                    <c:forEach var="booking" items="${bookings}">
                        <tr>
                            <td>${booking.id}</td>
                            <td>${booking.room}</td>
                            <td>${booking.checkIn}</td>
                            <td>${booking.checkOut}</td>
                            <td>${booking.status}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:when>
            <c:otherwise>
                <p>No bookings found.</p>
            </c:otherwise>
        </c:choose>
    </main>
</body>
</html>
