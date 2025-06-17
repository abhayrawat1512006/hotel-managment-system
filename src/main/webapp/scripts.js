const contactForm = document.getElementById('contact-form');

let currentTestimonialIndex = 0;
const testimonials = document.querySelectorAll('.testimonial');
const totalTestimonials = testimonials.length;
const intervalTime = 2500; // Auto-slide interval time in milliseconds

function showTestimonial(index) {
    if (index < 0) {
        currentTestimonialIndex = totalTestimonials - 1;
    } else if (index >= totalTestimonials) {
        currentTestimonialIndex = 0;
    } else {
        currentTestimonialIndex = index;
    }

    testimonials.forEach((testimonial, i) => {
        testimonial.style.transform = `translateX(-${currentTestimonialIndex * 100}%)`;
    });
}

function autoSlide() {
    currentTestimonialIndex++;
    showTestimonial(currentTestimonialIndex);
}

// Start auto-sliding
setInterval(autoSlide, intervalTime);

// Manual navigation buttons
document.getElementById('prev-btn').addEventListener('click', () => {
    showTestimonial(currentTestimonialIndex - 1);
    resetAutoSlide();
});

document.getElementById('next-btn').addEventListener('click', () => {
    showTestimonial(currentTestimonialIndex + 1);
    resetAutoSlide();
});

// Reset the auto-slide interval when manual navigation is used
let autoSlideInterval = setInterval(autoSlide, intervalTime);

function resetAutoSlide() {
    clearInterval(autoSlideInterval);
    autoSlideInterval = setInterval(autoSlide, intervalTime);
}

contactForm.addEventListener('submit', (event) => {
    event.preventDefault();

    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;

    if (name.trim() === '' || email.trim() === '' || message.trim() === '') {
        alert('Please fill in all fields.');
        return;
    }

    if (!validateEmail(email)) {
        alert('Please enter a valid email address.');
        return;
    }

    alert('Message sent successfully!');
    contactForm.reset();
});

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}
