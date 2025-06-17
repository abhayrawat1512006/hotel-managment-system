import java.util.*;
import java.math.BigDecimal;
import java.sql.Date;

public class Paradise {

    public static class User {
        private int id;
        private String fullName;
        private String email;
        private String phoneNumber;
        private String password;

        public User(int id, String fullName, String email, String phoneNumber, String password) {
            this.id = id;
            this.fullName = fullName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.password = password;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class Room {
        private int roomId;
        private String roomType;
        private BigDecimal pricePerNight;
        private boolean availability;

        public Room(int roomId, String roomType, BigDecimal pricePerNight, boolean availability) {
            this.roomId = roomId;
            this.roomType = roomType;
            this.pricePerNight = pricePerNight;
            this.availability = availability;
        }

        // Getters and Setters
        public int getRoomId() {
            return roomId;
        }

        public void setRoomId(int roomId) {
            this.roomId = roomId;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public BigDecimal getPricePerNight() {
            return pricePerNight;
        }

        public void setPricePerNight(BigDecimal pricePerNight) {
            this.pricePerNight = pricePerNight;
        }

        public boolean isAvailability() {
            return availability;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }
    }

    public static class Booking {
        private int bookingId;
        private int userId;
        private int roomId;
        private Date checkInDate;
        private Date checkOutDate;
        private BigDecimal totalPrice;

        public Booking(int bookingId, int userId, int roomId, Date checkInDate, Date checkOutDate, BigDecimal totalPrice) {
            this.bookingId = bookingId;
            this.userId = userId;
            this.roomId = roomId;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.totalPrice = totalPrice;
        }

        // Getters and Setters
        public int getBookingId() {
            return bookingId;
        }

        public void setBookingId(int bookingId) {
            this.bookingId = bookingId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getRoomId() {
            return roomId;
        }

        public void setRoomId(int roomId) {
            this.roomId = roomId;
        }

        public Date getCheckInDate() {
            return checkInDate;
        }

        public void setCheckInDate(Date checkInDate) {
            this.checkInDate = checkInDate;
        }

        public Date getCheckOutDate() {
            return checkOutDate;
        }

        public void setCheckOutDate(Date checkOutDate) {
            this.checkOutDate = checkOutDate;
        }

        public BigDecimal getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(BigDecimal totalPrice) {
            this.totalPrice = totalPrice;
        }
    }
}
