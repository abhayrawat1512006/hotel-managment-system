
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forwarding to booking JSP page
        request.getRequestDispatcher("/booking.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieving form data
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String checkInDate = request.getParameter("checkInDate");
        String checkOutDate = request.getParameter("checkOutDate");

        // Basic validation
        if (fullName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || checkInDate.isEmpty() || checkOutDate.isEmpty()) {
            request.setAttribute("errorMessage", "All fields are required!");
            request.getRequestDispatcher("/booking.jsp").forward(request, response);
        } else {
            // Process booking (for simplicity, just forward to success page)
            request.setAttribute("successMessage", "Thank you for booking with us, " + fullName + "!");
            request.setAttribute("bookingDetails", "Check-in: " + checkInDate + ", Check-out: " + checkOutDate);
            request.getRequestDispatcher("/bookingSuccess.jsp").forward(request, response);
        }
    }
}
