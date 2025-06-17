document.getElementById('booking-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const checkInDate = document.getElementById('check-in').value;
    const checkOutDate = document.getElementById('check-out').value;
    const guests = document.getElementById('guests').value;
    const roomType = document.getElementById('room-type').value;
    const phone = document.getElementById('phone').value;
    const email = document.getElementById('email').value;

    if (!checkInDate || !checkOutDate || !guests || !roomType || !phone || !email) {
        alert('Please fill in all fields.');
        return;
    }

    if (new Date(checkInDate) >= new Date(checkOutDate)) {
        alert('Check-out date must be after the check-in date.');
        return;
    }

    if (!validateEmail(email)) {
        alert('Please enter a valid email address.');
        return;
    }

    showConfirmationModal();
    this.reset();
});

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}

function showConfirmationModal() {
    document.getElementById('confirmation-modal').style.display = 'block';
}

function closeModal() {
    document.getElementById('confirmation-modal').style.display = 'none';
}
