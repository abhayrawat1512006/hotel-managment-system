 ## Hotel Management System

Hotel Paradise is a modern, user-friendly web application designed to offer a seamless hotel booking experience. This website caters to travelers looking for luxury accommodations, allowing them to explore available rooms, view services, and easily book their stay. Built using Java, Servlets, JSP, HTML, CSS, and JavaScript, the application provides an interactive and visually appealing user experience.

The website leverages a robust backend for handling user data, bookings, and payment processing, ensuring a smooth and secure experience for users

## Features

- Home Page: Welcoming section with a dynamic background image and intuitive navigation
- Booking System: Streamlined booking form with real-time validation and confirmation messages
- User Authentication: Secure "Book Now" button for quick access to the booking page
- About Us & Services: Detailed descriptions of the hotel’s history and luxury services offered
- Room Gallery: Visual showcase of available rooms with descriptions and amenities
- Testimonials: Customer reviews with ratings displayed in a dynamic, rotating format
- Contact Us: Modern contact form and direct hotel contact details
- Interactive & Responsive Design: Modern animations, transitions, and fully responsive layout
- Backend Integration: Managed with Java Servlets, JSP, and secure database interactions

## Structure

```
├── .idea  
│   ├── .gitignore  
│   ├── compiler.xml  
│   ├── jarRepositories.xml  
│   ├── misc.xml  
│   ├── modules.xml  
│   ├── vcs.xml  
│   └── workspace.xml  
├── apache-tomcat-9.0.98  
│   ├── bin  
│   ├── conf  
│   ├── lib  
│   ├── logs  
│   ├── temp
│   ├── webapps
│   ├── work
│   ├── BUILDING.txt
│   ├── CONTRIBUTING.md
│   ├── LICENSE
│   ├── NOTICE
│   ├── README.md
│   ├── RELEASE-NOTES
│   └── RUNNING.txt
├── src
│   ├── main
│   │   ├── java
│   │   ├── resources
│   │   └── webapp
│   │       ├── WEN-INF
│   │       ├── booking.css
│   │       ├── booking.html
│   │       ├── booking.js
│   │       ├── hero-bg.jpg
│   │       ├── index.html
│   │       ├── logo.png
│   │       ├── room1.jpg
│   │       ├── room2.jpg
│   │       ├── room3.jpg
│   │       ├── script.js
│   │       └── style.css 
│   └── Report File.pdf
├── target
│   ├── classes
│   ├── maven-archiver
│   ├── maven-status
│   └── web-project-1.0-SNAPSHOT.war
├── test
│   ├── UserDao.java
│   ├── UserDaoImpl.java
│   ├── UserDaoTest.java
│   ├── UserService.java
│   └── UserServiceTest.java
├── Final Review.md
├── Readme.md
├── pom.xml
└── web.xml

```
## Technology Used

![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReLb6hLk5P0qkPAv4gruk0sshrS_V45qHxIQ&s) ![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6935wo8bLZh5FeafJEffqWKDOpNpx6UE5bg&s)
![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFfShxyzGCEk3mGJnhLuh1CiYyZqTu2sO6zg&s) ![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRykqUCa32TIYKkYsVpULbUcDFOeyswAFw_Rg&s)
![Logo](https://static-00.iconduck.com/assets.00/javascript-js-icon-256x256-2o2kq55k.png)

## Run Locally

Clone the project

```bash
  git clone https://github.com/SumitKM27/Hotel-Management-Sytem/
```

Go to the project directory

```bash
  cd web-project
```

Build the Project

```bash
  mvn clean install
```

Deploy on Tomcat

Copy the web-project-1.0-SNAPSHOT.war file from the target directory to the webapps directory of your local Tomcat server:
```
apache-tomcat-9.0.98
└── webapps
```
Start the Tomcat server by navigating to the apache-tomcat-9.0.98/bin directory and running:

```bash
  ./startup.sh
```
For Windows, use:

```bash
  startup.bat
```

## Documentation

Report file of the project: [Documentation](https://github.com/SumitKM27/Hotel-Management-Sytem/blob/main/src/Report%20File.pdf)
